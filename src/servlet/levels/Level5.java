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
public class Level5 extends HttpServlet {
    private boolean win=false;
    private String userData,username;
    private UserDataBean udata;
    private long moves5, moveless5=1000000000;
    private myTimer timer5;
    private long time5,timeless5=1000000000;

    private String Colors5[][] =  new String[][]{
            { "lime", "lime", "purple", "lime", "lime" },
            { "lime", "lime", "purple", "lime", "lime" },
            { "purple", "lime", "lime", "lime", "purple" },
            { "purple", "purple", "lime", "purple", "purple"},
            { "purple", "purple", "lime", "purple", "purple"}
    };
    private String[][] baseColors5=new String[5][5];


    private static final long serialVersionUID=1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String primaryColors5[][] =  new String[][]{
                { "lime", "lime", "purple", "lime", "lime" },
                { "lime", "lime", "purple", "lime", "lime" },
                { "purple", "lime", "lime", "lime", "purple" },
                { "purple", "purple", "lime", "purple", "purple"},
                { "purple", "purple", "lime", "purple", "purple"}
        };
        final String endColors5[][]= new String[][]{
                { "lime", "purple", "purple", "purple", "lime" },
                { "lime", "lime", "purple", "purple", "lime" },
                { "lime", "purple", "lime", "purple", "lime" },
                { "lime", "purple", "purple", "lime", "lime"},
                { "lime", "purple", "purple", "purple", "lime"}
        };

        if (!win && request.getParameter("s1") != null) {
            Move.downfunc(Colors5, 0);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s2") != null) {
            Move.downfunc(Colors5, 1);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s3") != null) {
            Move.downfunc(Colors5, 2);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s4") != null) {
            Move.downfunc(Colors5, 3);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s5") != null) {
            Move.downfunc(Colors5, 4);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s6") != null) {
            Move.leftfunc(Colors5, 0);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s7") != null) {
            Move.leftfunc(Colors5, 1);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s8") != null) {
            Move.leftfunc(Colors5, 2);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s9") != null) {
            Move.leftfunc(Colors5, 3);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s10") != null) {
            Move.leftfunc(Colors5, 4);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s11") != null) {
            Move.upfunc(Colors5, 4);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s12") != null) {
            Move.upfunc(Colors5, 3);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s13") != null) {
            Move.upfunc(Colors5, 2);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s14") != null) {
            Move.upfunc(Colors5, 1);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s15") != null) {
            Move.upfunc(Colors5, 0);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s16") != null) {
            Move.rightfunc(Colors5, 4);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s17") != null) {
            Move.rightfunc(Colors5, 3);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s18") != null) {
            Move.rightfunc(Colors5, 2);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s19") != null) {
            Move.rightfunc(Colors5, 1);
            baseColors5 = Colors5;
            moves5++;
        } else if (!win && request.getParameter("s20") != null) {
            Move.rightfunc(Colors5, 0);
            baseColors5 = Colors5;
            moves5++;
        } else if (request.getParameter("s29") != null) {//start
            timer5 = new myTimer();
            moves5 = 0;
            win=false;
            baseColors5 = primaryColors5;
            Colors5 = primaryColors5;
        } else if (request.getParameter("s30") != null) {//restart
            timer5 = new myTimer();
            moves5 = 0;
            win=false;
            baseColors5 = primaryColors5;
            Colors5 = primaryColors5;


        }



        HttpSession session = request.getSession();
        if(!win) time5=timer5.getElapsedTime();
        session.setAttribute("Colors", baseColors5);
        if(request.getParameter("userData")!=null){
            username=request.getParameter("userName");
            userData=request.getParameter("userData");
            udata=(UserDataBean)session.getAttribute(userData);
        }
        if ( Arrays.deepEquals(baseColors5, endColors5)) {
            win=true;
            userData= UUID.randomUUID().toString();
            if(timeless5>time5){
                timeless5=time5;
            }
            if(moveless5>moves5 &&moves5!=0) {
                moveless5 = moves5;
            }
            try {
                udata= Database.setMoveTime(5,moveless5,timeless5);
            } catch (PLException e) {
                e.printStackTrace();
            }
            request.setAttribute("error", "شما برنده شدید.");
        }
        request.setAttribute("userName",username);
        request.setAttribute("userData",userData);
        session.setAttribute(userData,udata);
        request.setAttribute("move", "Number of moves:"+moves5);
        request.setAttribute("time","Time used:"+time5+"miliseconds");
        request.getRequestDispatcher("Game5.jsp").forward(request, response);
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }
}