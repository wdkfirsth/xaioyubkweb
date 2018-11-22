<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/1
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小鱼购物店</title>
    <link rel="icon" href="images/logo.png"/>
    <link rel="stylesheet" href="css/main.css" type="text/css">
</head>
<body>
<div id="all">
    <%-- 顶部--%>
    <header id="header">
            <sapn style="margin-left: 10px;display: inline-block;height: 30px;line-height: 30px">欢迎您的到来:</sapn>
            <b style="margin-right: 10px;display: inline-block;height: 30px;line-height: 30px">用户名！</b>
            <span style="float: right;margin-right: 10px;display: inline-block;height: 30px;line-height: 30px"><a href="login.jsp" >退出登录</a></span>
    </header>
        <%-- 导航栏 --%>
        <div id="navigationBar">
            <dl>
                <dt><a href="#">首页</a></dt>
                <dt><a href="#">美食</a></dt>
                <dt><a href="#">运动</a></dt>
                <dt><a href="#">电器</a></dt>
                <dt><a href="#">手机</a></dt>
                <dt><a href="#">电脑</a></dt>
                <dt><a href="#">品牌</a></dt>
                <dt><a href="#">生活用品</a></dt>
                <dt style="float: right"><input type="text" style="margin-right: 10px"/><input type="button" value="搜索"style="margin-right: 10px"/></dt>
            </dl>

        <%-- 导航栏内容 --%>

        <div id="changGv">
            <%-- 首页 --%>
            <div id="index">
                <iframe  align="center" width="900" height="" src=""  frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no"></iframe>
            </div>

        </div>

    </div>
        <%-- 商品展示页 --%>
        <div id="show" >
            <p>
                <span>您现在的位置：</span>
                <span><a href="#">小鱼购物店</a></span>&gt;
                <span><a href="#">首页</a></span>&gt;
            </p>
            <div class="look">
                <p>最近浏览</p>
                <p><img src="images/logo.png" style="width: 100px;height: 100px"/></p>

            </div>
            <div class="shop" style="margin-left: 50%">
                <p>商品详情</p>
                <dl>
                    <dt><img src="images/logo.png" style="width: 200px;height: 200px;border: 1px #000000 solid"/></dt>
                    <dt >
                        <section class="section">

                            <p><span class="text">零售价：</span><span>￥</span></p>
                            <p><span class="text">邮递方式：</span><span>
                                <select class="select">
                                    <option value="1">圆通</option>
                                    <option value="2">顺丰</option>
                                    <option value="3">中通</option>
                                    <option value="4">京东</option>
                                    <option value="5">天天</option>
                                    <option value="6">邮政</option>
                                </select>
                            </span></p>
                            <p><span class="text">热卖程度：</span><span>☆☆☆☆☆</span></p>
                            <p><span class="text">库存：</span><span></span></p>
                            <p><span class="text">购买数量：</span>
                                <input type="button" value="-"/>
                                <input type="text" size="5" />
                                <input type="button" value="+"/>
                            </p>
                            <p><span class="text"> </span><input type="checkbox" /><span><a href="#">放入购物车</a> </span></p>

                        </section>
                    </dt>
                </dl>

            </div>

        </div>
    <%-- 底部 --%>
    <footer id="foot"><strong>Created By : 2018-电子科技大学-软件一班-第三组</strong></footer>
</div>
</body>
</html>
