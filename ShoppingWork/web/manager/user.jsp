<%@ page import="java.util.List" %>
<%@ page import="com.wdk.shop.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/8
  Time: 0:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/user.css"/>

</head>
<body>
<p style="border: 3px  rgba(255,33,42,0.42) solid;height: 30px;text-align: center">
    <strong style="height: 30px;line-height: 30px">用户信息</strong>
</p>
<div id="content">
    <table >
        <tr class="tr">
            <td><b>用户名</b></td>
            <td><b>性别</b></td>
            <td><b>生日</b></td>
            <td><b>邮箱</b></td>
            <td><b>电话</b></td>
            <td><b>地址</b></td>
            <td><b>身份</b></td>
        </tr>

        <c:forEach items="${users}" var="user">
        <tr class="tr">
           <td>${user.userName}</td>
            <td>${user.sex}</td>
            <td>${user.birthday}</td>
            <td>${user.email}</td>
            <td>${user.mobile}</td>
            <td>${user.address}</td>
            <c:if test="${user.status==2}">
                <td>管理员</td>
            </c:if>
            <c:if test="${user.status==1}">
                <td>普通会员</td>
            </c:if>

        </tr>
        </c:forEach>

    </table>
</div>


</body>
</html>
