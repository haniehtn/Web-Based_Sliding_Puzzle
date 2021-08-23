<%--
  Created by IntelliJ IDEA.
  User: hanieh
  Date: 8/11/2017 AD
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@page import="layer.pl.UserDataBean"%>
<%@page import="layer.pl.PLException"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Top Users</title>
    <style>
        body {
            background-image: url("galaxy.jpg");
            color: lightpink;
            font-size:x-large;
        }
        table, th, td {
            color: white;
            border: 1px solid mediumpurple;
            padding: 10px;
            font-size:x-large;

        }
    </style>
</head>
<body>
<% String userData=request.getAttribute("userData").toString();
    UserDataBean udata=(UserDataBean)request.getSession().getAttribute(userData);
    String username=(String)request.getAttribute("userName");
%>
Top users in total:<br/>
<%=udata.getRankslevel(0).split("/")[0]%><br/>
<%=udata.getRankslevel(0).split("/")[1]%><br/>
<br/>
<Table style="width:100%">
    <TR><TD>Level:</TD><TD>Based on movement:</TD><TD>Based on time:</TD></TR>
    <TR><TD>1</TD><TD><%=udata.getRankslevel(1).split("/")[0]%></TD><TD><%=udata.getRankslevel(1).split("/")[1]%></TD></TR>
    <TR><TD>2</TD><TD><%=udata.getRankslevel(2).split("/")[0]%></TD><TD><%=udata.getRankslevel(2).split("/")[1]%></TD></TR>
    <TR><TD>3</TD><TD><%=udata.getRankslevel(3).split("/")[0]%></TD><TD><%=udata.getRankslevel(3).split("/")[1]%></TD></TR>
    <TR><TD>4</TD><TD><%=udata.getRankslevel(4).split("/")[0]%></TD><TD><%=udata.getRankslevel(4).split("/")[1]%></TD></TR>
    <TR><TD>5</TD><TD><%=udata.getRankslevel(5).split("/")[0]%></TD><TD><%=udata.getRankslevel(5).split("/")[1]%></TD></TR>
    <TR><TD>6</TD><TD><%=udata.getRankslevel(6).split("/")[0]%></TD><TD><%=udata.getRankslevel(6).split("/")[1]%></TD></TR>
    <TR><TD>7</TD><TD><%=udata.getRankslevel(7).split("/")[0]%></TD><TD><%=udata.getRankslevel(7).split("/")[1]%></TD></TR>
    <TR><TD>8</TD><TD><%=udata.getRankslevel(8).split("/")[0]%></TD><TD><%=udata.getRankslevel(8).split("/")[1]%></TD></TR>
    <TR><TD>9</TD><TD><%=udata.getRankslevel(9).split("/")[0]%></TD><TD><%=udata.getRankslevel(9).split("/")[1]%></TD></TR>
    <TR><TD>10</TD><TD><%=udata.getRankslevel(10).split("/")[0]%></TD><TD><%=udata.getRankslevel(10).split("/")[1]%></TD></TR>
    <TR><TD>11</TD><TD><%=udata.getRankslevel(11).split("/")[0]%></TD><TD><%=udata.getRankslevel(11).split("/")[1]%></TD></TR>
    <TR><TD>12</TD><TD><%=udata.getRankslevel(12).split("/")[0]%></TD><TD><%=udata.getRankslevel(12).split("/")[1]%></TD></TR>
    <TR><TD>13</TD><TD><%=udata.getRankslevel(13).split("/")[0]%></TD><TD><%=udata.getRankslevel(13).split("/")[1]%></TD></TR>
    <TR><TD>14</TD><TD><%=udata.getRankslevel(14).split("/")[0]%></TD><TD><%=udata.getRankslevel(14).split("/")[1]%></TD></TR>
    <TR><TD>15</TD><TD><%=udata.getRankslevel(15).split("/")[0]%></TD><TD><%=udata.getRankslevel(15).split("/")[1]%></TD></TR>


</Table>
<form id="bc" action="/edit" method="post">
    <input type = "hidden" name= "userData"  value="<%=userData%>" />
    <input type = "hidden" name= "userName"  value="<%=username%>" />
</form>
</body>

<a href="#" onclick="document.getElementById('bc').submit();" style="color: white ">
    َUser page</a><br/>

</html>
