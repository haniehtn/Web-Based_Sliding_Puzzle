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

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 String name = request.getParameter("un");
		 String password = request.getParameter("password");
		 BLImpl bl = new BLImpl(new PGDBImpl());
			try {
			
				UserDataBean udata = bl.login(name, password);
				if (udata!=null) {
					request.setAttribute("error", "Welcome");

					request.getSession().setAttribute("userData", udata);
					request.getSession().setAttribute("userName", name);

					request.getRequestDispatcher("/edit").forward(request, response);
				} else {
					request.setAttribute("error", "Username or password is incorrect");
					request.getRequestDispatcher("/login.jsp").forward(request, response);
				}
			} catch (PLException e) {
				request.setAttribute("error", "Uncertain error!");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
		
		
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

}
