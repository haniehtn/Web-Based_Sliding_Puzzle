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
public class Level15 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves15, moveless15=1000000000;
    private myTimer timer15;
    private long time15,timeless15=1000000000;
    private String colors15[][] = new String[][]{
            {"#ffc0cb", "red", "red", "red", "red"},
            {"orange", "#ffc0cb", "blue", "blue", "blue"},
            {"#ffc0cb", "orange", "blue", "orange", "blue"},
            {"orange", "#ffc0cb", "blue", "blue", "blue"},
            {"#ffc0cb", "red", "red", "red", "red"}
    };
    private String[][] baseColors15 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors15[][] = new String[][]{
                {"#ffc0cb", "red", "red", "red", "red"},
                {"orange", "#ffc0cb", "blue", "blue", "blue"},
                {"#ffc0cb", "orange", "blue", "orange", "blue"},
                {"orange", "#ffc0cb", "blue", "blue", "blue"},
                {"#ffc0cb", "red", "red", "red", "red"}
        };
        final String endcolors15[][] = new String[][]{
                {"red", "orange", "blue", "orange", "red"},
                {"red", "red", "blue", "red", "red"},
                {"#ffc0cb", "#ffc0cb", "#ffc0cb", "#ffc0cb", "#ffc0cb"},
                {"blue", "blue", "orange", "blue", "blue"},
                {"red", "blue", "orange", "blue", "red"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors15, 0);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors15, 1);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors15, 2);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors15, 3);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors15, 4);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors15, 0);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors15, 1);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors15, 2);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors15, 3);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors15, 4);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors15, 4);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors15, 3);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors15, 2);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors15, 1);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors15, 0);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors15, 4);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors15, 3);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors15, 2);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors15, 1);
            baseColors15 = colors15;
            moves15++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors15, 0);
            baseColors15 = colors15;
            moves15++;
        } else if (request.getParameter("s49") != null) {//start
            timer15 = new myTimer();
            moves15 = 0;
            win=false;
            baseColors15 = primarycolors15;
            colors15 = primarycolors15;
        } else if (request.getParameter("s50") != null) {//restart
            timer15 = new myTimer();
            moves15 = 0;
            win=false;
            baseColors15 = primarycolors15;
            colors15 = primarycolors15;


        }


        HttpSession session = request.getSession();
        if(!win) time15=timer15.getElapsedTime();
        session.setAttribute("Colors", baseColors15);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors15, endcolors15)) {
            userData= UUID.randomUUID().toString();
            win=true;
            if(timeless15>time15){
                timeless15=time15;
            }
            if(moveless15>moves15 &&moves15!=0) {
                moveless15 = moves15;
            }
            try {
                udata= Database.setMoveTime(15,moveless15,timeless15);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves15);
        request.setAttribute("time","Time used:"+time15+"miliseconds");
        request.getRequestDispatcher("Game15.jsp").forward(request, response);
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}