<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/10/2020
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form id="result_submit" action="/result" method="post">
    <input type="text" name="num1" value="${num1}">
    <input type="text" name="num2" value="${num2}">
    <button type="submit" formaction="/addition">Addition(+)</button>
    <button type="submit" formaction="/subtraction">Subbtraction(-)</button>
    <button type="submit" formaction="/multiplication">Multiplication(*)</button>
    <button type="submit" formaction="/division">Division(/)</button>
</form>
<div>
    <p>${result}</p>
</div>

</body>
</html>
