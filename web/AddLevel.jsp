<%--
  Created by IntelliJ IDEA.
  User: hanieh
  Date: 8/11/2017 AD
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@page import="layer.pl.UserDataBean"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Level</title>
    <style>
        body{
            background-image: url("galaxy.jpg");
            color: gold;
            font-size:x-large;
        } input[type=submit] {
              color: gold;
              background:mediumpurple;
              border:0 none;
              cursor:hand;
              -webkit-border-radius: 5px;
              border-radius: 5px;
              font-size: medium;
          }

    </style>
</head>
<body>
<% String userData=request.getAttribute("userData").toString();
    UserDataBean udata=(UserDataBean)request.getSession().getAttribute(userData);
    String username=(String)request.getAttribute("userName");
%>
<form action="/addl">
    begin:<br/>
    <table>
    <TR><TD><input type="text" name="b0,0"></TD><TD><input type="text" name="b0,1"></TD><TD><input type="text" name="b0,2"></TD><TD><input type="text" name="b0,3"></TD><TD><input type="text" name="b0,4"></TD></TR>
    <TR><TD><input type="text" name="b1,0"></TD><TD><input type="text" name="b1,1"></TD><TD><input type="text" name="b1,2"></TD><TD><input type="text" name="b1,3"></TD><TD><input type="text" name="b1,4"></TD></TR>
    <TR><TD><input type="text" name="b2,0"></TD><TD><input type="text" name="b2,1"></TD><TD><input type="text" name="b2,2"></TD><TD><input type="text" name="b2,3"></TD><TD><input type="text" name="b2,4"></TD></TR>
    <TR><TD><input type="text" name="b3,0"></TD><TD><input type="text" name="b3,1"></TD><TD><input type="text" name="b3,2"></TD><TD><input type="text" name="b3,3"></TD><TD><input type="text" name="b3,4"></TD></TR>
    <TR><TD><input type="text" name="b4,0"></TD><TD><input type="text" name="b4,1"></TD><TD><input type="text" name="b4,2"></TD><TD><input type="text" name="b4,3"></TD><TD><input type="text" name="b4,4"></TD></TR>
</table>
    end:<br/>
    <table>
        <TR><TD><input type="text" name="0,0"></TD><TD><input type="text" name="0,1"></TD><TD><input type="text" name="0,2"></TD><TD><input type="text" name="0,3"></TD><TD><input type="text" name="0,4"></TD></TR>
        <TR><TD><input type="text" name="1,0"></TD><TD><input type="text" name="1,1"></TD><TD><input type="text" name="1,2"></TD><TD><input type="text" name="1,3"></TD><TD><input type="text" name="1,4"></TD></TR>
        <TR><TD><input type="text" name="2,0"></TD><TD><input type="text" name="2,1"></TD><TD><input type="text" name="2,2"></TD><TD><input type="text" name="2,3"></TD><TD><input type="text" name="2,4"></TD></TR>
        <TR><TD><input type="text" name="3,0"></TD><TD><input type="text" name="3,1"></TD><TD><input type="text" name="3,2"></TD><TD><input type="text" name="3,3"></TD><TD><input type="text" name="3,4"></TD></TR>
        <TR><TD><input type="text" name="4,0"></TD><TD><input type="text" name="4,1"></TD><TD><input type="text" name="4,2"></TD><TD><input type="text" name="4,3"></TD><TD><input type="text" name="4,4"></TD></TR>
    </table>
    <input type="submit" value="Add level"/>
</form>

</body>
</html>
