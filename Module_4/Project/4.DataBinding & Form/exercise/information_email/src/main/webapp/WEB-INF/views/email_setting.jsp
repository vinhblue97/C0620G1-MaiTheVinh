<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/10/2020
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Setting</title>
</head>
<body>
<div>
    <p>Language: ${email.language}</p>
    <p>Page Size: ${email.pageSize}</p>
    <p>Spam Filter: ${email.spamsFilter}</p>
    <p>Signature: ${email.signature}</p>
    <a href="/home">Back</a>
</div>
</body>
</html>
