<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/14
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/infoPr.css"/>
</head>
<body>
<p style="border: 3px  rgba(255,33,42,0.42) solid;height: 30px;text-align: center">
    <strong style="height: 30px;line-height: 30px">商品信息</strong>
</p>
<div id="infoPr">
    <table class="table">
        <tr class="one">
            <td width="225">商品</td>
            <td width="225">名称</td>
            <td width="225">数量</td>
            <td width="225">操作</td>
        </tr>
        <c:forEach items="${prs}" var="pr">
            <tr>
                <td ><img src="../product/${pr.prodFileName}" style="width: 40px;height: 40px"/></td>
                <td class="two" >${pr.prodName}</td>
                <td class="three">${pr.prodStock}</td>
                <td><a href="#">修改</a><a href="#" style="margin-left: 10px">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
