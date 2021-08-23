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
public class Level10 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves10, moveless10=1000000000;
    private myTimer timer10;
    private long time10,timeless10=1000000000;
    private String colors10[][] = new String[][]{
            {"blue", "blue", "blue", "blue", "blue"},
            {"orange", "orange", "orange", "orange", "orange"},
            {"lime", "lime", "lime", "lime", "lime"},
            {"red", "red", "red", "red", "red"},
            {"purple", "purple", "purple", "purple", "purple"}
    };
    private String[][] baseColors10 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors10[][] = new String[][]{
                {"blue", "blue", "blue", "blue", "blue"},
                {"orange", "orange", "orange", "orange", "orange"},
                {"lime", "lime", "lime", "lime", "lime"},
                {"red", "red", "red", "red", "red"},
                {"purple", "purple", "purple", "purple", "purple"}
        };
        final String endcolors10[][] = new String[][]{
                {"purple", "purple", "purple", "purple", "purple"},
                {"red", "red", "red", "red", "red"},
                {"lime", "lime", "lime", "lime", "lime"},
                {"orange", "orange", "orange", "orange", "orange"},
                {"blue", "blue", "blue", "blue", "blue"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors10, 0);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors10, 1);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors10, 2);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors10, 3);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors10, 4);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors10, 0);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors10, 1);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors10, 2);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors10, 3);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors10, 4);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors10, 4);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors10, 3);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors10, 2);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors10, 1);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors10, 0);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors10, 4);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors10, 3);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors10, 2);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors10, 1);
            baseColors10 = colors10;
            moves10++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors10, 0);
            baseColors10 = colors10;
            moves10++;
        } else if (request.getParameter("s39") != null) {//start
            timer10 = new myTimer();
            moves10 = 0;
            win=false;
            baseColors10 = primarycolors10;
            colors10 = primarycolors10;
        } else if (request.getParameter("s40") != null) {//restart
            timer10 = new myTimer();
            moves10 = 0;
            win=false;
            baseColors10 = primarycolors10;
            colors10 = primarycolors10;


        }


        HttpSession session = request.getSession();
        if(!win) time10=timer10.getElapsedTime();
        session.setAttribute("Colors", baseColors10);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors10, endcolors10)) {
            win=true;
            userData= UUID.randomUUID().toString();
            if(timeless10>time10){
                timeless10=time10;
            }
            if(moveless10>moves10 &&moves10!=0) {
                moveless10 = moves10;
            }
            try {
                udata= Database.setMoveTime(10,moveless10,timeless10);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves10);
        request.setAttribute("time","Time used:"+time10+"miliseconds");
        request.getRequestDispatcher("Game10.jsp").forward(request, response);
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}