<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/1
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小鱼购物店登录</title>
    <link rel="icon" href="images/logo.png"/>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>

</head>
<body>
<div id="all">

    <header id="head">

        <div id="header">
            <b>欢迎来到小鱼购物店！</b>
            <span style="float: right">
                <img class="gouwuche" src="images/gouwuche.png" style="width: 30px;height: 30px"/>
                <a href="login.jsp">登录</a>|
                <a href="regist.jsp">注册</a>
            </span>
        </div>

    </header>

    <div id="content">
        <div id="nei">
            <h2 style="text-align: center">用户登录</h2>

            <form action="login" method="post" class="form" accept-charset="UTF-8" onsubmit="return login()">
                <table>
                    <tr>
                        <td width="130px"></td>
                        <td>
                            <p class="users">
                                <img src="images/user.png"/>
                                <input id="userLogin" type="text" name="username" placeholder="请输入用户名"
                                       onblur="userNameBlur()"/>

                            </p>
                        </td>
                        <td><b style="color: red" id="userlg"></b></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <p class="pwd">
                                <img src="images/pwd.png"/>
                                <input id="pwdLogin" type="password" name="password" placeholder="请输入密码"
                                       onblur="pwdBlur()"/>

                            </p>
                        </td>
                        <td><b style="color: red" id="pwdlg"></b></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <p class="codetxt">请输入验证码：</p>
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <p class="yzcode"><input id="codeLogin" type="text" name="checkcode" size="10"
                                                     onblur="codeBlur()"/>
                                <b id="codeyz"
                                   style="margin-left: 50px;vertical-align:middle;color: white;background-color:rgba(0,0,0,0.46)">验证码</b>


                            </p>

                        </td>
                        <td><b style="color: red" id="codelg"></b></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="button" value="换一张?" style="margin: 3px" onclick="createCode()"/>
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <p class="button">
                                <input type="submit" value="登录" style="margin: 3px;width: 200px">
                            </p>
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <p class="imgs">
                                <img src="images/QQ.png" style="width: 40px;height: 40px"/>
                                <img src="images/wx.png" style="width: 35px;height: 35px"/>
                                <img src="images/web.png" style="width: 35px;height: 35px"/>
                            </p>
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <p class="three">第三方登录</p>
                        </td>
                        <td></td>
                    </tr>
                </table>
            </form>
        </div>

    </div>

    <footer id="foot"><strong>Created By : 2018-电子科技大学-软件一班-第三组</strong></footer>
</div>
<script>

</script>
</body>
<script type="text/javascript" src="js/login.js"></script>
</html>
