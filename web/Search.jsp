<%@ page import="java.util.ArrayList" %>
<%@ page import="Objects.Search" %>
<%@ page import="Objects.Item" %><%--
  Created by IntelliJ IDEA.
  User: mandre3
  Date: 10/7/2017
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
    <%
        String search;
        Search search1 = new Search();
        ArrayList<Item> results = new ArrayList<>();
        if(request.getParameter("searchBox") != null)
        {
            search = request.getParameter("searchBox");
            results = search1.search(search);
            session.setAttribute("results", results);
        }
        /*ArrayList names = new ArrayList(request.getParameterNames());
        for
        */
        //System.out.println(object.toString());
        response.sendRedirect("/checkout.jsp");
    %>

</body>
</html>
