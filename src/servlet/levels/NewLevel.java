package servlet.levels;

import layer.bl.BLImpl;
import layer.pl.PLException;
import layer.pl.UserDataBean;
import layer.pl.db.PGDBImpl;
import servlet.Database;
import servlet.Move;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class NewLevel extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves, moveless=1000000000;
    private myTimer timer;
    private long time,timeless=1000000000;
    private String colors[][] = new String[5][5];
    private String[][] baseColorss = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BLImpl bl=new BLImpl(new PGDBImpl());
        String[][] primaryColors = new String[5][5];
       String endcolors[][] = new String[5][5];


        try {
            primaryColors = bl.getLevel(16,"begin");
            endcolors =bl.getLevel(16,"end");
        } catch (PLException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


colors=primaryColors;
        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors, 0);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors, 1);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors, 2);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors, 3);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors, 4);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors, 0);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors, 1);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors, 2);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors, 3);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors, 4);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors, 4);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors, 3);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors, 2);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors, 1);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors, 0);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors, 4);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors, 3);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors, 2);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors, 1);
            baseColorss = colors;
            moves++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors, 0);
            baseColorss = colors;
            moves++;
        } else if (request.getParameter("") != null) {//start
            timer = new myTimer();
            moves = 0;
            win=false;
            baseColorss = primaryColors;
            colors = primaryColors;
        } else if (request.getParameter("") != null) {//restart
            timer = new myTimer();
            moves = 0;
            win=false;
            baseColorss = primaryColors;
            colors = primaryColors;


        }

        HttpSession session = request.getSession();
        if(!win) time=timer.getElapsedTime();
        session.setAttribute("Colors", baseColorss);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColorss, endcolors)) {
            win=true;
            userData= UUID.randomUUID().toString();

            if(timeless>time){
                timeless=time;
            }
            if(moveless>moves &&moves!=0) {
                moveless = moves;
            }
            try {
                udata= Database.setMoveTime(1,moveless,timeless);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves);
        request.setAttribute("time","Time used:"+time+"miliseconds");
        request.getRequestDispatcher("NewLevel.jsp").forward(request, response);
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}