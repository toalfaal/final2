<%--
  Created by IntelliJ IDEA.
  User: jinos
  Date: 7/19/2020
  Time: 12:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Panel</title>
    <link rel="stylesheet" href="Manager/CSS/attend.css">

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
                <table style="direction: rtl; position: absolute ;left: 250px ;top: 40px;" >
                    <th style="padding-left: 20px">#</th>
                    <th style="font-size: 20px ;padding-left: 20px  " class="shanbe"><span>شنبه</span></th>
                    <th  style="font-size: 20px ;padding-left: 20px" class="1-shanbe">یکشنبه</th>
                    <th style="font-size: 20px; padding-left: 20px" class="2-shanbe">دوشنبه</th>
                    <th  style="font-size: 20px ; padding-left: 20px" class="3-shanbe">سه شنبه</th>
                    <th  style="font-size: 20px ; padding-left: 20px" class="4-shanbe">چهارشنبه</th>
                    <th  style="font-size: 20px ; padding-left: 20px" class="5-shanbe">پنجشنبه</th>
                    <th  style="font-size: 20px ; padding-left: 20px" class="jomeh">جمعه</th>

                    <tr>
                        <td >1</td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td >3</td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td >5</td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                    </tr>
                    <tr>
                        <td>6</td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td >7</td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                    </tr>
                    <tr>
                        <td>8</td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td >9</td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                    </tr>
                    <tr>
                        <td>10</td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td >11</td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                    </tr>
                    <tr>
                        <td>12</td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                        <td style="background-color: forestgreen"></td>
                        <td></td>
                    </tr>


                </table>
            </form>
        </div>

    </div>






</div>
</body>
</html>