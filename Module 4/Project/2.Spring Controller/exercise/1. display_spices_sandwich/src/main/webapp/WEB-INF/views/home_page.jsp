<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/10/2020
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<form action="/save" method="post">
    <input type="checkbox" id="lecttuce" name="spice" value="Lecctuce">
    <label for="lecttuce">Lecctuce</label>
    <input type="checkbox" id="tomato" name="spice" value="Tomato">
    <label for="tomato">Tomato</label>
    <input type="checkbox" id="mustard" name="spice" value="Mustard">
    <label for="mustard">Mustard</label>
    <input type="checkbox" id="sprouts" name="spice" value="Sprouts">
    <label for="sprouts">Sprouts</label><br>
    <button type="submit">Save</button>
</form>
<div>
    <c:forEach var="list" items="${list}">
        <c:out value="${list}"></c:out>
    </c:forEach>
</div>
</body>
</html>
