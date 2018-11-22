<%@ page import="com.wdk.shop.entity.ProductCategory" %>
<%@ page import="java.util.List" %>
<%@ page import="com.wdk.shop.dao.ProductCategoryDao" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/14
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/addPr.css"/>
</head>
<%
    request.setCharacterEncoding("utf-8");
    List<ProductCategory> productCategories= ProductCategoryDao.selectAll();
    if(productCategories.size()>0) {
        request.setAttribute("prclass",productCategories);
//        req.getRequestDispatcher("addpr.jsp").forward(req,resp);
//            pw.print("<script>" +
//                    "window.location.href='addpr.jsp';" +
//                    "</script>");
    }%>
<body>
    <p style="border: 3px  rgba(255,33,42,0.42) solid;height: 30px;text-align: center">
        <strong style=" height: 30px;line-height: 30px">新增商品</strong>
    </p>

    <div id="addPr">
        <form action="addPrs" class="form" method="post" enctype="multipart/form-data"
              accept-charset="UTF-8" >
            <p><span class="text">商品名称：</span><input type="text" class="namePr" name="namePr"style="width: 200px"/></p>
            <p><span class="text">商品类型：</span>
                <select name="select">
                    <option value="0">商品目录</option>
                    <c:forEach items="${prclass}" var="prc">
                        <option value="${prc.pcParentId}-${prc.pcId}">${prc.pcName}</option>
                    </c:forEach>
                </select>
            </p>
            <p><span class="text">商品价格：</span><input type="text" class="pricePr" name="pricePr"style="width: 200px"/></p>
            <p><span class="text">商品数量：</span><input type="text" class="numPr" name="numPr"style="width: 200px"/></p>
            <p><span class="text">商品图片：</span><input type="file" class="imgPr" name="file" style="width: 200px"/></p>
            <p><span class="text">商品描述：</span></p>
            <p>
                <span class="text"></span>
                <textarea class="area" name="desc" rows="5"style="width: 200px"></textarea>
            </p>
            <p>
                <span class="text"></span>
                <input type="submit" class="submit" value="提交"/>
            </p>
        </form>
    </div>

</body>
</html>
