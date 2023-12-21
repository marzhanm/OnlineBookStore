<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.12.2023
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600;700&display=swap" rel="stylesheet">
  <title>Log In</title>
</head>
<body>
<div class="LogIn" style="width: 1440px; height: 1024px; position: relative; background: #EFEDDE">
  <div class="Logo" style="left: 240px; top: 80px; position: absolute">
    <img class="Image24" style="width: 70px; height: 70px; left: 0px; top: 0px; position: absolute" src="images/logo70-2.png" />
    <div class="Bibiliophile" style="left: 70px; top: 15px; position: absolute; color: #AC795C; font-size: 32px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Bibiliophile</div>
  </div>
  <div class="Rectangle33" style="width: 720px; height: 1024px; left: 720px; top: 0px; position: absolute; background: #AC795A"></div>
  <div class="WelcomeBack" style="left: 176px; top: 198px; position: absolute; color: #AC795A; font-size: 48px; font-family: Montserrat; font-weight: 700; word-wrap: break-word">Welcome Back</div>
  <div class="Rectangle34" style="width: 531px; height: 80px; left: 136px; top: 377px; position: absolute; background: white; border-radius: 50px; border: 3px #AC795A solid"></div>
  <form action="Authentication" method="post">
  <div class="EmailAddress" style="left: 136px; top: 341px; position: absolute; color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Email Address</div>
  <div class="YourEmailAddress" style="left: 184px; top: 407px; position: absolute; color: #D9D9D9; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">
    <label for="loginName"></label>
    <input type="email" id="loginName" class="form-control" placeholder="Your email address" required style="border: transparent" name="email"/></div>
  <div class="Password" style="left: 147px; top: 521px; position: absolute; color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Password</div>
  <div class="Rectangle35" style="width: 523px; height: 80px; left: 144px; top: 557px; position: absolute; background: white; border-radius: 50px; border: 3px #AC795A solid"></div>
  <div class="AtLeast8Characters" style="left: 184px; top: 587px; position: absolute; color: #D9D9D9; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">
    <label for="password"></label>
    <input type="password" id="password" class="form-control" placeholder="At least 8 characters" required style="border: transparent" name="password"/>
  </div>
    <button type="submit" style="width: 523px; height: 80px; left: 144px; top: 717px; position: absolute; background: #AC795A; border-radius: 50px; text-decoration-color: #9F9F9F">Log In</button>
  </form>
  <a href="#"><div class="ForgotPassword" style="left: 500px; top: 653px; position: absolute; color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Forgot Password?</div></a>
  <div class="Line7" style="width: 523px; height: 0px; left: 144px; top: 861px; position: absolute; border: 3px #9F9F9F solid"></div>
  <div class="Group3" style="left: 211px; top: 885px; position: absolute">
    <div class="DonTHaveAnAccount" style="left: 0px; top: 0px; position: absolute; color: black; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Don’t have an account?</div>
    <a href="Sign%20Up.jsp"><div class="SingUp" style="left: 292px; top: 0px; position: absolute; color: #AC795A; font-size: 24px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Sign Up</div></a>
  </div>
  <img class="Image41" style="width: 600px; height: 600px; left: 795px; top: 212px; position: absolute" src="images/sign%20up.png" />
</div>
</body>
</html>
