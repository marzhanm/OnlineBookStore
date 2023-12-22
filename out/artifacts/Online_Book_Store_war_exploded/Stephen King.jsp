<%@ page import="main.java.dao.BookDAO" %>
<%@ page import="main.java.DatabaseConnector" %>
<%@ page import="main.java.model.BookD" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.12.2023
  Time: 07:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600;700&display=swap" rel="stylesheet">
  <title>Stephen King</title>
</head>
<body>

<jsp:useBean id="add" type="main.java.servlet.AddCartCommand"/>
<c:if test="${not empty add}">
  <div class="message">
      ${add}
  </div>
  <script type="text/javascript">
    showMessage();

    function showMessage() {
      $('.message').addClass('display');
      setTimeout(() => {
        $('.message').removeClass('display');
      }, 2000);
    }
  </script>
  <c:remove var="add" scope="session"/>
</c:if>

<%--Footer--%>
<div class="StephanKing" style="width: 1440px; height: 1439px; position: relative; background: #EFEDDE">
  <div class="Footer" style="width: 1440px; height: 83px; left: 0px; top: 1356px; position: absolute">
    <div class="Rectangle13" style="width: 1440px; height: 83px; left: 0px; top: 0px; position: absolute; background: #AC795A"></div>
    <div class="Frame177" style="width: 491px; height: 20px; left: 885px; top: 32px; position: absolute; justify-content: flex-start; align-items: flex-start; gap: 32px; display: inline-flex">
      <a href="about%20us.html"><div class="AboutUs" style="color: white; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">About us</div></a>
      <a href="Discounts.html"><div class="SeasonTicket" style="color: white; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Season ticket</div></a>
      <a href="Payment%20Method.html"><div class="PaymentMethod" style="color: white; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Payment method</div></a>
      <a href="Contact%20us.html"><div class="Contacts" style="color: white; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Contacts</div></a>
    </div>
    <div class="Logo" style="width: 121px; height: 35px; left: 40px; top: 24px; position: absolute">
      <div class="Bibliophile" style="left: 35px; top: 8px; position: absolute; color: white; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Bibliophile</div>
      <img class="Image21" style="width: 35px; height: 35px; left: 0px; top: 0px; position: absolute" src="images/white%20logo.png" />
    </div>
  </div>

<%--  Header--%>
  <div class="Categories" style="width: 1312px; height: 120px; left: 64px; top: 139px; position: absolute">
    <div class="Rectangle27" style="width: 1312px; height: 120px; left: 0px; top: 0px; position: absolute; background: white; border-radius: 30px"></div>
    <div class="Rectangle28" style="width: 1312px; height: 120px; left: 0px; top: 0px; position: absolute; background: white; border-radius: 30px"></div>
    <a href="Horror.html"><div class="Horror" style="left: 112px; top: 46px; position: absolute; color: #4A2C1A; font-size: 24px; font-family: Montserrat; font-weight: 600; word-wrap: break-word">Horror</div></a>
    <a href="Fantasy.html"><div class="Fantasy" style="left: 333px; top: 46px; position: absolute; color: #AC795A; font-size: 24px; font-family: Montserrat; font-weight: 600; word-wrap: break-word">Fantasy</div></a>
    <a href="Crime.html"><div class="Crime" style="left: 570px; top: 46px; position: absolute; color: #AC795A; font-size: 24px; font-family: Montserrat; font-weight: 600; word-wrap: break-word">Crime</div></a>
    <a href="Biography.html"><div class="Biography" style="left: 785px; top: 46px; position: absolute; color: #AC795A; font-size: 24px; font-family: Montserrat; font-weight: 600; word-wrap: break-word">Biography</div></a>
    <a href="Romance.html"><div class="Romance" style="left: 1053px; top: 46px; position: absolute; color: #AC795A; font-size: 24px; font-family: Montserrat; font-weight: 600; word-wrap: break-word">Romance</div></a>
  </div>
