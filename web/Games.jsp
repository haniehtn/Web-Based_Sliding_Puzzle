<%--
  Created by IntelliJ IDEA.
  User: hanieh
  Date: 8/5/2017 AD
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@page import="layer.pl.UserDataBean"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>levels</title>
    <style>
        body {
            background-image: url("galaxy.jpg");
            font-size:x-large;
        }
        input[type=submit] {
            width: 100px;
            height: 30px;
            color: gold;
            background:mediumpurple;
            border:0 none;
            cursor:hand;
            -webkit-border-radius: 5px;
            border-radius: 5px;
            font-size: large;
        }
        table{
            color:gold;
            font-size: x-large;
        }
    </style>
</head>
<body style="color: white">
<% String userData=request.getAttribute("userData").toString();
    UserDataBean udata=(UserDataBean)request.getSession().getAttribute(userData);
    String username=(String)request.getAttribute("userName");
%>
Total number of movements:<%=(udata.getM1()+udata.getM2()+udata.getM3()+udata.getM4()+udata.getM5()+udata.getM6()+udata.getM7()+udata.getM8()+udata.getM9()+udata.getM10()+udata.getM11()+udata.getM12()+udata.getM13()+udata.getM14()+udata.getM15())%><br/>
Total time consumed:<%=(udata.getT1()+udata.getT2()+udata.getT3()+udata.getT4()+udata.getT5()+udata.getT6()+udata.getT7()+udata.getT8()+udata.getT9()+udata.getT10()+udata.getT11()+udata.getT12()+udata.getT13()+udata.getT14()+udata.getT15()) %><br/>
Last level you won:<%=udata.getLastlevel()%><br/>
<br/>
<TABLE>
    <TR><TD><form action="level1" method="post">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
        <input type="submit"  name="s21" value="level1">
    </form></TD><TD>number of movements:<%=udata.getM1()%></TD><TD>time consumed:<%=udata.getT1()%></TD></TR>
    <TR><TD><form action="level2" method="post">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
        <input type="submit"  name="s23" value="level2">
    </form></TD><TD>number of movements:<%=udata.getM2()%></TD><TD>time consumed:<%=udata.getT2()%></TD></TR>
    <TR><TD><form action="level3" method="post">
        <input type="submit"  name="s25" value="level3">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM3()%></TD><TD>time consumed:<%=udata.getT3()%></TD></TR>
    <TR><TD><form action="level4" method="post">
        <input type="submit"  name="s27" value="level4">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM4()%></TD><TD>time consumed:<%=udata.getT4()%></TD></TR>
    <TR><TD><form action="level5" method="post">
        <input type="submit"  name="s29" value="level5">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM5()%></TD><TD>time consumed:<%=udata.getT5()%></TD></TR>
    <TR><TD><form action="level6" method="post">
        <input type="submit"  name="s31" value="level6">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM6()%></TD><TD>time consumed:<%=udata.getT6()%></TD></TR>
    <TR><TD><form action="level7" method="post">
        <input type="submit"  name="s33" value="level7">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM7()%></TD><TD>time consumed:<%=udata.getT7()%></TD></TR>
    <TR><TD><form action="level8" method="post">
        <input type="submit"  name="s35" value="level8">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM8()%></TD><TD>time consumed:<%=udata.getT8()%></TD></TR>
    <TR><TD><form action="level9" method="post">
        <input type="submit"  name="s37" value="level9">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM9()%></TD><TD>time consumed:<%=udata.getT9()%></TD></TR>
    <TR><TD><form action="level10" method="post">
        <input type="submit"  name="s39" value="level10">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM10()%></TD><TD>time consumed:<%=udata.getT10()%></TD></TR>
    <TR><TD><form action="level11" method="post">
        <input type="submit"  name="s41" value="level11">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM11()%></TD><TD>time consumed:<%=udata.getT11()%></TD></TR>
    <TR><TD><form action="level12" method="post">
        <input type="submit"  name="s43" value="level12">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM12()%></TD><TD>time consumed:<%=udata.getT12()%></TD></TR>
    <TR><TD><form action="level13" method="post">
        <input type="submit"  name="s45" value="level13">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM13()%></TD><TD>time consumed:<%=udata.getT13()%></TR>
    <TR><TD><form action="level14" method="post">
        <input type="submit"  name="s47" value="level14">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM14()%></TD><TD>time consumed:<%=udata.getT14()%></TD></TR>
    <TR><TD><form action="level15" method="post">
        <input type="submit"  name="s49" value="level15">
        <input type = "hidden" name= "userData"  value="<%=userData%>" />
        <input type = "hidden" name= "userName"  value="<%=username%>" />
    </form></TD><TD>number of movements:<%=udata.getM15()%></TD><TD>time consumed:<%=udata.getT15()%></TD></TR>
</TABLE>




<form id="bc" action="/edit" method="post">
<input type = "hidden" name= "userData"  value="<%=userData%>" />
<input type = "hidden" name= "userName"  value="<%=username%>" />
</form>
</body>

<a href="#" onclick="document.getElementById('bc').submit();" style="color: white ">
    صفحه کاربری</a><br/>

</html>
