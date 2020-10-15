<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/10/2020
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Form</title>
</head>
<body>
<form:form action="/save" method="post" modelAttribute="email">
    <div>
        <label style="font-weight: bold;">Language</label>
        <form:input type="text" path="language"/>
        <br>
        <div>
            <label style="font-weight: bold;">Page size</label>
            Show
            <form:select path="pageSize">
                <form:option value="10"/>
                <form:option value="50"/>
                <form:option value="100"/>
                <form:option value="150"/>
            </form:select>
            emails per page
        </div>
        <br>
        <label style="font-weight: bold;">Spams Filter</label>
        <form:checkbox path="spamsFilter" value=""/>
        <br>
        <label style="font-weight: bold;">Signature</label>
        <form:textarea path="signature"/>
        <br>
    </div>
    <div>
        <button type="submit">Update</button>
        <button>Cancel</button>
    </div>
</form:form>
</body>
</html>
