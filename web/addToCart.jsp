<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: mandre3
  Date: 10/7/2017
  Time: 9:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String names = request.getParameter("ids");
    System.out.println(names);
    //response.sendRedirect("/checkout.jsp");
%>
</body>
</html>
