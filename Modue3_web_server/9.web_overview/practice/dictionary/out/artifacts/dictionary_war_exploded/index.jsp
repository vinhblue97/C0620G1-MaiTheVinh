<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/9/2020
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form action="/dictionary">
    <input type="text" name="keyword" placeholder="Enter your word:">
    <input type="submit" value="Search">
    <p id="display" value=""></p>
    <%=request.getAttribute("result")%>
  </form>
  <script>

  </script>
  </body>
</html>
