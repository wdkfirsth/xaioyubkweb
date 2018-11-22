<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/1
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小鱼购物店注册</title>
    <link rel="icon" href="../images/logo.png"/>
    <link rel="stylesheet" href="../css/regist.css" type="text/css"/>

</head>
<body>
<p style="border: 3px  rgba(255,33,42,0.42) solid;height: 30px;text-align: center">
    <strong style="height: 30px;line-height: 30px">新增用户</strong>
</p>
<div class="content" style="margin-top: 100px">
    <div class="neibu">
        <img class="img" src="../images/regist.jpg"/>
        <div id="rights">
            <p>客官，欢迎您的到来！</p>
            <form action="regists" method="post" class="form" onsubmit="return regist()">
                <p><span class="text">昵称：</span><input id="namers" type="text" name="username" onblur="userNameBlur()"/>
                    <b
                            id="ckuser" style="color: red"></b></p>
                <p><span class="text">性别：</span><input type="radio" name="sex" onblur="userNameBlur()" value="男"
                                                       checked/> 男
                    <input type="radio" name="sex" onblur="userNameBlur()" value="女"/> 女
                </p>

                <p><span class="text">密码：</span><input id="pwdrs" type="password" name="password1"
                                                       onblur="pwdBlur()"/><b
                        id="ckpwda" style="color: red"></b></p>
                <p><span class="text">确认密码：</span><input id="ckpwdrs" type="password" name="password2"
                                                         onblur="ckpwdBlur()"/><b id="ckpwdb" style="color: red"></b>
                </p>
                <p><span class="text">邮箱：</span><input id="emailrs" type="email" name="email" onblur="emailBlur()"/><b
                        id="ckemail" style="color: red"></b></p>
                <p><span class="text">生日：</span><input id="birthday" type="text" name="birthday"/><b
                        style="color: green">选填</b></p>
                <p><span class="text">电话：</span><input id="mobile" type="text" name="mobile"/><b
                        id="mobiles" style="color: green">选填</b></p>
                <p><span class="text">地址：</span><input id="addres" type="text" name="address"/><b
                        id="address" style="color: green">选填</b></p>
                <p class="regitbtn"><input class="submit" type="submit" value="注册"/><input class="reset" type="reset"
                                                                                           value="取消"/></p>
            </form>
        </div>
        <div style="clear: both"></div>
    </div>
</div>
<script src="../js/regist.js" type="text/javascript"></script>
</body>

</html>
