<%--
  Created by IntelliJ IDEA.
  User: jinos
  Date: 7/19/2020
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Panel</title>
    <link rel="stylesheet" href="Manager/CSS/defineLegal.css">

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
                    <li><a href="request?id=admin&syntax=loadDefine"  class="button1">تعریف حکم <img src="./Manager/Image/people.png" class="user-p"></a></li>
                    <li><a  href="request?id=admin&syntax=loadChange"   class="button2">تغیر رده های شغلی <img src="./Manager/Image/upgrade.png" class="fish-p"></a></li>
                    <li><a  href="request?id=admin&syntax=loadAttend"   class="button3"> حضور و غیاب <img src="./Manager/Image/attendance.png" class="schedule-time-p"></a></li>
                    <li><a href="request?id=admin&syntax=exit" class="button4">     خروج <img src="./Manager/Image/exit.png" class="exit-p"></a></li>

                </ul>
            </nav>
        </div>
        <div class="etelaat">
            <form>
                <table style="direction: rtl; position: absolute ;left: 40px ;top: 170px;" >
                    <tr >
                        <th></th>
                        <th  style="font-size: 20px"class="BaseRate"><span>حقوق پایه</span></th>
                        <th  style="font-size: 20px"class="extraWorkTimeRate">اضافه کاری بر حسب ساعت</th>
                        <th  style="font-size: 20px"class="taxRate">مالیات</th>
                        <th  style="font-size: 20px"class="insuranceRate">حق بیمه</th>
                        <th  style="font-size: 20px"class="maritalStatusRate">حق عائله مندی</th>
                        <th  style="font-size: 20px"class="childRate">حق اولاد</th>
                        <th  style="font-size: 20px"class="WorkExperienceRate ">سنوات</th>
                    </tr>
                    <tr style="text-align: center">
                        <td class="grardadi">قراردادی</td>
                        <td ><input type="text"class="BaseRate-grardadi"> </td>
                        <td ><input type="text"class="extraWorkTimeRate-grardadi"> </td>
                        <td ><input type="text"class="taxRate-grardadi"></td>
                        <td ><input type="text"class="insuranceRate-grardadi"></td>
                        <td ><input type="text"class="maritalStatusRate-grardadi"></td>
                        <td ><input type="text"class="childRate-grardadi"></td>
                        <td ><input type="text"class="WorkExperienceRate-grardadi"></td>

                    </tr>
                    <tr style="text-align: center">
                        <td class="karmand">کارمند</td>
                        <td ><input type="text"class="BaseRate-karmand"> </td>
                        <td ><input type="text"class="extraWorkTimeRate-karmand"></td>
                        <td ><input type="text"class="taxRate-grardadi"></td>
                        <td ><input type="text"class="insuranceRate-karmand"></td>
                        <td ><input type="text"class="maritalStatusRate-karmand"></td>
                        <td ><input type="text"class="childRate-karmand"></td>
                        <td ><input type="text"class="WorkExperienceRate-karmand"></td>

                    </tr>
                    <tr style="text-align: center">
                        <td class="modir-daxeli">مدیر داخلی</td>
                        <td ><input type="text"class="BaseRate-modir-daxeli"></td>
                        <td ><input type="text"class="extraWorkTimeRate-modir-daxeli"></td>
                        <td ><input type="text"class="taxRate-grardadi"></td>
                        <td ><input type="text"class="insuranceRate-modir-daxeli"></td>
                        <td ><input type="text"class="maritalStatusRate-modir-daxeli"></td>
                        <td ><input type="text"class="childRate-modir-daxeli"></td>
                        <td ><input type="text"class="WorkExperienceRate-modir-daxeli"></td>

                    </tr>
                    <tr style="text-align: center">
                        <td  class="modir-kol">مدیرکل</td>
                        <td ><input type="text"class="BaseRate-modir-kol"> </td>
                        <td ><input type="text"class="extraWorkTimeRate-modir-kol"></td>
                        <td ><input type="text"class="taxRate-modir-kol"></td>
                        <td ><input type="text"class="insuranceRate-modir-kol"></td>
                        <td ><input type="text"class="maritalStatusRate-modir-kol"></td>
                        <td ><input type="text"class="childRate-modir-kol"></td>
                        <td ><input type="text"class="WorkExperienceRate-modir-kol"></td>

                    </tr>

                </table>
                <input type="submit" class="submit-hokm"  style="position: absolute; top: 380px ; left: 50px ;padding: 3px 30px ;background-color: #e8210b; border-style: none ;border-radius:5mm;font-size: 15px " value="تایید">
            </form>

        </div>

    </div>






</div>
</body>
</html>