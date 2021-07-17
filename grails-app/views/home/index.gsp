<%--
  Created by IntelliJ IDEA.
  User: ZakiPC
  Date: 7/17/2021
  Time: 1:14 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Home</title>
</head>

<body>
    <h1>Hello world</h1>
    <g:each status="i" var="item" in="${test_data['data']}">
        <p>${item['name']}</p>
    </g:each>
</body>
</html>