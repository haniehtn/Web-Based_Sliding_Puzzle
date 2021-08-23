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
public class Level12 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves12, moveless12=1000000000;
    private myTimer timer12;
    private long time12,timeless12=1000000000;
    private String colors12[][] = new String[][]{
            {"red", "purple", "purple", "lime", "red"},
            {"purple", "blue", "purple", "red", "lime"},
            {"purple", "purple", "purple", "purple", "purple"},
            {"lime", "red", "purple", "blue", "purple"},
            {"red", "lime", "purple", "purple", "red"}
    };
   private String[][] baseColors12 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors12[][] = new String[][]{
                {"red", "purple", "purple", "lime", "red"},
                {"purple", "blue", "purple", "red", "lime"},
                {"purple", "purple", "purple", "purple", "purple"},
                {"lime", "red", "purple", "blue", "purple"},
                {"red", "lime", "purple", "purple", "red"}
        };
        final String endcolors12[][] = new String[][]{
                {"purple", "lime", "purple", "lime", "purple"},
                {"red", "purple", "blue", "purple", "red"},
                {"purple", "red", "purple", "red", "purple"},
                {"red", "purple", "blue", "purple", "red"},
                {"red", "lime", "red", "lime", "red"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors12, 0);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors12, 1);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors12, 2);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors12, 3);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors12, 4);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors12, 0);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors12, 1);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors12, 2);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors12, 3);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors12, 4);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors12, 4);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors12, 3);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors12, 2);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors12, 1);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors12, 0);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors12, 4);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors12, 3);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors12, 2);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors12, 1);
            baseColors12 = colors12;
            moves12++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors12, 0);
            baseColors12 = colors12;
            moves12++;
        } else if (request.getParameter("s43") != null) {//start
            timer12 = new myTimer();
            moves12 = 0;
            win=false;
            baseColors12 = primarycolors12;
            colors12 = primarycolors12;
        } else if (request.getParameter("s44") != null) {//restart
            timer12 = new myTimer();
            moves12 = 0;
            win=false;
            baseColors12 = primarycolors12;
            colors12 = primarycolors12;


        }


        HttpSession session = request.getSession();
        if(!win) time12=timer12.getElapsedTime();
        session.setAttribute("Colors", baseColors12);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors12, endcolors12)) {
            userData= UUID.randomUUID().toString();
            win=true;
            if(timeless12>time12){
                timeless12=time12;
            }
            if(moveless12>moves12 &&moves12!=0) {
                moveless12 = moves12;
            }
            try {
                udata= Database.setMoveTime(12,moveless12,timeless12);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves12);
        request.setAttribute("time","Time used:"+time12+"miliseconds");
        request.getRequestDispatcher("Game12.jsp").forward(request, response);
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}