<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/10/2020
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Employee</title>
</head>
<body>
<form:form action="/create" method="post" modelAttribute="employee">
    <p>Name</p>
    <form:input type="text" placeholder="Enter employee name" path="name"/>
    <p>Birth Day</p>
    <form:input type="date" path="birthDay"/>
    <br>
    <button type="submit">Create</button>
</form:form>
</body>
</html>
