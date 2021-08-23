<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        h1{
            color: silver;
        }
        body {
            background-image: url("galaxy3.jpg");
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
                 background-color: lightpink;
               border:0 none;
               cursor:hand;
               -webkit-border-radius: 5px;
               border-radius: 5px;
               font-size: medium;
           }input[type=password] {
             background-color: lightpink;
                border:0 none;
                cursor:hand;
                -webkit-border-radius: 5px;
                border-radius: 5px;
                font-size: medium;
            }
    </style>
<meta charset="utf8">
<title>Log in</title>
    <h1>Log in</h1><br/>
</head>
<body>
<form action="user.log" method="post" >
<table class="xx" style="color: hotpink">
<tr><td colspan="2">
<%=request.getAttribute("error")!=null?request.getAttribute("error"):"" %></td></tr>
<tr><td >Username:</td><td><input name="un" id="un" type="text"/></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
<tr><td></td><td><input type="submit" value="Login"/></td></tr>
<tr><td></td><td><input type="hidden" value="Login" name="dd"/></td></tr>
</table>
</form>
<a href="main.jsp" style="color: white ">
Cancel</a>
</body>
</html>