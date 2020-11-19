<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/10/2020
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Greeting</title>
    <meta http-equiv="Content-Type" contentType="text/html;charset=UTF-8"/>
</head>
<body>
<h1 style="color:red">Hello spring</h1>
<form action="/validate" method="post">
    <input type="text" name="input_email" value="${input_email}">
    <p>${validate}</p>
    <button type="submit">Validate</button>
</form>
</body>
</html>
