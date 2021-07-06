<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 7/5/21
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View your Color</title>
    <style>
        body{
            background-color: ${param.color};
        }
        h1{
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>Here's your color!</h1>
    <form method="get" action="pickcolor">
        <button type="submit"> Click to go back</button>
    </form>
</body>
</html>
