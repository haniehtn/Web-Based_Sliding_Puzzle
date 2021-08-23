package servlet;

import layer.bl.BLImpl;
import layer.pl.PLException;
import layer.pl.UserDataBean;
import layer.pl.db.PGDBImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by hanieh on 8/7/2017 AD.
 */
public class Database extends HttpServlet{
    private static String username,userData;
    private static UserDataBean udata;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BLImpl bl=new BLImpl(new PGDBImpl());
        userData=request.getParameter("userData");
        udata = (UserDataBean) request.getSession().getAttribute(userData);
        username=request.getParameter("userName");
        request.getSession().removeAttribute(userData);
    request.setAttribute("userData",userData);
    request.getSession().setAttribute(userData,udata);
    request.setAttribute("userName",username);
    request.getRequestDispatcher("/Games.jsp").forward(request,response);
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }

    public static UserDataBean setMoveTime(int level,long moveless,long timeless) throws PLException {

        if (username != null && moveless!=0 && timeless!=0) {
            BLImpl bl = new BLImpl(new PGDBImpl());
            switch (level) {
                case 1: {
                    bl.editMovesTimelevel1(username, moveless, timeless);
                   return bl.editLastlevel(username,1);
                }
                case 2: {
                    bl.editMovesTimelevel2(username, moveless, timeless);
                   return  bl.editLastlevel(username,2);

                }
                case 3: {
                    bl.editMovesTimelevel3(username, moveless, timeless);
                   return bl.editLastlevel(username,3);

                }
                case 4: {
                    bl.editMovesTimelevel4(username, moveless, timeless);
                   return   bl.editLastlevel(username,4);

                }
                case 5: {
                    bl.editMovesTimelevel5(username, moveless, timeless);
                    return bl.editLastlevel(username,5);

                }
                case 6: {
                    bl.editMovesTimelevel6(username, moveless, timeless);
                   return   bl.editLastlevel(username,6);

                }
                case 7: {
                    bl.editMovesTimelevel7(username, moveless, timeless);
                   return   bl.editLastlevel(username,7);

                }
                case 8: {
                    bl.editMovesTimelevel8(username, moveless, timeless);
                   return   bl.editLastlevel(username,8);

                }
                case 9: {
                    bl.editMovesTimelevel9(username, moveless, timeless);
                  return   bl.editLastlevel(username,9);

                }
                case 10: {
                    bl.editMovesTimelevel10(username, moveless, timeless);
                   return   bl.editLastlevel(username,10);

                }
                case 11: {
                    bl.editMovesTimelevel11(username, moveless, timeless);
                  return   bl.editLastlevel(username,11);

                }
                case 12: {
                    bl.editMovesTimelevel12(username, moveless, timeless);
                    return bl.editLastlevel(username,12);

                }
                case 13: {
                    bl.editMovesTimelevel13(username, moveless, timeless);
                    return bl.editLastlevel(username,13);

                }
                case 14: {
                    bl.editMovesTimelevel14(username, moveless, timeless);
                    return bl.editLastlevel(username,14);

                }
                case 15: {
                    bl.editMovesTimelevel15(username, moveless, timeless);
                   return bl.editLastlevel(username,15);

                }
            }

        }
    return null;}

}
