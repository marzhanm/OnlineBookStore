<%@ page import="main.java.dao.CartDAO" %>
<%@ page import="main.java.DatabaseConnector" %>
<%@ page import="main.java.model.Cart" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.12.2023
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600;700&display=swap" rel="stylesheet">
  <title>Cart</title>
</head>
<body>
<div style="width: 1440px; height: 1024px; position: relative; background: #EFEDDE">
  <%
    CartDAO dao=null;try {
dao = new CartDAO(DatabaseConnector.getConnection());} catch (SQLException e) {
    throw new RuntimeException(e);
}
    List<Cart> cart= Collections.singletonList(dao.getBookByUser(1));
    Double totalPrice=0.0;
    for (Cart c:cart){
  %>
  <div class="Group5" style="height: 84px; left: 368px; top: 181px; position: absolute">
    <div class="KlaraAndTheSunKazuoIshiguro" style="width: 168px; left: 0px; top: 0px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 700; word-wrap: break-word">
      "<%= (c != null ? c.getBook_name() : "") %>"  <%= (c != null ? c.getAuthor() : "") %>
    </div>
    <div class="300" style="left: 0px; top: 64px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 600; word-wrap: break-word">
      $<%= (c != null ? c.getPrice() : "") %>
    </div>
  </div>
  <div class="Tovar" style="left: 857px; top: 159px; position: absolute">
    <div class="300" style="left: 360px; top: 0px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 700; word-wrap: break-word">$<%=c.getTotal_price() %></div>
  </div><%}%>
  <div class="Line18" style="width: 560px; height: 0px; left: 64px; top: 136px; position: absolute; border: 1px #AC795A solid"></div>
  <div class="Rectangle75" style="width: 736px; height: 1024px; left: 704px; top: 0px; position: absolute; background: white"></div>
  <div class="Total" style="left: 857px; top: 290px; position: absolute">
    <div class="Total" style="left: 0px; top: 0px; position: absolute; color: black; font-size: 24px; font-family: Montserrat; font-weight: 700; word-wrap: break-word">Total</div>
  </div>
  <div class="Line20" style="width: 423px; height: 0px; left: 859px; top: 260px; position: absolute; border: 1px #AC795A solid"></div>
  <div class="Summary" style="width: 423px; height: 29px; left: 857px; top: 106px; position: absolute">
    <div class="Summary" style="left: 9px; top: 0px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 600; text-transform: uppercase; letter-spacing: 1.28px; word-wrap: break-word">Summary</div>
    <div class="Line19" style="width: 423px; height: 0px; left: 0px; top: 29px; position: absolute; border: 1px #AC795A solid"></div>
  </div>
  <div class="PaymentMethods" style="width: 423px; height: 53px; left: 859px; top: 377px; position: absolute">
    <div class="Rectangle76" style="width: 423px; height: 53px; left: 0px; top: 0px; position: absolute; background: #AC795A; border-radius: 50px"></div>
    <a href="Payment%20Method.html"><div class="PaymentMethods" style="left: 99px; top: 12px; position: absolute; color: white; font-size: 24px; font-family: Montserrat; font-weight: 500; word-wrap: break-word">Payment Methods</div></a>
  </div>
    <div class="Check2" style="width: 20px; height: 20px; left: 99px; top: 297px; position: absolute">
      <div class="Rectangle73" style="width: 20px; height: 20px; left: 0px; top: 0px; position: absolute; border: 1px #AC795A solid"></div>
      <img class="MaterialSymbolsCheck2" style="width: 12px; height: 12px; left: 4px; top: 4px; position: absolute" src="images/material-symbols_check.png" />
    </div>
    <div class="Check" style="width: 231px; height: 30px; left: 368px; top: 291px; position: absolute">
      <div class="Group4" style="width: 30px; height: 30px; left: 201px; top: 0px; position: absolute">
        <div class="Rectangle41" style="width: 30px; height: 30px; left: 0px; top: 0px; position: absolute; border-radius: 5px; border: 1px #AC795A solid"></div>
        <a href="remove"><img class="Trash" style="width: 24px; height: 24px; left: 3px; top: 3px; position: absolute" src="images/mdi_trash-can-outline.png" /></a>
      </div>
    </div>
<a href="Home.jsp"><img class="SimpleLineIconsArrowUp1" style="width: 20px; height: 20px; left: 64px; top: 26px; position: absolute" src="images/simple-line-icons_arrow-up.png" /></a>
</div>
</body>
</html>