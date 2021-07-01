<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 6/30/21
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Random"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Random r = new Random();
    int randNum = r.nextInt((7-1) + 1) + 1;
    if(randNum == 1) {
        response.sendRedirect("/hello-world");
    }else if (randNum == 7) {
        response.sendError(500);
    }
    String textColor = (request.getParameter("color") != null) ? request.getParameter("color")
    : "";
%>
<html>
<head>
    <title>Implicit Objects</title>
</head>
<body>
    <h1><%=randNum%></h1>
    <h3 style="color: <%= textColor%>">The color you chose is <%=textColor%>!</h3>
    <p>Query String: <%=request.getQueryString()%></p>
    <p>Path: <%=request.getRequestURL()%></p>
    <p>User-Agent Header: <%=request.getHeader("user-agent")%></p>
</body>
</html>