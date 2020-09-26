<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/9/2020
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/ServletTime" method="get">
    <input type="submit" value="Xem giờ">
  </form>
  <%
    String str = (String) request.getAttribute("date");
    if (str!=null){
  %>
  <h2><%=str%></h2>
  <%
    }
  %>
  </body>
</html>
