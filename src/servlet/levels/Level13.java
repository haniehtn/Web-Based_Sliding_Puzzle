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
public class Level13 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves13, moveless13=1000000000;
    private myTimer timer13;
    private long time13,timeless13=1000000000;
    private String colors13[][] = new String[][]{
            {"red", "blue", "blue", "blue", "red"},
            {"orange", "lime", "lime", "lime", "orange"},
            {"blue", "lime", "blue", "purple", "blue"},
            {"orange", "purple", "purple", "purple", "orange"},
            {"red", "blue", "blue", "blue", "red"}
    };
    private String[][] baseColors13 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors13[][] = new String[][]{
                {"red", "blue", "blue", "blue", "red"},
                {"orange", "lime", "lime", "lime", "orange"},
                {"blue", "lime", "blue", "purple", "blue"},
                {"orange", "purple", "purple", "purple", "orange"},
                {"red", "blue", "blue", "blue", "red"}
        };
        final String endcolors13[][] = new String[][]{
                {"blue", "orange", "orange", "orange", "blue"},
                {"lime", "blue", "orange", "blue", "red"},
                {"lime", "lime", "blue", "red", "red"},
                {"lime", "blue", "purple", "blue", "red"},
                {"blue", "purple", "purple", "purple", "blue"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors13, 0);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors13, 1);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors13, 2);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors13, 3);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors13, 4);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors13, 0);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors13, 1);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors13, 2);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors13, 3);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors13, 4);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors13, 4);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors13, 3);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors13, 2);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors13, 1);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors13, 0);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors13, 4);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors13, 3);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors13, 2);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors13, 1);
            baseColors13 = colors13;
            moves13++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors13, 0);
            baseColors13 = colors13;
            moves13++;
        } else if (request.getParameter("s45") != null) {//start
            timer13 = new myTimer();
            moves13 = 0;
            win=false;
            baseColors13 = primarycolors13;
            colors13 = primarycolors13;
        } else if (request.getParameter("s46") != null) {//restart
            timer13 = new myTimer();
            moves13 = 0;
            win=false;
            baseColors13 = primarycolors13;
            colors13 = primarycolors13;


        }



        HttpSession session = request.getSession();
        if(!win) time13=timer13.getElapsedTime();
        session.setAttribute("Colors", baseColors13);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors13, endcolors13)) {
            userData= UUID.randomUUID().toString();
            win=true;
            if(timeless13>time13){
                timeless13=time13;
            }
            if(moveless13>moves13 &&moves13!=0) {
                moveless13 = moves13;
            }
            try {
                udata= Database.setMoveTime(13,moveless13,timeless13);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves13);
        request.setAttribute("time","Time used:"+time13+"miliseconds");
        request.getRequestDispatcher("Game13.jsp").forward(request, response);
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}