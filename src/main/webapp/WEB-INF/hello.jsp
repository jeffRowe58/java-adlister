<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 7/1/21
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <h1>Hello, ${name}!</h1>
    <form action="hello" method="post">
        <label for="name">Enter Name:</label>
        <input type="text" id="name" name="name">
        <button type="submit">Send It</button>
    </form>
</body>
</html>
