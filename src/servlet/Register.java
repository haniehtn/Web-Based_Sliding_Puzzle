package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import layer.bl.BLImpl;
import layer.bl.DuplicateUserNameException;
import layer.bl.SimplePasswordException;
import layer.pl.PLException;
import layer.pl.db.PGDBImpl;

public class Register extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 String name = request.getParameter("un");
		 String password = request.getParameter("pass");
		 
		 BLImpl bl = new BLImpl(new PGDBImpl());
			try {
			
				bl.register(name, password);
				request.setAttribute("error", "you have registered successfully");
				request.getRequestDispatcher("/main.jsp").forward(request, response);
			} catch (DuplicateUserNameException e) {
				request.setAttribute("error", "Register failed: user name is duplicate");
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			} catch (SimplePasswordException e) {
				request.setAttribute("error", "Register failed: password is simple");
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			} catch (PLException e) {
				request.setAttribute("error", "Register failed: unknown persistency error!");
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			}
		
		
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

}
