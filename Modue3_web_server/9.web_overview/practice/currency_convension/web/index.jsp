<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24/9/2020
  Time: 8:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Conversion</title>
    <style>
        .convenion {
            border: black solid 2px;
        }
    </style>
</head>
<body>
<div class="/convenion">
    <form action="/convension">
        <input type="number" name="value" value="<%=request.getAttribute("value")%>">
        <input type="text" name="result_" value="<%=request.getAttribute("result")%>">
        <input type="submit" value="Convert">
    </form>
</div>
<script>

</script>

</body>
</html>
