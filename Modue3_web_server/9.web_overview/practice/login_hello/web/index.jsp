<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/9/2020
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login and Hello</title>
  </head>
  <body>
<form action="/login", method="post">
  <input type="text" name="user_name" placeholder="User name">
  <input type="password" name="password" placeholder="Password">
  <input type="submit" value="Log in">
</form>
  </body>
</html>
