<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/10/2020
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-12-lg" align="center">Present Time</div>
    </div>
    <div class="row">
        <div class="col-lg-4"></div>
        <div class="col-lg-4">
            <form action="" method="post">
                <select id = "locale" name="select_city" onchange="document.getElementById('locale').submit()">
                    <c:forEach var="listCity" items="${listCity}">
                        <c:if test="${select_city.equals(listCity.keySet())}">
                            <option value="${listCity.keySet()}" selected="selected">${listCity.get(listCity.keySet())}</option>
                        </c:if>
                        <c:if test="${!select_city.equals(listCity.keySet())}">
                            <option value="${listCity.keySet()}">${listCity.get(listCity.keySet())}</option>
                        </c:if>
                    </c:forEach>
                </select>
                <p value="${presentTime}"></p>
                <input id="action_submit">
            </form>
        </div>
        <div class="col-lg-4"></div>
    </div>
</div>
</body>
</html>
