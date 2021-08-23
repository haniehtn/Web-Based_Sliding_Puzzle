<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
           background-image: url("galaxy3.jpg");
            font-size:x-large;
        }
        h1{
            color: silver;
        }
    </style>
<meta charset="utf8">
<title>Main</title>
    <h1>Main Page</h1><br/>

</head>
<body style="color: white;">
<%=request.getAttribute("error")!=null?request.getAttribute("error"):"" %><br/>
<br/>
<a href="login.jsp" style="color: white ">
Login</a><br/>
<br/><a href="register.jsp" style="color: white ">
Register</a>

</body>
</html>