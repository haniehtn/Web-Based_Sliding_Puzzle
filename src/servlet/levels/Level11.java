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
public class Level11 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves11, moveless11=1000000000;
    private myTimer timer11;
    private long time11,timeless11=1000000000;
    private String colors11[][] = new String[][]{
            {"purple", "blue", "lime", "blue", "orange"},
            {"red", "purple", "lime", "orange", "red"},
            {"purple", "lime", "purple", "red", "orange"},
            {"red", "purple", "lime", "orange", "red"},
            {"purple", "blue", "lime", "blue", "orange"}
    };
    private String[][] baseColors11 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors11[][] = new String[][]{
                {"purple", "blue", "lime", "blue", "orange"},
                {"red", "purple", "lime", "orange", "red"},
                {"purple", "lime", "purple", "red", "orange"},
                {"red", "purple", "lime", "orange", "red"},
                {"purple", "blue", "lime", "blue", "orange"}
        };
        final String endcolors11[][] = new String[][]{
                {"purple", "purple", "purple", "purple", "red"},
                {"purple", "red", "red", "red", "red"},
                {"blue", "blue", "purple", "blue", "blue"},
                {"orange", "lime", "lime", "lime", "lime"},
                {"orange", "orange", "orange", "orange", "lime"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors11, 0);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors11, 1);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors11, 2);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors11, 3);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors11, 4);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors11, 0);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors11, 1);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors11, 2);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors11, 3);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors11, 4);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors11, 4);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors11, 3);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors11, 2);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors11, 1);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors11, 0);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors11, 4);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors11, 3);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors11, 2);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors11, 1);
            baseColors11 = colors11;
            moves11++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors11, 0);
            baseColors11 = colors11;
            moves11++;
        } else if (request.getParameter("s41") != null) {//start
            timer11 = new myTimer();
            moves11 = 0;
            win=false;
            baseColors11 = primarycolors11;
            colors11 = primarycolors11;
        } else if (request.getParameter("s42") != null) {//restart
            timer11 = new myTimer();
            moves11 = 0;
            win=false;
            baseColors11 = primarycolors11;
            colors11 = primarycolors11;


        }


        HttpSession session = request.getSession();
        if(!win) time11=timer11.getElapsedTime();
        session.setAttribute("Colors", baseColors11);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors11, endcolors11)) {
            userData= UUID.randomUUID().toString();
            win=true;
            if(timeless11>time11){
                timeless11=time11;
            }
            if(moveless11>moves11 &&moves11!=0) {
                moveless11 = moves11;
            }
            try {
                udata= Database.setMoveTime(11,moveless11,timeless11);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves11);
        request.setAttribute("time","Time used:"+time11+"miliseconds");
        request.getRequestDispatcher("Game11.jsp").forward(request, response);
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}