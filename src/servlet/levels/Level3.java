package servlet.levels;

import layer.pl.PLException;
import layer.pl.UserDataBean;
import servlet.Database;
import servlet.Move;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Level3 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves3, moveless3=1000000000;
    private myTimer timer3;
    private long time3,timeless3=1000000000;

    private String colors3[][] =  new String[][]{
            { "purple", "purple", "orange", "orange", "purple" },
            { "purple", "purple","purple", "purple", "orange" },
            {"orange", "purple","purple", "purple", "orange" },
            { "orange", "purple","purple", "purple", "purple"},
            { "purple", "orange", "orange", "purple", "purple"  }
    };
    private String[][] baseColors3=new String[5][5];

    private static final long serialVersionUID=1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors3[][]= new String[][]{
                { "purple", "purple", "orange", "orange", "purple" },
                { "purple", "purple","purple", "purple", "orange" },
                {"orange", "purple","purple", "purple", "orange" },
                { "orange", "purple","purple", "purple", "purple"},
                { "purple", "orange", "orange", "purple", "purple"  }
        };
        final String endcolors3[][]= new String[][]{
                {"orange", "purple", "purple", "purple", "orange"},
                {"purple", "orange", "purple", "orange", "purple"},
                {"purple", "purple", "purple", "purple", "purple"},
                {"purple", "orange", "purple", "orange", "purple"},
                {"orange", "purple", "purple", "purple", "orange"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors3, 0);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors3, 1);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors3, 2);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors3, 3);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors3, 4);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors3, 0);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors3, 1);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors3, 2);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors3, 3);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors3, 4);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors3, 4);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors3, 3);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors3, 2);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors3, 1);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors3, 0);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors3, 4);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors3, 3);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors3, 2);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors3, 1);
            baseColors3 = colors3;
            moves3++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors3, 0);
            baseColors3 = colors3;
            moves3++;
        } else if (request.getParameter("s25") != null) {//start
            timer3 = new myTimer();
            moves3 = 0;
            win=false;
            baseColors3 = primarycolors3;
            colors3 = primarycolors3;
        } else if (request.getParameter("s26") != null) {//restart
            timer3 = new myTimer();
            moves3 = 0;
            win=false;
            baseColors3 = primarycolors3;
            colors3 = primarycolors3;


        }
        
            HttpSession session = request.getSession();
        if (!win) time3=timer3.getElapsedTime();
            session.setAttribute("Colors", baseColors3);
            if (request.getParameter("userData") != null) {
                username = request.getParameter("userName");
                userData = request.getParameter("userData");
                udata = (UserDataBean) session.getAttribute(userData);
            }
            if (Arrays.deepEquals(baseColors3, endcolors3)) {
                win=true;
                userData = UUID.randomUUID().toString();
                if (timeless3 > time3) {
                    timeless3 = time3;
                }
                if (moveless3 > moves3 && moves3 != 0) {
                    moveless3 = moves3;
                }
                try {
                    udata = Database.setMoveTime(3, moveless3, timeless3);
                } catch (PLException e) {
                    e.printStackTrace();
                }
                request.setAttribute("error", "شما برنده شدید.");
            }
            request.setAttribute("userName", username);
            request.setAttribute("userData", userData);
            session.setAttribute(userData, udata);
            request.setAttribute("move", "Number of moves:" + moves3);
            request.setAttribute("time", "Time used:" + time3 + "miliseconds");
        request.getRequestDispatcher("Game3.jsp").forward(request, response);
        }

            @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}