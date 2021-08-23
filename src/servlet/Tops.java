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
public class Tops extends HttpServlet{
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
        System.out.println(username);
        System.out.println(udata.getFamily());
        request.setAttribute("userData",userData);
        request.getSession().setAttribute(userData,udata);
        request.setAttribute("userName",username);
        request.getRequestDispatcher("/TopUsers.jsp").forward(request,response);
    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }}
