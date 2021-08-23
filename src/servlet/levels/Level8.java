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
public class Level8 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves8, moveless8=1000000000;
    private myTimer timer8;
    private long time8,timeless8=1000000000;
    private String colors8[][] = new String[][]{
            {"red", "red", "orange", "red", "red"},
            {"orange", "blue", "red", "blue", "orange"},
            {"orange", "orange", "blue", "orange", "orange"},
            {"orange", "blue", "red", "blue", "orange"},
            {"red", "red", "orange", "red", "red"}
    };
    private String[][] baseColors8 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors8[][] = new String[][]{
                {"red", "red", "orange", "red", "red"},
                {"orange", "blue", "red", "blue", "orange"},
                {"orange", "orange", "blue", "orange", "orange"},
                {"orange", "blue", "red", "blue", "orange"},
                {"red", "red", "orange", "red", "red"}
        };
        final String endcolors8[][] = new String[][]{
                {"red", "orange", "orange", "orange", "red"},
                {"red", "orange", "blue", "orange", "red"},
                {"red", "blue", "blue", "blue", "red"},
                {"red", "orange", "blue", "orange", "red"},
                {"red", "orange", "orange", "orange", "red"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors8, 0);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors8, 1);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors8, 2);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors8, 3);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors8, 4);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors8, 0);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors8, 1);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors8, 2);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors8, 3);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors8, 4);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors8, 4);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors8, 3);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors8, 2);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors8, 1);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors8, 0);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors8, 4);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors8, 3);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors8, 2);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors8, 1);
            baseColors8 = colors8;
            moves8++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors8, 0);
            baseColors8 = colors8;
            moves8++;
        } else if (request.getParameter("s35") != null) {//start
            timer8 = new myTimer();
            moves8 = 0;
            win=false;
            baseColors8 = primarycolors8;
            colors8 = primarycolors8;
        } else if (request.getParameter("s36") != null) {//restart
            timer8 = new myTimer();
            moves8 = 0;
            win=false;
            baseColors8 = primarycolors8;
            colors8 = primarycolors8;


        }


        HttpSession session = request.getSession();
       if(!win) time8=timer8.getElapsedTime();
        session.setAttribute("Colors", baseColors8);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors8, endcolors8)) {
            win=true;
            userData= UUID.randomUUID().toString();
            if(timeless8>time8){
                timeless8=time8;
            }
            if(moveless8>moves8 &&moves8!=0) {
                moveless8 = moves8;
            }
            try {
                udata= Database.setMoveTime(8,moveless8,timeless8);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves8);
        request.setAttribute("time","Time used:"+time8+"miliseconds");
        request.getRequestDispatcher("Game8.jsp").forward(request, response);
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}