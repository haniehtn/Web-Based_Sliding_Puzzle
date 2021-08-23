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
public class Level14 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves14, moveless14=1000000000;
    private myTimer timer14;
    private long time14,timeless14=1000000000;
    private String colors14[][] = new String[][]{
            {"orange", "purple", "#ffc0cb", "purple", "orange"},
            {"orange", "purple", "#ffc0cb", "purple", "orange"},
            {"orange", "purple", "#ffc0cb", "purple", "orange"},
            {"orange", "purple", "#ffc0cb", "purple", "orange"},
            {"orange", "purple", "#ffc0cb", "purple", "orange"}
    };

    private String[][] baseColors14 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors14[][] = new String[][]{
                {"orange", "purple", "#ffc0cb", "purple", "orange"},
                {"orange", "purple", "#ffc0cb", "purple", "orange"},
                {"orange", "purple", "#ffc0cb", "purple", "orange"},
                {"orange", "purple", "#ffc0cb", "purple", "orange"},
                {"orange", "purple", "#ffc0cb", "purple", "orange"}
        };
        final String endcolors14[][] = new String[][]{
                {"purple", "purple", "purple", "purple", "purple"},
                {"#ffc0cb", "orange", "orange", "orange", "#ffc0cb"},
                {"orange", "orange", "#ffc0cb", "orange", "orange"},
                {"#ffc0cb", "orange", "orange", "orange", "#ffc0cb"},
                {"purple", "purple", "purple", "purple", "purple"}
        };


        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors14, 0);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors14, 1);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors14, 2);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors14, 3);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors14, 4);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors14, 0);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors14, 1);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors14, 2);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors14, 3);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors14, 4);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors14, 4);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors14, 3);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors14, 2);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors14, 1);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors14, 0);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors14, 4);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors14, 3);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors14, 2);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors14, 1);
            baseColors14 = colors14;
            moves14++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors14, 0);
            baseColors14 = colors14;
            moves14++;
        } else if (request.getParameter("s47") != null) {//start
            timer14 = new myTimer();
            moves14 = 0;
            win=false;
            baseColors14 = primarycolors14;
            colors14 = primarycolors14;
        } else if (request.getParameter("s48") != null) {//restart
            timer14 = new myTimer();
            moves14 = 0;
            win=false;
            baseColors14 = primarycolors14;
            colors14 = primarycolors14;


        }



        HttpSession session = request.getSession();
        if(!win) time14=timer14.getElapsedTime();
        session.setAttribute("Colors", baseColors14);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors14, endcolors14)) {
            userData= UUID.randomUUID().toString();
           win=true;
            if(timeless14>time14){
                timeless14=time14;
            }
            if(moveless14>moves14 &&moves14!=0) {
                moveless14 = moves14;
            }
            try {
                udata= Database.setMoveTime(14,moveless14,timeless14);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves14);
        request.setAttribute("time","Time used:"+time14+"miliseconds");
        request.getRequestDispatcher("Game14.jsp").forward(request, response);
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}