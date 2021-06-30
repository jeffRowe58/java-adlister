<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 6/30/21
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <style>
            .card{
                position: center;
            }
        </style>
    </head>
    <body>
        <div class="card d-flex justify-content-center align-items-center w-50">
            <form method="POST" action="login.jsp" class="d-flex justify-content-center flex-column">
                <label for="userName">User Name:</label>
                <input id="userName" type="text">
                <label for="password">Password:</label>
                <input id="password" type="password">
                <br>
                <button type="submit">Submit</button>
            </form>
        </div>
    </body>
</html>
