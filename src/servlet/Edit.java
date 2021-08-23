package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import layer.bl.BLImpl;

import layer.pl.PLException;
import layer.pl.UserDataBean;
import layer.pl.db.PGDBImpl;
import java.util.UUID;
public class Edit extends HttpServlet {
    private String username,userData;
    private UserDataBean udata;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
//		super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String family = request.getParameter("family");
        if(request.getParameter("userData")!=null){
        userData=request.getParameter("userData");
        username=request.getParameter("userName");
            udata = (UserDataBean) request.getSession().getAttribute(userData);
          }
        else {userData = UUID.randomUUID().toString();
        udata=(UserDataBean)request.getSession().getAttribute("userData");
        username=request.getSession().getAttribute("userName").toString();

        }

        if(name!=null && family!=null) {

            try {
                BLImpl bl = new BLImpl(new PGDBImpl());
                udata=bl.edit(udata.getLoginId(),username ,name,family);

                request.setAttribute("error", "Your edit has been successful");
                request.getRequestDispatcher("/main.jsp").forward(request, response);
                name=null;family=null;
            } catch (PLException e) {
                request.setAttribute("error", "Uncertain error!ََ");
                request.getRequestDispatcher("/edit.jsp").forward(request, response);
            }

        }

        request.setAttribute("userData", userData);
        request.getSession().setAttribute(userData, udata);
        request.setAttribute("userName",username);
        request.getRequestDispatcher("/user.jsp").forward(request, response);

    }

    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.service(arg0, arg1);
    }

}
