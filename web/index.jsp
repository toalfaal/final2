<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
</head>
<body>


<%
    RequestDispatcher view = request.getRequestDispatcher("welcom-page.jsp");
    view.forward(request, response);
%>


</body>
</html>