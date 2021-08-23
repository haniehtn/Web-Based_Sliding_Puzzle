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
public class Level4 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves4, moveless4=1000000000;
    private myTimer timer4;
    private long time4,timeless4=1000000000;
    private String colors4[][] = new String[][]{
            {"orange", "blue", "orange", "orange", "blue"},
            {"orange", "orange", "blue", "orange", "orange"},
            {"blue", "orange", "orange", "blue", "orange"},
            {"orange", "blue", "orange", "orange", "blue"},
            {"blue", "orange", "blue", "orange", "orange"}
    };
    private String[][] baseColors4 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors4[][] = new String[][]{
                {"orange", "blue", "orange", "orange", "blue"},
                {"orange", "orange", "blue", "orange", "orange"},
                {"blue", "orange", "orange", "blue", "orange"},
                {"orange", "blue", "orange", "orange", "blue"},
                {"blue", "orange", "blue", "orange", "orange"}
        };
        final String endcolors4[][] = new String[][]{
                {"orange", "orange", "orange", "orange", "orange"},
                {"orange", "blue", "orange", "blue", "orange"},
                {"orange", "orange", "orange", "orange", "orange"},
                {"blue", "orange", "orange", "orange", "blue"},
                {"blue", "blue", "blue", "blue", "blue"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors4, 0);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors4, 1);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors4, 2);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors4, 3);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors4, 4);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors4, 0);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors4, 1);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors4, 2);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors4, 3);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors4, 4);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors4, 4);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors4, 3);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors4, 2);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors4, 1);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors4, 0);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors4, 4);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors4, 3);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors4, 2);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors4, 1);
            baseColors4 = colors4;
            moves4++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors4, 0);
            baseColors4 = colors4;
            moves4++;
        } else if (request.getParameter("s27") != null) {//start
            timer4 = new myTimer();
            moves4 = 0;
            win=false;
            baseColors4 = primarycolors4;
            colors4 = primarycolors4;
        } else if (request.getParameter("s28") != null) {//restart
            timer4 = new myTimer();
            moves4 = 0;
            win=false;
            baseColors4 = primarycolors4;
            colors4 = primarycolors4;


        }

        HttpSession session = request.getSession();
        if(!win) time4=timer4.getElapsedTime();
        session.setAttribute("Colors", baseColors4);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors4, endcolors4)) {
            win=true;
            userData= UUID.randomUUID().toString();
            if(timeless4>time4){
                timeless4=time4;
            }
            if(moveless4>moves4 &&moves4!=0) {
                moveless4 = moves4;
            }
            try {
                udata= Database.setMoveTime(4,moveless4,timeless4);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves4);
        request.setAttribute("time","Time used:"+time4+"miliseconds");
        request.getRequestDispatcher("Game4.jsp").forward(request, response);
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}