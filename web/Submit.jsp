<%@ page import="Objects.Cart" %>
<%@ page import="Objects.Customer" %><%--
  Created by IntelliJ IDEA.
  User: mandre3
  Date: 10/7/2017
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        Cart cart = (Cart) session.getAttribute("cart");
        if(!cart.checkBalance())
        {
            session.setAttribute("balance", cart.checkBalance() + "");
            response.sendRedirect("checkout.jsp");
        }
        else if(cart.checkBalance()) {
            cart.checkout();
            session.setAttribute("cart", new Cart());
            response.sendRedirect("https://www.gmail.com");
        }
    %>
</head>
<body>

</body>
</html>
