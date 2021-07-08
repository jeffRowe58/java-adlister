<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>
    <div>
        <h3>Welcome ${sessionScope.isUser}!</h3>
    </div>

    <div>
        <form method="post" action="logout">
            <button type="submit">Logout</button>
        </form>
    </div>

</body>
</html>
