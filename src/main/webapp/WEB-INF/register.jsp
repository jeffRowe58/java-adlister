<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 7/12/21
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form id="userReg" method="post" action="register">
    <div class="form-group">
        <label for="username">Username</label>
        <input id="username" name="username" class="form-control" type="text" placeholder="Please enter a Username" required>
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input id="email" name="email" class="form-control" type="email" placeholder="Please enter an Email" required>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input id="password" name="password" class="form-control" type="password" placeholder="Please enter a Password" required>
    </div>
    <div class="form-group">
        <label for="passwordConfirm">Password</label>
        <input id="passwordConfirm" name="passwordConfirm" class="form-control" type="password" placeholder="Please confirm your Password" required>
    </div>
    <input id="submitBtn" type="submit" class="btn btn-block btn-primary">
</form>
</body>
</html>