<%--  Author List--%>
  <div style="width: 1312px; height: 269px; left: 64px; top: 259px; position: absolute">
    <div style="width: 1312px; height: 269px; left: 0px; top: 0px; position: absolute; background: #F5F5F5; box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25) inset; border-radius: 30px; border: 1px #AC795A solid"></div>
    <a href="Stephen%20King.jsp"><div style="left: 112px; top: 101px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Stephen King</div></a>
    <div style="left: 112px; top: 32px; position: absolute; color: #AC795A; font-size: 24px; font-family: Montserrat; font-weight: 600; word-wrap: break-word">Authors</div>
    <div style="width: 1152px; height: 0px; left: 80px; top: 70px; position: absolute; opacity: 0.15; border: 2px #4A2C1A solid"></div>
    <div style="width: 1152px; height: 0px; left: 80px; top: 69px; position: absolute; opacity: 0.15; border: 2px #4A2C1A solid"></div>
    <a href="Lovecraft.html"><div style="left: 112px; top: 137px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">H.P. Lovecraft</div></a>
    <a href="Edgar%20Allan%20Poe.html"><div style="left: 112px; top: 173px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Edgar Allan Poe</div></a>
    <a href="Shirley%20Jackson.html"><div style="left: 112px; top: 209px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Shirley Jackson</div></a>
  </div>
  <div style="width: 30px; height: 30px; left: 1313px; top: 988px; position: absolute">
    <div class="Ellipse8" style="width: 30px; height: 30px; left: 0px; top: 0px; position: absolute; background: #AC795A; border-radius: 9999px"></div>
    <div class="MdiHeartOutline" style="width: 26px; height: 26px; padding-top: 3.25px; padding-bottom: 2.87px; padding-left: 2.17px; padding-right: 2.17px; left: 2px; top: 2px; position: absolute; justify-content: center; align-items: center; display: inline-flex">
      <div class="Vector" style="width: 21.67px; height: 19.88px; background: white"></div>
    </div>
  </div>

