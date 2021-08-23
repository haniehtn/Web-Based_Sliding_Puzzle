<%@ page import="java.awt.*" %>
<%@ page import="layer.pl.UserDataBean" %><%--
  Created by IntelliJ IDEA.
  User: hanieh
  Date: 8/3/2017 AD
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Game level:1</title>
    <style>
        body{
            background-image: url("G.jpg");
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
<%

    String[][] Colors= (String[][]) request.getSession().getAttribute("Colors");
    String userData=null,username=null;
    if(request.getAttribute("userData")!=null){
    userData=request.getAttribute("userData").toString();
    username=request.getAttribute("userName").toString();}
%>



<form action="level1" method="post">
    <TABLE name="begin"  width="210" height="210" border="0"> <TR height="30" >
            <TD width="30" ></TD>
            <TD width="30" ><input type="submit" name="s1"  value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD><TD width="30" ><input type="submit" name="s2"  value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD><TD width="30" ><input type="submit" name="s3"  value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD><TD width="30" ><input type="submit" name="s4"  value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD><TD width="30" ><input type="submit" name="s5"  value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"></TD><TD width="30" ></TD>
        </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s20"  value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[0][0]%>></TD>
            <TD width="30" bgcolor=<%= Colors[0][1]%>></TD>
            <TD width="30" bgcolor=<%= Colors[0][2]%>></TD>
            <TD width="30" bgcolor=<%= Colors[0][3]%>></TD>
            <TD width="30" bgcolor=<%= Colors[0][4]%>></TD>
            <TD width="30" ><input type="submit" name="s6"  value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s19"  value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[1][0]%>></TD>
            <TD width="30" bgcolor=<%= Colors[1][1]%>></TD>
            <TD width="30" bgcolor=<%= Colors[1][2]%>></TD>
            <TD width="30" bgcolor=<%= Colors[1][3]%>></TD>
            <TD width="30" bgcolor=<%= Colors[1][4]%>></TD>
            <TD width="30" ><input type="submit" name="s7"  value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s18"  value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[2][0]%>></TD>
            <TD width="30" bgcolor=<%= Colors[2][1]%>></TD>
            <TD width="30" bgcolor=<%= Colors[2][2]%>></TD>
            <TD width="30" bgcolor=<%= Colors[2][3]%>></TD>
            <TD width="30" bgcolor=<%= Colors[2][4]%>></TD>
            <TD width="30" ><input type="submit" name="s8"  value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s17"  value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[3][0]%>></TD>
            <TD width="30" bgcolor=<%= Colors[3][1]%>></TD>
            <TD width="30" bgcolor=<%= Colors[3][2]%>></TD>
            <TD width="30" bgcolor=<%= Colors[3][3]%>></TD>
            <TD width="30" bgcolor=<%= Colors[3][4]%>></TD>
            <TD width="30" ><input type="submit" name="s9"  value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s16"  value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[4][0]%>></TD>
            <TD width="30" bgcolor=<%= Colors[4][1]%>></TD>
            <TD width="30" bgcolor=<%= Colors[4][2]%>></TD>
            <TD width="30" bgcolor=<%= Colors[4][3]%>></TD>
            <TD width="30" bgcolor=<%= Colors[4][4]%>></TD>
            <TD width="30" ><input type="submit" name="s10"  value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ></TD>
            <TD width="30" ><input type="submit" name="s15"  value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s14"  value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s13"  value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s12"  value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s11"  value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ></TD>
        </TR>

    </TABLE>
    <input type="submit" name="s22" value="Restart"><br/>
     <%=request.getAttribute("error")!=null?request.getAttribute("error"):"" %><br/>
     <%=request.getAttribute("move")!=null?request.getAttribute("move"):"" %><br/>
    <%=request.getAttribute("time")!=null?request.getAttribute("time"):"" %><br/>
</form>
<TABLE name="end"  width="210" height="210" border="0"> <TR height="30" >
    <TD width="30" ></TD></TR>
    <TR height="30" >
        <TD width="30" ></TD> <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" ></TD> </TR>
    <TR height="30" >
        <TD width="30" ></TD> <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" ></TD> </TR>
    <TR height="30" >
        <TD width="30" ></TD> <TD width="30" bgcolor="red"></TD>
        <TD width="30" bgcolor="red"></TD>
        <TD width="30" bgcolor="red"></TD>
        <TD width="30" bgcolor="red"></TD>
        <TD width="30" bgcolor="red"></TD>
        <TD width="30" ></TD> </TR>
    <TR height="30" >
        <TD width="30" ></TD> <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" ></TD> </TR>
    <TR height="30" >
        <TD width="30" ></TD> <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" bgcolor="blue"></TD>
        <TD width="30" ></TD> </TR>
    <TR height="30" ><TD width="30" ></TD>
    </TR>
</TABLE>
<form id="bc" action="/db" method="post">
    <input type = "hidden" name= "userData"  value="<%=userData%>" />
    <input type = "hidden" name= "userName"  value="<%=username%>" />
</form>
<a href="#" onclick="document.getElementById('bc').submit();" style="color:white">
    Game levels</a><br/>
</body>


</html>