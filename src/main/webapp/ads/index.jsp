<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 7/6/21
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<c:forEach var="ads" items="${ads}">
    <div class="ads">
        <h2>${ads.title}</h2>
        <p>Description: ${ads.description}</p>
    </div>
</c:forEach>
</body>
</html>
