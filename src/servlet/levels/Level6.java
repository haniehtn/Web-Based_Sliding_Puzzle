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
public class Level6 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves6, moveless6=1000000000;
    private myTimer timer6;
    private long time6,timeless6=1000000000;
    private String colors6[][] = new String[][]{
            {"lime", "orange", "orange", "orange", "lime"},
            {"orange", "red", "orange", "red", "orange"},
            {"orange", "orange", "orange", "orange", "orange"},
            {"orange", "red", "orange", "red", "orange"},
            {"lime", "orange", "orange", "orange", "lime"}
    };
    private String[][] baseColors6 = new String[5][5];

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primarycolors6[][] = new String[][]{
                {"lime", "orange", "orange", "orange", "lime"},
                {"orange", "red", "orange", "red", "orange"},
                {"orange", "orange", "orange", "orange", "orange"},
                {"orange", "red", "orange", "red", "orange"},
                {"lime", "orange", "orange", "orange", "lime"}
        };
        final String endcolors6[][] = new String[][]{
                {"red", "orange", "orange", "orange", "red"},
                {"orange", "lime", "orange", "lime", "orange"},
                {"orange", "orange", "orange", "orange", "orange"},
                {"orange", "lime", "orange", "lime", "orange"},
                {"red", "orange", "orange", "orange", "red"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(colors6, 0);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(colors6, 1);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(colors6, 2);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(colors6, 3);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(colors6, 4);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(colors6, 0);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(colors6, 1);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(colors6, 2);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(colors6, 3);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(colors6, 4);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(colors6, 4);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(colors6, 3);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(colors6, 2);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(colors6, 1);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(colors6, 0);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(colors6, 4);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(colors6, 3);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(colors6, 2);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(colors6, 1);
            baseColors6 = colors6;
            moves6++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(colors6, 0);
            baseColors6 = colors6;
            moves6++;
        } else if (request.getParameter("s31") != null) {//start
            timer6 = new myTimer();
            moves6 = 0;
            win=false;
            baseColors6 = primarycolors6;
            colors6 = primarycolors6;
        } else if (request.getParameter("s32") != null) {//restart
            timer6 = new myTimer();
            moves6 = 0;
            win=false;
            baseColors6 = primarycolors6;
            colors6 = primarycolors6;


        }



        HttpSession session = request.getSession();
       if (!win) time6=timer6.getElapsedTime();
        session.setAttribute("Colors", baseColors6);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors6, endcolors6)) {
            win=true;
            userData= UUID.randomUUID().toString();
            if(timeless6>time6){
                timeless6=time6;
            }
            if(moveless6>moves6 &&moves6!=0) {
                moveless6 = moves6;
            }
            try {
                udata= Database.setMoveTime(6,moveless6,timeless6);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves6);
        request.setAttribute("time","Time used:"+time6+"miliseconds");
        request.getRequestDispatcher("Game6.jsp").forward(request, response);
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}