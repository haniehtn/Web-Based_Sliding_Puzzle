<%@page import="layer.pl.PLException"%>
<%@page import="layer.bl.SimplePasswordException"%>
<%@page import="layer.bl.DuplicateUserNameException"%>
<%@page import="layer.pl.db.PGDBImpl"%>
<%@page import="layer.bl.BLImpl"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
 String name = request.getParameter("un");
 String password = request.getParameter("pass");
 
 BLImpl bl = new BLImpl(new PGDBImpl());
	try {
	
		bl.register(name, password);
		System.out.println("you have registered successfully");
		response.sendRedirect("user.jsp");
	} catch (DuplicateUserNameException e) {
		System.out.println("Register failed: user name is duplicate");
		response.sendRedirect("register.jsp");
	} catch (SimplePasswordException e) {
		System.out.println("Register failed: password is simple");
		response.sendRedirect("register.jsp");
	} catch (PLException e) {
		System.out.println("Register failed: unknown persistency error!");
		response.sendRedirect("register.jsp");
	}
 
%>