package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import layer.bl.BLImpl;
import layer.bl.DuplicateUserNameException;
import layer.bl.SimplePasswordException;
import layer.pl.PLException;
import layer.pl.UserDataBean;
import layer.pl.db.PGDBImpl;

public class Exit extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String type = request.getParameter("type");
		 if (type.equals("unsubscribe")) {
			 BLImpl bl = new BLImpl(new PGDBImpl());
			 try {
				bl.unregister(((UserDataBean)request.getSession().getAttribute("userData")).getLoginId(),
						 request.getSession().getAttribute("userName").toString());
				 request.getSession().invalidate();
				 request.setAttribute("error", "Your register has been canceled");
			} catch (PLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				 request.setAttribute("error", "Error");
			}

		 }

		 else if (type.equals("logout")) {
			 request.getSession().invalidate();
			 request.setAttribute("error", "You have been log out");

		 } else {
			 request.setAttribute("error", "Your request is invalid");

		 }
		request.getRequestDispatcher("/main.jsp").forward(request, response);
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

}
