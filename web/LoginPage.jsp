<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login page</title>
    <link rel="stylesheet" href="Login/CSS/loginPage.css">
</head>
<body>
<script src="Login/JS/loginPage.js"></script>
<div class="header">

    <div class="test"></div>
    <div class="container">

        <img class="imageLogo" style="width: 300px; position: absolute  ;  top: 60px;left: -10px" >
        <!--        <div class="navbar">-->

        <!--            <nav>-->
        <!--                <ul>-->
        <!--                    <li><a href="#" id="modal-btn2" class="button">رمز خود را فراموش کرده اید ؟ </a></li>-->
        <!--                </ul>-->
        <!--            </nav>-->
        <!--        </div>-->
    </div>

    <div class="container1">
        <form class="form" method="post" action="login">
            <br> <br> <br> <br>
            <div>
                <span class="span1">نام کاربری: </span> <br>
                <input type="text" name="username"> <br>

                <span class="span1">رمز عبور: </span> <br>
                <input type="text" name="password">
                <br>
                <a href="#" id="modal-btn3" class="button3">رمز خود را فراموش کرده اید ؟ </a>
            </div>
            <br>
            <p class="alert"><%
                String status = (String) request.getAttribute("status");
                if (!String.valueOf(status).equals("null"))
                    if (status.equals("false"))
                        out.print("نام کاربری و یا رمز عبور نا معتبر است.");

                    else
                        out.print("go to next page");
            %></p>
            <br>
            <input class="button" type="submit" name="close" value="ورود" close>
        </form>

    </div>
    <div id="my-modal3" class="modal3">
        <div class="modal-content">
            <div class="modal-header">
                <h2 style="direction: rtl">بازیابی رمزعبور</h2>
            </div>
            <form method="post" action="sendCode">
                <div class="modal-body">
                    <p></p><br>
                    <p1>
                        نام کاربری :
                    </p1>
                    <br>
                    <br>
                    <input style="color: black" type="text" class="txt" name="id"><br>
                    <p class="code">
                        * کد امنیتی برای شماره تلفن ثبت شده ارسال خواهد شد.
                    </p>
                    <button id="modal-btn4" type="submit" class="btn">ارسال کد</button>
                </div>
            </form>
            <div class="modal-footer">

            </div>
        </div>
    </div>
</div>
</body>
</html>