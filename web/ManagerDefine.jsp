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
            <form method="post" action="submitDefine">
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
                        <td ><input name="GBase" type="text"class="BaseRate-grardadi" value="170"> </td>
                        <td ><input name="GExtra" type="text"class="extraWorkTimeRate-grardadi" value="4"> </td>
                        <td ><input name="GTax" type="text"class="taxRate-grardadi" value="8%"></td>
                        <td ><input name="GInsure" type="text"class="insuranceRate-grardadi" value="350"></td>
                        <td ><input name="GMar" type="text"class="maritalStatusRate-grardadi" value="200"></td>
                        <td ><input name="GChild" type="text"class="childRate-grardadi" value="135"></td>
                        <td ><input name="GWork" type="text"class="WorkExperienceRate-grardadi" value="30"></td>

                    </tr>
                    <tr style="text-align: center">
                        <td class="karmand">کارمند</td>
                        <td ><input name="KBase"type="text"class="BaseRate-karmand" value="230"> </td>
                        <td ><input name="KExtra" type="text"class="extraWorkTimeRate-karmand" value="2"></td>
                        <td ><input name="KTax" class="taxRate-grardadi" value="10%"></td>
                        <td ><input name="KInsure" type="text"class="insuranceRate-karmand" value="350"></td>
                        <td ><input name="KMar" type="text"class="maritalStatusRate-karmand" value="280"></td>
                        <td ><input name="KChild" type="text"class="childRate-karmand" value="170"></td>
                        <td ><input name="KWork" type="text"class="WorkExperienceRate-karmand" value="40"></td>

                    </tr>
                    <tr style="text-align: center">
                        <td class="modir-daxeli">مدیر داخلی</td>
                        <td ><input name="MDBase"type="text"class="BaseRate-modir-daxeli" value="270"></td>
                        <td ><input name="MDExtra" type="text"class="extraWorkTimeRate-modir-daxeli" value="3"></td>
                        <td ><input name="MDTax" type="text" class="taxRate-grardadi" value="12%"></td>
                        <td ><input name="MDInsure" type="text" class="insuranceRate-modir-daxeli" value="350"></td>
                        <td ><input name="MDMar" type="text"class="maritalStatusRate-modir-daxeli" value="330"></td>
                        <td ><input name="MDChild" type="text"class="childRate-modir-daxeli" value="200"></td>
                        <td ><input name="MDWork" type="text"class="WorkExperienceRate-modir-daxeli" value="50"></td>

                    </tr>
                    <tr style="text-align: center">
                        <td  class="modir-kol">مدیرکل</td>
                        <td ><input name="MKBase" type="text" class="BaseRate-modir-kol" value="330"> </td>
                        <td ><input name="MKExtra" type="text" class="extraWorkTimeRate-modir-kol" value="1"></td>
                        <td ><input name="MKTax" type="text" class="taxRate-modir-kol" value="14%"></td>
                        <td ><input name="MKInsure" type="text" class="insuranceRate-modir-kol" value="350"></td>
                        <td ><input name="MKMar" type="text" class="maritalStatusRate-modir-kol" value="400"></td>
                        <td ><input name="MKChild" type="text" class="childRate-modir-kol" value="250"></td>
                        <td ><input name="MKWork" type="text" class="WorkExperienceRate-modir-kol" value="60"></td>

                    </tr>

                </table>
                <input type="submit" class="submit-hokm"  style="position: absolute; top: 380px ; left: 50px ;padding: 3px 30px ;background-color: #e8210b; border-style: none ;border-radius:5mm;font-size: 15px " value="تایید">
            </form>

        </div>

    </div>






</div>
</body>
</html>