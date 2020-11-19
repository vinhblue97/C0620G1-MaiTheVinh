<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/10/2020
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<p><a href="/create">Create employee</a></p>
<p>${message}</p>
<table border="1">
    <tr >
        <th>Name</th>
        <th>BirthDay</th>
    </tr>
    <c:forEach var="employeeList" items="${employeeList}">
        <tr>
            <td>${employeeList.name}</td>
            <td>${employeeList.birthDay}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
