<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/8
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/productInfo.css"/>
</head>
<body>

<p style="border: 3px  rgba(255,33,42,0.42) solid;height: 30px;text-align: center">
    <strong style="height: 30px;line-height: 30px">分类管理</strong>
</p>
<div id="content">
    <table class="table">
        <tr class="normal">
            <td width="130"><strong>ID</strong></td>
            <td width="650"><strong>分类名称</strong></td>
            <td width="130"><strong>操作</strong></td>
        </tr>
        <tr class="normal">
            <td colspan="3"><strong>美食</strong></td>

        </tr>
        <c:forEach items="${productCategories}" var="product">
            <c:if test="${product.pcParentId == 1}">
                <tr>
                    <td>${product.pcId}</td>
                    <td class="singel">${product.pcName}</td>
                    <td><a href="#">修改</a><a href="#" style="margin-left: 10px">删除</a></td>
                </tr>
            </c:if>
        </c:forEach>
        <tr class="normal">
            <td colspan="3"><strong>运动</strong></td>

        </tr>
        <c:forEach items="${productCategories}" var="product">
            <c:if test="${product.pcParentId == 2}">
                <tr>
                    <td>${product.pcId}</td>
                    <td class="singel">${product.pcName}</td>
                    <td><a href="#">修改</a><a href="#" style="margin-left: 10px">删除</a></td>
                </tr>
            </c:if>
        </c:forEach>
        <tr class="normal">
            <td colspan="3"><strong>电器</strong></td>
        </tr>
        <c:forEach items="${productCategories}" var="product">
            <c:if test="${product.pcParentId == 3}">
                <tr>
                    <td>${product.pcId}</td>
                    <td class="singel">${product.pcName}</td>
                    <td><a href="#">修改</a><a href="#" style="margin-left: 10px">删除</a></td>
                </tr>
            </c:if>
        </c:forEach>
        <tr class="normal">
            <td colspan="3"><strong>手机</strong></td>
        </tr>
        <c:forEach items="${productCategories}" var="product">
            <c:if test="${product.pcParentId == 4}">
                <tr>
                    <td>${product.pcId}</td>
                    <td class="singel">${product.pcName}</td>
                    <td><a href="#">修改</a><a href="#" style="margin-left: 10px">删除</a></td>
                </tr>
            </c:if>
        </c:forEach>
        <tr class="normal">
            <td colspan="3"><strong>电脑</strong></td>
        </tr>
        <c:forEach items="${productCategories}" var="product">
            <c:if test="${product.pcParentId == 5}">
                <tr>
                    <td>${product.pcId}</td>
                    <td class="singel">${product.pcName}</td>
                    <td><a href="#">修改</a><a href="#" style="margin-left: 10px">删除</a></td>
                </tr>
            </c:if>
        </c:forEach>
        <tr class="normal">
            <td colspan="3"><strong>品牌</strong></td>
        </tr>
        <c:forEach items="${productCategories}" var="product">
            <c:if test="${product.pcParentId == 6}">
                <tr>
                    <td>${product.pcId}</td>
                    <td class="singel">${product.pcName}</td>
                    <td><a href="#">修改</a><a href="#" style="margin-left: 10px">删除</a></td>
                </tr>
            </c:if>
        </c:forEach>
        <tr class="normal">
            <td colspan="3"><strong>生活用品</strong></td>
        </tr>
        <c:forEach items="${productCategories}" var="product">
            <c:if test="${product.pcParentId == 7}">
                <tr>
                    <td>${product.pcId}</td>
                    <td class="singel">${product.pcName}</td>
                    <td><a href="#">修改</a><a href="#" style="margin-left: 10px">删除</a></td>
                </tr>
            </c:if>
        </c:forEach>
    </table>

</div>
</body>
</html>
