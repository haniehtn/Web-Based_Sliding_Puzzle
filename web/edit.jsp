<%--
  Created by IntelliJ IDEA.
  User: hanieh
  Date: 8/3/2017 AD
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@page import="layer.pl.UserDataBean"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit profile</title>

    <style>
        h1{
            color: silver;
        }
        body {
            background-image: url("galaxy.jpg");
            font-size:x-large;
        } input[type=submit] {
                      width: 100px;
                      height: 30px;
                      color: lightpink;
                      background:mediumpurple;
                      border:0 none;
                      cursor:hand;
                      -webkit-border-radius: 5px;
                      border-radius: 5px;
                      font-size: medium;
                  }input[type=text] {
               border:0 none;
               cursor:hand;
            background-color: lightpink;
               -webkit-border-radius: 5px;
               border-radius: 5px;
               font-size: medium;
           }
    </style>
    <h1>Edit Profile</h1><br/>
</head>

<body style="color: hotpink;">
<%
    String userData=request.getParameter("userData");
    String username=request.getParameter("userName");
%>
<form action="/edit"  method="post">
    <table>

        <tr><td>Name: </td><td><input type="text" name="name"/></td></tr>
        <tr><td>Family:</td><td><input type="text" name="family"/></td></tr>
        <tr><td></td><td><input type="submit" value="Edit"/></td></tr>
    </table>
</form>
<form action="/edit" id="ddd" method="post">
    <input type = "hidden" name= "userData"  value="<%=userData%>" />
    <input type = "hidden" name= "userName"  value="<%=username%>" />

</form>
<a href="#" onclick="document.getElementById('ddd').submit();" style="color:white">
    Cancel</a>
</body>

</html>
