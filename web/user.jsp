<%@page import="layer.pl.UserDataBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf8">
    <title>User page</title>
    <style>
        h1{
            color: silver;
        }
        body {
            background-image: url("galaxy.jpg");
            font-size:x-large;
        }
    </style>
    <h1>User Page</h1><br/>
</head>

<body style="color:#ff69b4">

<br/>
<%
    String userData=request.getAttribute("userData").toString();
    UserDataBean udata=(UserDataBean)request.getSession().getAttribute(userData);
String username=(String)request.getAttribute("userName");
%>
Name: <%=udata.getName()!=null?udata.getName():""%><br/>
Family: <%=udata.getFamily()!=null?udata.getFamily():"" %><br/>


<%=request.getAttribute("error")!=null?request.getAttribute("error"):"" %><br/>
<form id="ed" action="edit.jsp" method="post">
    <input type = "hidden" name= "userData"  value="<%=userData%>" />
    <input type = "hidden" name= "userName"  value="<%=username%>" />
</form><br/><br/>
<a href="#" onclick="document.getElementById('ed').submit();" style="color: white ">
    Edit profile</a><br/>
<br/><a href="kjsdhfk.exit?type=unsubscribe" style="color: white ">
    Delete account</a><br/><form id="ddd" action="kjsdhfk.exit" method="post">
    <input type="hidden" name="type" value="logout"/>
</form>

<form id="db" action="/db" method="post">
    <input type = "hidden" name= "userData"  value="<%=userData%>" />
    <input type = "hidden" name= "userName"  value="<%=username%>" />
</form>
<form id="tp" action="/tops" method="post">
    <input type = "hidden" name= "userData"  value="<%=userData%>" />
    <input type = "hidden" name= "userName"  value="<%=username%>" />
</form>
<br/><a href="#" onclick="document.getElementById('db').submit();" style="color: white ">
    Game levels</a><br/>
<br/><a href="#" onclick="document.getElementById('tp').submit();" style="color: white ">
    Top users</a><br/>
<br/><a href="#" onclick="document.getElementById('ddd').submit();" style="color: white ">
   Log out</a>

</body>
</html>