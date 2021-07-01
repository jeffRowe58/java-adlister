<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 6/30/21
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%

if(request.getMethod().equalsIgnoreCase("post")){
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username.equals("TheDude") && password.equals("Yup123!!")){
        response.sendRedirect("/profile.jsp");
    }else{
        response.sendRedirect("/login.jsp");
    }
}

%>

<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <style>
            .card{
                position: absolute;
                left: 50%;
                -webkit-transform: translateX(-50%);
                transform: translateX(-50%);
            }
        </style>
    </head>
    <body>
        <div class="card d-flex justify-content-center align-items-center w-50 bg-primary">
            <form method="POST" action="login.jsp" class="d-flex justify-content-center flex-column">
                <label for="username">User Name:</label>
                <input id="username" name="username" type="text">
                <label for="password">Password:</label>
                <input id="password" name="password" type="password">
                <br>
                <input type="submit">
            </form>
            <%@include file="partials/footer.jsp"%>
        </div>
    </body>
</html>
