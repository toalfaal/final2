<%--
  Created by IntelliJ IDEA.
  User: jinos
  Date: 7/18/2020
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Panel</title>
    <link rel="stylesheet" href="Client/CSS/personalInfo.css">

</head>
<body>
<!--<div>-->
<!--    <img src="image/test7.jpg">-->
<!--</div>-->

<div class="header">
    <div class="container">
        <br>
        <div class="navbar">

            <nav>
                <ul>
                    <li><a href="request?id=1234&syntax=loadPersonalInfo"  class="button1"> اطلاعات شخصی <img src="Client/Image/personalInfo.png" class="user-p"></a></li>
                    <li><a href="request?id=1234&syntax=loadLegalReceipt" class="button2">فیش حقوقی <img src="Client/Image/legalReceipt.png" class="fish-p"></a></li>
                    <li><a href="request?id=1234&syntax=loadScheduleTime"  class="button3"> سابقه کاری <img src="Client/Image/scheduleTime.png" class="schedule-time-p"></a></li>
                    <li><a href="request?id=1234&syntax=exit"  class="button4">     خروج <img src="Client/Image/exit.png" class="exit-p"></a></li>
                </ul>
            </nav>
        </div>
        <div class="etelaat">
            <form method="post">
                <input type="text" class="name-Persian-t">
                <span class="name-Persian">  نام </span><br>

                <input type="text" class="last_name_Persian-t">
                <span class="last_name_Persian"> نام خانوادگی</span><br>

                <input type="text" class="idNumber-t">
                <span class="idNumber"> کد ملی </span><br>

                <input type="text" class="madrak-t">
                <span class="madrak">مدرک تحصیلی</span><br>

                <input type="text " class="cellPhoneNumber-t">
                <span class="cellPhoneNumber">  شماره تلفن همراه </span><br>

                <input type="text" class="homeNumber-t">
                <span class="homeNumber"> تلفن ثابت </span><br>

                <input type="text" class="employeeIDNumber-t">
                <span class="employeeIDNumber"> شماره پرسنلی </span><br>

                <div class="date">
                    <input type="text" class="employment_Year-t">
                    <span class="employment_Year"> تاریخ استخدام به سال </span><br>

                    <input type="text" class="employment_Month-t">
                    <span class="employment_Month">  به ماه </span>

                    <input type="text" class="employment_Day-t">
                    <span class="employment_Day"> به روز </span>
                </div><br>

                <input type="text" class="childCount-t">
                <span class="childCount">  تعداد فرزند </span><br>

                <input type="text" class="maritalStatus-t">
                <span class="maritalStatus">  وضعیت تاهل </span>

                <input type="text" class="categoryName_Persian-t">
                <span class="categoryName_Persian">رده </span>

                <input type="text" class="postName_Persian-t">
                <span class="postName_Persian"> سمت</span>



            </form>

        </div>
    </div>






</div>
</body>
</html>