<%--
  Created by IntelliJ IDEA.
  User: jinos
  Date: 7/18/2020
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Panel</title>
    <link rel="stylesheet" href="Client/CSS/LegalReceipt.css">

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

            <table style="direction: rtl; position: absolute ;left: 50px ;top: 50px;" >
                <tr >
                    <th></th>
                    <th style="font-size: 20px" class="t1"><span>حقوق پایه</span></th>
                    <th  style="font-size: 20px" class="t2">اضافه کاری</th>
                    <th style="font-size: 20px" class="t3">مالیات</th>
                    <th style="font-size: 20px" class="t4">حق بیمه</th>
                    <th style="font-size: 20px" class="t5">حق عائله مندی</th>
                    <th style="font-size: 20px" class="t6">حق اولاد</th>
                    <th  style="font-size: 20px" class="t7">سنوات</th>
                    <th  style="font-size: 20px" class="t8">جمع پرداخت ها</th>
                    <th style="font-size: 20px" class="t9">جمع کسورات</th>
                    <th style="font-size: 20px" class="t10">خالص دریافتی</th>

                </tr>
                <tr style="text-align: center">
                    <td >فروردین</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >اردیبهشت</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >خرداد</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >تیر</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >مرداد</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >شهریور</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >مهر</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >آبان</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >آذر</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >دی</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >بهمن</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr style="text-align: center">
                    <td >اسفند</td>
                    <td>2</td>
                    <td>6</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
            </table>

        </div>
    </div>
</div>

</body>
</html>