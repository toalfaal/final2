<%--
  Created by IntelliJ IDEA.
  User: jinos
  Date: 7/19/2020
  Time: 12:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Panel</title>
    <link rel="stylesheet" href="Manager/CSS/change.css">

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
                    <li><a href="request?id=admin&syntax=loadDefine"  class="button1">تعریف حکم <img src="Manager/Image/people.png" class="user-p"></a></li>
                    <li><a  href="request?id=admin&syntax=loadChange"   class="button2">تغیر رده های شغلی <img src="Manager/Image/upgrade.png" class="fish-p"></a></li>
                    <li><a  href="request?id=admin&syntax=loadAttend"   class="button3"> حضور و غیاب <img src="Manager/Image/attendance.png" class="schedule-time-p"></a></li>
                    <li><a href="request?id=admin&syntax=exit" class="button4">     خروج <img src="Manager/Image/exit.png" class="exit-p"></a></li>

                </ul>
            </nav>
        </div>
        <div class="etelaat">
            <form>
                <table style="direction: rtl; position: absolute ;left: 237px ;top: 20px;" >
                    <th>#</th>
                    <th style="font-size: 20px ; padding-left:100px;padding-right: 100px " class="name"><span>نام</span></th>
                    <th  style="font-size: 20px ;padding-left: 50px;padding-right: 50px" class="employeeIDNumber">کد پرسنلی</th>
                    <th style="font-size: 20px" class="upgrade">تغیر رده شغلی</th>

                    <!--                megdar dehi radif jadval az injas-->
                    <tr>
                        <td>1</td>
                        <td>1</td>
                        <td>2</td>
                        <td><select  style="background-color: rgba(0,69,255,0.31)"  >
                            <option value="upgrade">قراردادی</option>
                            <option value="upgrade">کارمند</option>
                            <option value="upgrade">مدیر داخلی</option>
                            <option value="upgrade">مدیر کل</option>
                        </select></td>
                    </tr>
                    <%String strI = (String)request.getAttribute("i");
                        if (strI != null) {
                            int i = Integer.parseInt(strI);
                            for (int j = 0; j < i; j++) {
                                out.print(" <tr>\n" +
                                        "                        <td>"+i+"</td>\n" +
                                        "                        <td>1</td>\n" +
                                        "                        <td>2</td>\n" +
                                        "                        <td><select name=\""+i+"\" style=\"background-color: rgba(0,69,255,0.31)\"  >\n" +
                                        "                            <option value=\"upgrade\" selected >قراردادی</option>\n" +
                                        "                            <option value=\"upgrade\">کارمند</option>\n" +
                                        "                            <option value=\"upgrade\">مدیر داخلی</option>\n" +
                                        "                            <option value=\"upgrade\">مدیر کل</option>\n" +
                                        "                        </select></td>\n" +
                                        "                    </tr>");
                            }
                        }%>

                </table>
                <input type="submit" class="submit-hokm" style="position: absolute; top: 540px ; left: 245px ;padding: 3px 30px ;background-color: rgba(0,69,255,0.86); border-style: none ;border-radius:5mm;font-size: 15px " value="تایید">

            </form>

        </div>

    </div>






</div>
</body>
</html>