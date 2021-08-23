package servlet.levels;

import layer.pl.PLException;
import layer.pl.UserDataBean;
import servlet.Database;
import servlet.Move;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Level7 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves7, moveless7=1000000000;
    private myTimer timer7;
    private long time7,timeless7=1000000000;
    private String colors7[][] = new String[][]{
            {"lime", "blue", "blue", "blue", "lime"},
            {"blue", "lime", "lime", "lime", "blue"},
            {"blue", "lime", "orange", "lime", "blue"},
            {"blue", "lime", "lime", "lime", "blue"},
            {"lime", "blue", "blue", "blue", "lime"}
    };
    private String[][] baseColors7 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primaryColors7[][] = new String[][]{
                {"lime", "blue", "blue", "blue", "lime"},
                {"blue", "lime", "lime", "lime", "blue"},
                {"blue", "lime", "orange", "lime", "blue"},
                {"blue", "lime", "lime", "lime", "blue"},
                {"lime", "blue", "blue", "blue", "lime"}
        };
        final String endcolors7[][] = new String[][]{
                {"blue", "lime", "lime", "lime", "blue"},
                {"lime","blue", "blue", "blue", "lime"},
                {"lime", "blue", "orange", "blue", "lime"},
                {"lime", "blue", "blue", "blue", "lime"},
                {"blue", "lime", "lime", "lime", "blue"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors7, 0);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors7, 1);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors7, 2);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors7, 3);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors7, 4);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors7, 0);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors7, 1);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors7, 2);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors7, 3);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors7, 4);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors7, 4);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors7, 3);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors7, 2);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors7, 1);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors7, 0);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors7, 4);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors7, 3);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors7, 2);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors7, 1);
            baseColors7 = colors7;
            moves7++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors7, 0);
            baseColors7 = colors7;
            moves7++;
        } else if (request.getParameter("s33") != null) {//start
            timer7 = new myTimer();
            moves7 = 0;
            win=false;
            baseColors7 = primaryColors7;
            colors7 = primaryColors7;
        } else if (request.getParameter("s34") != null) {//restart
            timer7 = new myTimer();
            moves7 = 0;
            win=false;
            baseColors7 = primaryColors7;
            colors7 = primaryColors7;


        }


        HttpSession session = request.getSession();
        if(!win) time7=timer7.getElapsedTime();
        session.setAttribute("Colors", baseColors7);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors7, endcolors7)) {
            win=true;
            userData= UUID.randomUUID().toString();
            if(timeless7>time7){
                timeless7=time7;
            }
            if(moveless7>moves7 &&moves7!=0) {
                moveless7 = moves7;
            }
            try {
                udata= Database.setMoveTime(7,moveless7,timeless7);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves7);
        request.setAttribute("time","Time used:"+time7+"miliseconds");
        request.getRequestDispatcher("Game7.jsp").forward(request, response);
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}