<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/8
  Time: 3:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/productAdd.css"/>
</head>
<body>

<p style="border: 3px  rgba(255,33,42,0.42) solid;height: 30px;text-align: center">
    <strong style="height: 30px;line-height: 30px">新增分类</strong>
</p>
<div id="content">
    <form action="productAdd" method="post">
    <p>
        <span class="text">父分类：</span>
        <select name="select">
            <option value="0">根栏目</option>
            <option value="1">美食</option>
            <option value="2">运动</option>
            <option value="3">电器</option>
            <option value="4">手机</option>
            <option value="5">电脑</option>
            <option value="6">品牌</option>
            <option value="7">生活用品</option>
        </select>
    </p>
    <p>
        <span class="text">分类名称：</span>
        <input type="text" name="pcName"/>
    </p>
    <p>
        <span class="text"></span>
        <input type="submit" value="提交"/>
    </p>
    </form>
</div>

</body>
</html>
