<%@ page import="java.awt.*" %><%--
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
    <title>Game level:14</title>
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
    String userData=null,username=null;
    if(request.getAttribute("userData")!=null){
        userData=request.getAttribute("userData").toString();
        username=request.getAttribute("userName").toString();}

    String[][] Colors= (String[][]) request.getSession().getAttribute("Colors");
    String[][] Stars =new String[5][5];
    for (int i=0;i<5;i++){
        for (int j=0;j<5;j++){
            if(Colors[i][j].equals("#ffc0cb")) Stars[i][j]="https://investorshub.advfn.com/uicon/40664-small.png?cb=1470406867";
                    else Stars[i][j]=null;
        }
    }
%>


<form action="level14" method="post">
    <TABLE name="begin"  width="210" height="210" border="0">
        <TR height="30" >
            <TD width="30" ></TD>
            <TD width="30" ><input type="submit" name="s1" value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s2" value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s3" value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s4" value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s5" value="" style="background-image: url(down.jpg);background-size: 100% 100%; padding: 20px 30px"></TD>
            <TD width="30" ></TD>
        </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s20" value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[0][0]%>><IMG src=<%= Stars[0][0]!=null?Stars[0][0]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[0][1]%>><IMG src=<%= Stars[0][1]!=null?Stars[0][1]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[0][2]%>><IMG src=<%= Stars[0][2]!=null?Stars[0][2]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[0][3]%>><IMG src=<%= Stars[0][3]!=null?Stars[0][3]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[0][4]%>><IMG src=<%= Stars[0][4]!=null?Stars[0][4]:"//:0"%> border="0"/></TD>
            <TD width="30" ><input type="submit" name="s6" value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s19" value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[1][0]%>><IMG src=<%= Stars[1][0]!=null?Stars[1][0]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[1][1]%>><IMG src=<%= Stars[1][1]!=null?Stars[1][1]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[1][2]%>><IMG src=<%= Stars[1][2]!=null?Stars[1][2]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[1][3]%>><IMG src=<%= Stars[1][3]!=null?Stars[1][3]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[1][4]%>><IMG src=<%= Stars[1][4]!=null?Stars[1][4]:"//:0"%> border="0"/></TD>
            <TD width="30" ><input type="submit" name="s7" value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s18" value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[2][0]%>><IMG src=<%= Stars[2][0]!=null?Stars[2][0]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[2][1]%>><IMG src=<%= Stars[2][1]!=null?Stars[2][1]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[2][2]%>><IMG src=<%= Stars[2][2]!=null?Stars[2][2]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[2][3]%>><IMG src=<%= Stars[2][3]!=null?Stars[2][3]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[2][4]%>><IMG src=<%= Stars[2][4]!=null?Stars[2][4]:"//:0"%> border="0"/></TD>
            <TD width="30" ><input type="submit" name="s8" value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s17" value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[3][0]%>><IMG src=<%= Stars[3][0]!=null?Stars[3][0]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[3][1]%>><IMG src=<%= Stars[3][1]!=null?Stars[3][1]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[3][2]%>><IMG src=<%= Stars[3][2]!=null?Stars[3][2]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[3][3]%>><IMG src=<%= Stars[3][3]!=null?Stars[3][3]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[3][4]%>><IMG src=<%= Stars[3][4]!=null?Stars[3][4]:"//:0"%> border="0"/></TD>
            <TD width="30" ><input type="submit" name="s9" value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ><input type="submit" name="s16" value="" style="background-image: url(right.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD>
            <TD width="30" bgcolor=<%= Colors[4][0]%>><IMG src=<%= Stars[4][0]!=null?Stars[4][0]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[4][1]%>><IMG src=<%= Stars[4][1]!=null?Stars[4][1]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[4][2]%>><IMG src=<%= Stars[4][2]!=null?Stars[4][2]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[4][3]%>><IMG src=<%= Stars[4][3]!=null?Stars[4][3]:"//:0"%> border="0"/></TD>
            <TD width="30" bgcolor=<%= Colors[4][4]%>><IMG src=<%= Stars[4][4]!=null?Stars[4][4]:"//:0"%> border="0"/></TD>
            <TD width="30" ><input type="submit" name="s10" value="" style="background-image: url(left.jpg);background-size: 100% 100%; padding: 20px 20px"/></TD> </TR>
        <TR height="30" >
            <TD width="30" ></TD>
            <TD width="30" ><input type="submit" name="s15" value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s14" value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s13" value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s12" value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ><input type="submit" name="s11" value="" style="background-image: url(up.jpg);background-size: 100% 100%; padding: 20px 30px"/></TD>
            <TD width="30" ></TD>
        </TR>
    </TABLE>
       <input type="submit" name="s48" value="Restart"><br/>
        <%=request.getAttribute("error")!=null?request.getAttribute("error"):"" %><br/>
         <%=request.getAttribute("move")!=null?request.getAttribute("move"):"" %><br/>
        <%=request.getAttribute("time")!=null?request.getAttribute("time"):"" %><br/>

</form>
<TABLE width="150" height="150" border="0">
    <TR height="30" >
        <TD width="30" bgcolor="purple"></TD>
        <TD width="30" bgcolor="purple"></TD>
        <TD width="30" bgcolor="purple"></TD>
        <TD width="30" bgcolor="purple"></TD>
        <TD width="30" bgcolor="purple"></TD>
       </TR>
    <TR height="30" >
        <TD width="30" bgcolor="#ffc0cb" style="background-image: url(star.jpg);background-size: 100% 100%; padding: 5px 5px"></TD>
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="#ffc0cb" style="background-image: url(star.jpg);background-size: 100% 100%; padding: 5px 5px"></TD>
        </TR>
    <TR height="30" >
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="#ffc0cb" style="background-image: url(star.jpg);background-size: 100% 100%; padding: 5px 5px"></TD>
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="orange"></TD>
      </TR>
    <TR height="30" >
        <TD width="30" bgcolor="#ffc0cb" style="background-image: url(star.jpg);background-size: 100% 100%; padding: 5px 5px"></TD>
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="orange"></TD>
        <TD width="30" bgcolor="#ffc0cb" style="background-image: url(star.jpg);background-size: 100% 100%; padding: 5px 5px"></TD>
      </TR>
    <TR height="30" >
        <TD width="30"  bgcolor="purple"></TD>
        <TD width="30" bgcolor="purple"></TD>
        <TD width="30" bgcolor="purple"></TD>
        <TD width="30" bgcolor="purple"></TD>
        <TD width="30" bgcolor="purple"></TD>
    </TR>

</TABLE>

<form id="bc" action="/db" method="post">
    <input type = "hidden" name= "userData"  value="<%=userData%>" />
    <input type = "hidden" name= "userName"  value="<%=username%>" />
</form>
<a href="#" onclick="document.getElementById('bc').submit();"style="color:white">
    Game levels</a><br/>
</body>

</html>