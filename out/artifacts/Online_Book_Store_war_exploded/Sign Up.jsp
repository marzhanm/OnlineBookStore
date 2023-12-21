<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.12.2023
  Time: 16:05
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
    <title>Sign Up</title>
</head>
<body>
<div class="SignUp" style="width: 1440px; height: 1024px; position: relative; background: #EFEDDE">
    <div class="Rectangle33" style="width: 720px; height: 1024px; left: 0px; top: 0px; position: absolute; background: #AC795A"></div>
    <div class="WelcomeBack" style="left: 176px; top: 198px; position: absolute; color: white; font-size: 48px; font-family: Montserrat; font-weight: 700; word-wrap: break-word">Welcome Back</div>
    <div class="Rectangle36" style="width: 523px; height: 80px; left: 99px; top: 849px; position: absolute; background: white; border-radius: 50px"></div>
    <a href="Log%20in.jsp"><div class="LogIn" style="left: 322px; top: 874px; position: absolute; color: #AC795A; font-size: 24px; font-family: Montserrat; font-weight: 500; word-wrap: break-word">Log In</div></a>
    <div class="Logo" style="left: 240px; top: 80px; position: absolute">
        <img class="Image24" style="width: 70px; height: 70px; left: 0px; top: 0px; position: absolute" src="images/logo70.png" />
        <div class="Bibiliophile" style="left: 70px; top: 15px; position: absolute; color: white; font-size: 32px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Bibiliophile</div>
    </div>
    <img class="Image40" style="width: 600px; height: 600px; left: 66px; top: 249px; position: absolute" src="images/sign%20up.png" />
    <div class="CreateAccount" style="left: 918px; top: 203px; position: absolute; color: #AC795A; font-size: 40px; font-family: Montserrat; font-weight: 700; word-wrap: break-word">Create Account</div>
    <div class="Rectangle39" style="width: 323px; height: 80px; left: 934px; top: 784px; position: absolute; background: #AC795A; border-radius: 50px"></div>
    <button type="submit" style="width: 323px; height: 80px; left: 934px; top: 784px; position: absolute; background: #AC795A; border-radius: 50px; text-decoration-color: #F5F5F5">Sign Up</button>
    <div class="Rectangle37" style="width: 531px; height: 80px; left: 816px; top: 344px; position: absolute; background: white; border-radius: 50px; border: 3px #AC795A solid"></div>
    <div class="Rectangle38" style="width: 531px; height: 80px; left: 816px; top: 484px; position: absolute; background: white; border-radius: 50px; border: 3px #AC795A solid"></div>
    <form method="post">
    <div class="Username" style="left: 816px; top: 308px; position: absolute; color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Username</div>
    <div class="EmailAddress" style="left: 816px; top: 448px; position: absolute; color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Email Address</div>
    <div class="YourUsername" style="left: 864px; top: 374px; position: absolute; color: #D9D9D9; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">
        <label for="username"></label>
        <input type="text" id="username" class="form-control" placeholder="Your username" required style="border: transparent"/>
    </div>
    <div class="YourEmailAddress" style="left: 864px; top: 514px; position: absolute; color: #D9D9D9; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">
        <label for="email"></label>
        <input type="email" id="email" class="form-control" placeholder="Your email address" required style="border: transparent"/>
    </div>
    <div class="Password" style="left: 824px; top: 588px; position: absolute; color: #AC795A; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">Password</div>
    <div class="Rectangle37" style="width: 523px; height: 80px; left: 824px; top: 624px; position: absolute; background: white; border-radius: 50px; border: 3px #AC795A solid"></div>
    <div class="AtLeast8Characters" style="left: 856px; top: 654px; position: absolute; color: #D9D9D9; font-size: 16px; font-family: Montserrat; font-weight: 400; word-wrap: break-word">
        <label for="password"></label>
        <input type="password" id="password" class="form-control" placeholder="At least 8 characters" required style="border: transparent"/>    </div>
    </form>
</div>
</body>
</html>