<%--  Stephen King --%>
  <%

    BookDAO dao= null;
    try {
      dao = new BookDAO(DatabaseConnector.getConnection());
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    BookD b= (BookD) dao.getByCategoriesAuthors("Horror", "Stephen King");
  %>
  <div class="Line11" style="width: 109px; height: 0px; left: 176px; top: 382.50px; position: absolute; border: 1px black solid"></div>
  <div class="StephenKingSBooks" style="width: 196px; left: 622px; top: 628px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 600; word-wrap: break-word">Stephen King’s Books</div>
  <div style="width: 47px; height: 20px; left: 302px; top: 1174px; position: absolute">
    <div class="Rectangle30" style="width: 47px; height: 20px; left: 0px; top: 0px; position: absolute; background: #AC795C; border-radius: 30px"></div>
    <div class="IcOutlineShoppingCart" style="width: 20px; height: 20px; left: 14px; top: 0px; position: absolute">
      <div class="Vector" style="width: 16.67px; height: 16.67px; left: 0.83px; top: 1.67px; position: absolute; background: white"></div>
      <div class="Vector" style="width: 16.67px; height: 16.67px; left: 0.83px; top: 1.67px; position: absolute; background: white"></div>
    </div>
  </div>
  <div style="width: 47px; height: 20px; left: 648px; top: 1176px; position: absolute">
    <div class="Rectangle30" style="width: 47px; height: 20px; left: 0px; top: 0px; position: absolute; background: #AC795C; border-radius: 30px"></div>
    <a href="Cart.jsp"><img class="8" style="width: 47px; height: 20px; left: 0px; top: 0px; position: absolute" src="images/telezhka.png" /></a>
  </div>
  <div style="width: 47px; height: 20px; left: 994px; top: 1176px; position: absolute">
    <div class="Rectangle30" style="width: 47px; height: 20px; left: 0px; top: 0px; position: absolute; background: #AC795C; border-radius: 30px"></div>
    <a href="Cart.jsp"><img class="8" style="width: 47px; height: 20px; left: 0px; top: 0px; position: absolute" src="images/telezhka.png" /></a>
  </div>
  <div class="FairyTaleStephenKing" style="width: 200px; left: 99px; top: 1118px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">“
    <span class="text"><%=dao.getBookById(931).getBookName()%></span>” <br/>Stephen King
    <div style="width: 47px; height: 20px; left: 302px; top: 1174px; position: absolute">
      <div class="Rectangle30" style="width: 47px; height: 20px; left: 0px; top: 0px; position: absolute; background: #AC795C; border-radius: 30px"></div>
      <a href="add?book_id=<%=b.getBook_id()%>"><img class="8" style="width: 47px; height: 20px; left: 0px; top: 0px; position: absolute" src="images/telezhka.png" /></a>
    </div>
  </div>
  <div class="TheInstituteStephenKing" style="width: 207px; left: 445px; top: 1120px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">“The Institute” Stephen King</div>
  <div class="965" style="left: 99px; top: 1174px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">$9.65</div>
  <div class="1275" style="left: 445px; top: 1176px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">$12.75</div>
  <div class="2535" style="left: 798px; top: 1176px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">$25.35</div>
  <div class="1168" style="left: 1137px; top: 1176px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">$11.68</div>
  <img class="Image61" style="width: 250px; height: 350px; left: 99px; top: 744px; position: absolute" src="images/Stephen%20king1.png" />
  <img class="Image63" style="width: 250px; height: 350px; left: 445px; top: 744px; position: absolute" src="images/Stephen%20king2.png" />
  <img class="Image64" style="width: 250px; height: 350px; left: 791px; top: 744px; position: absolute" src="images/Stephen%20king3.png" />
  <img class="Image65" style="width: 250px; height: 350px; left: 1137px; top: 744px; position: absolute" src="images/Stephen%20king4.png" />
  <div class="RevivalStephenKing" style="left: 798px; top: 1118px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">“Revival”<br/>Stephen King</div>
  <div class="UnderTheDomeStephenKing" style="left: 1137px; top: 1118px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">“Under the dome”<br/>Stephen King</div>
  <a href="Cart.jsp"><img class="8" style="width: 47px; height: 20px; left: 1340px; top: 1176px; position: absolute" src="images/telezhka.png" /></a>
  <div class="Header" style="width: 1312px; height: 35px; left: 64px; top: 32px; position: absolute">
    <div class="Frame178" style="left: 445px; top: 8px; position: absolute; justify-content: flex-start; align-items: flex-start; gap: 56px; display: inline-flex">
      <a href="Home.jsp"><div class="Home" style="color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Home</div></a>
      <a href="Categories.html"><div class="Categories" style="color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Categories</div></a>
      <a href="Discounts.html"><div class="Discounts" style="color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Discounts</div></a>
      <a href="Contact%20us.html"><div class="Contact" style="color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Contact</div></a>
    </div>
    <img class="Image8" style="width: 35px; height: 35px; left: 0px; top: 0px; position: absolute" src="images/logo.png" />
    <div class="Bibiliophile" style="left: 35px; top: 8px; position: absolute; color: #AC795C; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Bibiliophile</div>
    <div class="Search" style="width: 120px; height: 25px; left: 1024px; top: 5px; position: absolute">
      <div class="Rectangle72" style="width: 120px; height: 25px; left: 0px; top: 0px; position: absolute; border-radius: 30px; border: 1px #AC795A solid"></div>
      <a href="#"><img class="Search1" style="width: 24px; height: 24px; left: 87px; top: 0px; position: absolute" src="images/search.png" /></a>
    </div>
    <div class="Frame189" style="left: 1176px; top: 5px; position: absolute; justify-content: flex-start; align-items: flex-start; gap: 32px; display: inline-flex">
      <a href="Favourites.html"><img class="Heart1" style="width: 24px; height: 24px" src="images/heart.png" /></a>
      <a href="Cart.jsp"><img class="Shop1" style="width: 24px; height: 24px" src="images/shop.png" /></a>
      <a href="Log%20in.jsp"><img class="Profile1" style="width: 24px; height: 24px" src="images/profile.png" /></a>
    </div>
  </div>
</div>
</body>
</html>
