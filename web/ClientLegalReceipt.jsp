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
                    <td>1700</td>
                    <td>0</td>
                    <td>136</td>
                    <td>350</td>
                    <td>0</td>
                    <td>0</td>
                    <td>0</td>
                    <td>1700</td>
                    <td>496</td>
                    <td>1304</td>
                </tr>
                <tr style="text-align: center">
                    <td >اردیبهشت</td>
                    <td>1700</td>
                    <td>0</td>
                    <td>136</td>
                    <td>350</td>
                    <td>0</td>
                    <td>0</td>
                    <td>0</td>
                    <td>1700</td>
                    <td>486</td>
                    <td>1304</td>
                </tr>
                <tr style="text-align: center">
                    <td >خرداد</td>
                    <td>1700</td>
                    <td>840</td>
                    <td>136</td>
                    <td>350</td>
                    <td>0</td>
                    <td>0</td>
                    <td>0</td>
                    <td>2540</td>
                    <td>486</td>
                    <td>2054</td>
                </tr>
                <tr style="text-align: center">
                    <td >تیر</td>
                    <td>1700</td>
                    <td>960</td>
                    <td>136</td>
                    <td>350</td>
                    <td>0</td>
                    <td>0</td>
                    <td>0</td>
                    <td>2660</td>
                    <td>486</td>
                    <td>2174</td>
                </tr>
<%--                <tr style="text-align: center">--%>
<%--                    <td >مرداد</td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                </tr>--%>
<%--                <tr style="text-align: center">--%>
<%--                    <td >شهریور</td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                </tr>--%>
<%--                <tr style="text-align: center">--%>
<%--                    <td >مهر</td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                </tr>--%>
<%--                <tr style="text-align: center">--%>
<%--                    <td >آبان</td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                </tr>--%>
<%--                <tr style="text-align: center">--%>
<%--                    <td >آذر</td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                </tr>--%>
<%--                <tr style="text-align: center">--%>
<%--                    <td >دی</td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                </tr>--%>
<%--                <tr style="text-align: center">--%>
<%--                    <td >بهمن</td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                </tr>--%>
<%--                <tr style="text-align: center">--%>
<%--                    <td >اسفند</td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                    <td></td>--%>
<%--                </tr>--%>
            </table>
            <a href="download" id="modal-btn3" class="button3" style="position: absolute; top: 420px ; left: 50px ;padding: 3px 30px ; color: black;text-decoration:
            none; background-color: #0048ff; border-style: none ;border-radius:5mm;font-size: 15px " value=" "> دانلود آخرین فیش حقوقی</a>

        </div>
    </div>
</div>

</body>
</html>