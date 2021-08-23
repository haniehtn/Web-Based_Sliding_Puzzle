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
public class Level9 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves9, moveless9=1000000000;
    private myTimer timer9;
    private long time9,timeless9=1000000000;
    private String colors9[][] = new String[][]{
            {"red", "red", "lime", "orange", "purple"},
            {"red", "red", "lime", "orange", "purple"},
            {"lime", "lime", "lime", "orange", "purple"},
            {"orange", "orange", "orange", "orange", "purple"},
            {"purple", "purple", "purple", "purple", "purple"}
    };
    private String[][] baseColors9 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors9[][] = new String[][]{
                {"red", "red", "lime", "orange", "purple"},
                {"red", "red", "lime", "orange", "purple"},
                {"lime", "lime", "lime", "orange", "purple"},
                {"orange", "orange", "orange", "orange", "purple"},
                {"purple", "purple", "purple", "purple", "purple"}
        };
        final String endcolors9[][] = new String[][]{
                {"purple", "purple", "lime", "purple", "purple"},
                {"purple", "lime", "lime", "lime", "purple"},
                {"orange", "orange", "lime", "orange", "orange"},
                {"red", "orange", "orange", "orange", "red"},
                {"red", "purple", "purple", "purple", "red"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors9, 0);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors9, 1);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors9, 2);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors9, 3);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors9, 4);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors9, 0);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors9, 1);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors9, 2);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors9, 3);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors9, 4);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors9, 4);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors9, 3);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors9, 2);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors9, 1);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors9, 0);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors9, 4);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors9, 3);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors9, 2);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors9, 1);
            baseColors9 = colors9;
            moves9++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors9, 0);
            baseColors9 = colors9;
            moves9++;
        } else if (request.getParameter("s37") != null) {//start
            timer9 = new myTimer();
            moves9 = 0;
            win=false;
            baseColors9 = primarycolors9;
            colors9 = primarycolors9;
        } else if (request.getParameter("s38") != null) {//restart
            timer9 = new myTimer();
            moves9 = 0;
            win=false;
            baseColors9 = primarycolors9;
            colors9 = primarycolors9;


        }



        HttpSession session = request.getSession();
        if(!win) time9=timer9.getElapsedTime();
        session.setAttribute("Colors", baseColors9);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors9, endcolors9)) {
            win=true;
            userData= UUID.randomUUID().toString();
            if(timeless9>time9){
                timeless9=time9;
            }
            if(moveless9>moves9 &&moves9!=0) {
                moveless9 = moves9;
            }
            try {
                udata= Database.setMoveTime(9,moveless9,timeless9);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves9);
        request.setAttribute("time","Time used:"+time9+"miliseconds");
        request.getRequestDispatcher("Game9.jsp").forward(request, response);
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}