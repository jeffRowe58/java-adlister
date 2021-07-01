<%--
  Created by IntelliJ IDEA.
  User: jeffreyrowe
  Date: 6/30/21
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    request.setAttribute("lactoseIntolerant", true);

    List<String> dairyProducts = new ArrayList<>();
    dairyProducts.add("Milk");
    dairyProducts.add("Cheese");
    dairyProducts.add("Yogurt");
    dairyProducts.add("Ice Cream");
    dairyProducts.add("Cottage Cheese");
    dairyProducts.add("Butter");

    request.setAttribute("dairyProducts", dairyProducts);

    boolean textIsBlue = true;
    request.setAttribute("blue", textIsBlue);
%>

<html>
    <head>
        <title>JSPs: JSTL</title>
    </head>
    <body>
        <h1>Hello</h1>
        <c:choose>
            <c:when test="${lactoseIntolerant}">
                <h1>You're lactose intolerant! Please don't buy any dairy products.</h1>
            </c:when>
            <c:otherwise>
                <h3>Dairy Products List</h3>
                <c:forEach items="${dairyProducts}" var="dairyProduct">
                    <div>
                        <p>${dairyProduct}</p>
                    </div>
                </c:forEach>
            </c:otherwise>
        </c:choose>

        <c:if test="${blue}">
            <p style="color: blue">Yay! Blue text!</p>
        </c:if>

    </body>
</html>