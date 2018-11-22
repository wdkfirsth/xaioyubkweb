<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小鱼购物店管理员</title>
    <link rel="icon" href="../images/logo.png"/>
    <link rel="stylesheet" href="../css/manager.css"/>

</head>
<body>

    <header id="head">

    <div id="header">
        <b>管理员admin您好，欢迎回到管理后台。</b>
        <span style="float: right">
                 <img class="gouwuche" src="../images/re.png" style="width: 20px;height: 20px;vertical-align: middle"/>
                <a href="../main.jsp" style="vertical-align: middle">返回前台页面</a>
            </span>
    </div>

</header>

    <div id="navBar" >
    <dl>
        <dt ><a href="welcome.jsp" target="all">首页</a></dt>
        <dt><a href="user" target="all">用户</a></dt>
        <dt><a href="infoPr" target="all">商品</a></dt>
        <dt><a href="#">订单</a></dt>
        <dt><a href="#">留言</a></dt>
        <dt><a href="#">新闻</a></dt>
        <%--<dt style="float: right;color: white;height: 40px;line-height: 40px;margin-right: 5px"><b>管理员admin您好，欢迎来到管理后台</b></dt>--%>
    </dl>
    </div>

    <div id="fix">
        <dl>
            <dt>
                <dd class="texta"><b>用户管理</b></dd>
                <dd class="text" >
                    <img src="../images/more.png" width="25" height="25"  style="vertical-align: middle"/>
                    <span ><a href="user" target="all">用户信息</a></span>
                    <span class="textt"><a href="regists.jsp" target="all">新增</a></span>
                </dd>
            </dt>
            <dt>
                <dd class="texta"><b>商品信息</b></dd>
                <dd class="text">
                    <img src="../images/more.png" width="25" height="25"  style="vertical-align: middle"/>
                    <span ><a href="productSelect" target="all" >分类管理</a></span>
                    <span class="textt"><a href="productAdd.jsp"target="all" >新增</a> </span>
                </dd>
                <dd class="text">
                    <img src="../images/more.png" width="25" height="25"  style="vertical-align: middle"/>
                    <span ><a href="infoPr" target="all">商品管理</a></span>
                    <span class="textt"><a href="addpr.jsp" target="all">新增</a> </span>
                </dd>
            </dt>
            <dt>
                <dd  class="texta"><b>订单管理</b></dd>
                <dd class="text">
                    <img src="../images/more.png" width="25" height="25"  style="vertical-align: middle"/>
                    <span ><a href="#">订单管理</a></span>
                    <span class="texts">新增</span>
                </dd>
            </dt>
            <dt>
                <dd class="texta"><b>留言管理</b></dd>
                <dd class="text">
                    <img src="../images/more.png" width="25" height="25"  style="vertical-align: middle"/>
                    <span ><a href="#">留言管理</a> </span>
                    <span class="texts">新增 </span>
                </dd>
            </dt>
            <dt>
                <dd class="texta"><b>新闻管理</b></dd>
                <dd class="text">
                    <img src="../images/more.png" width="25" height="25" style="vertical-align: middle"/>
                    <span class="text"><a href="#">新闻管理</a> </span>
                    <span class="texts">新增 </span>
                </dd>
            </dt>
        </dl>

    </div>

    <div id="content" style="margin-top: 50px">
        <p><span>您现在的位置：</span><span><a href="../login.jsp">小鱼购物店</a></span><span> &gt;管理后台</span></p>
        <div class="updatehtml">
                <iframe name="all" align="center" width="100%" height="100%" frameborder="0" marginheight="0" marginwidth="0" border="0"  src="welcome.jsp" ></iframe>
        </div>

    </div>

</body>
</html>
