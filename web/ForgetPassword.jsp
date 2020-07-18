<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>تغییر رمز</title>
    <link rel="stylesheet" href="./Login/CSS/loginPage.css">
</head>
<body>


<div class="modal4">
    <div class="modal-content">
        <div class="modal-header">
            <h2>تغییر رمز </h2>
        </div>
        <div class="modal-inside">
        <form method="post" action="forgetPass">
                <p>
                    کد پیامک شده :
                </p>
                <input type="text" class="txt" name="code"><br>
                <p>
                    رمز عبور جدید :
                </p>
                <input type="text" class="txt" name="newPassword">
                <div class="repeat_password">
                    <p>
                        تکرار رمز عبور جدید :
                    </p></div>
                <input type="text" class="txt" name="confirmNewPassword">
                <br><br><br>
<%                out.println("<input type=\"hidden\" name=\"serverCode\" value=\""  + request.getParameter("serverCode") + "\">");
%>
            <p><%
                String alert = (String) request.getAttribute("alert");
                if (alert!=null)
                    out.print(alert);
            %></p>

                <button id="btn5" type="submit" class="btnChange"> تغییر رمز عبور</button> <button class="btnEnter" onclick="window.location.href='login'" type="submit" > ورود</button>

        </form>
        </div>
        <div class="modal-footer">

        </div>
    </div>
</div>
</body>
</html>