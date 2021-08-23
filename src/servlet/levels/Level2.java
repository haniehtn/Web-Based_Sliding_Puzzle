
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
        public class Level2 extends HttpServlet {
            private boolean win=false;
            private long moves2, moveless2=1000000000;
            private String userData,username;
            private UserDataBean udata;
            private myTimer timer2;
            private long time2,timeless2=1000000000;
            private String colors2[][] =  new String[][]{
                    { "red", "lime", "lime", "lime", "red" },
                    { "lime", "lime", "lime", "lime", "lime" },
                    { "lime", "lime", "lime", "lime", "lime" },
                    { "lime", "lime", "lime", "lime", "lime"},
                    { "red", "lime", "lime", "lime", "red" }
            };
            private String[][] baseColors2=new String[5][5];

            private static final long serialVersionUID=1L;

            @Override
            public void doGet(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {

                doPost(request, response);
            }
            @Override
            protected void doPost(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
                final String primarycolors2[][] = new String[][]{
                        {"red", "lime", "lime", "lime", "red"},
                        {"lime", "lime", "lime", "lime", "lime"},
                        {"lime", "lime", "lime", "lime", "lime"},
                        {"lime", "lime", "lime", "lime", "lime"},
                        {"red", "lime", "lime", "lime", "red"}
                };
                final String endcolors2[][] = new String[][]{
                        {"lime", "lime", "lime", "lime", "lime"},
                        {"lime", "lime", "red", "lime", "lime"},
                        {"lime", "red", "lime", "red", "lime"},
                        {"lime", "lime", "red", "lime", "lime"},
                        {"lime", "lime", "lime", "lime", "lime"}
                };

                if (!win && request.getParameter("s1") != null) {
                    Move.downfunc(colors2, 0);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s2") != null) {
                    Move.downfunc(colors2, 1);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s3") != null) {
                    Move.downfunc(colors2, 2);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s4") != null) {
                    Move.downfunc(colors2, 3);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s5") != null) {
                    Move.downfunc(colors2, 4);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s6") != null) {
                    Move.leftfunc(colors2, 0);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s7") != null) {
                    Move.leftfunc(colors2, 1);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s8") != null) {
                    Move.leftfunc(colors2, 2);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s9") != null) {
                    Move.leftfunc(colors2, 3);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s10") != null) {
                    Move.leftfunc(colors2, 4);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s11") != null) {
                    Move.upfunc(colors2, 4);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s12") != null) {
                    Move.upfunc(colors2, 3);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s13") != null) {
                    Move.upfunc(colors2, 2);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s14") != null) {
                    Move.upfunc(colors2, 1);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s15") != null) {
                    Move.upfunc(colors2, 0);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s16") != null) {
                    Move.rightfunc(colors2, 4);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s17") != null) {
                    Move.rightfunc(colors2, 3);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s18") != null) {
                    Move.rightfunc(colors2, 2);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s19") != null) {
                    Move.rightfunc(colors2, 1);
                    baseColors2 = colors2;
                    moves2++;
                } else if (!win && request.getParameter("s20") != null) {
                    Move.rightfunc(colors2, 0);
                    baseColors2 = colors2;
                    moves2++;
                } else if (request.getParameter("s23") != null) {//start
                    timer2 = new myTimer();
                    moves2 = 0;
                    win=false;
                    baseColors2 = primarycolors2;
                    colors2 = primarycolors2;
                } else if (request.getParameter("s24") != null) {//restart
                    timer2 = new myTimer();
                    moves2 = 0;
                    win=false;
                    baseColors2 = primarycolors2;
                    colors2 = primarycolors2;

                }


                HttpSession session = request.getSession();
                if(!win) time2=timer2.getElapsedTime();
                session.setAttribute("Colors", baseColors2);
                if (request.getParameter("userData") != null) {
                    username = request.getParameter("userName");
                    userData = request.getParameter("userData");
                    udata = (UserDataBean) session.getAttribute(userData);
                }
                if (Arrays.deepEquals(baseColors2, endcolors2)) {
                    win=true;
                    userData = UUID.randomUUID().toString();
                    if (timeless2 > time2) {
                        timeless2 = time2;
                    }
                    if (moveless2 > moves2 && moves2 != 0) {
                        moveless2 = moves2;
                    }
                    try {
                        udata = Database.setMoveTime(2, moveless2, timeless2);

                    } catch (PLException e) {
                        e.printStackTrace();
                    }
                    request.setAttribute("error", "شما برنده شدید.");
                }
                request.setAttribute("userName", username);
                request.setAttribute("userData", userData);
                session.setAttribute(userData, udata);
                request.setAttribute("move", "Number of moves:" + moves2);
                request.setAttribute("time", "Time used:" + time2 + "miliseconds");
                request.getRequestDispatcher("Game2.jsp").forward(request, response);
            }
            @Override
            protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
                    throws ServletException, IOException {
                // TODO Auto-generated method stub
                super.service(arg0, arg1);
            }
        }