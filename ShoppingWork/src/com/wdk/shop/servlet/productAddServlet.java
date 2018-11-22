package com.wdk.shop.servlet;

import com.wdk.shop.dao.ProductCategoryDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "productAddServlet")
public class productAddServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int pcParentId= Integer.parseInt(req.getParameter("select"));
        String pcName=req.getParameter("pcName");
        int rs= ProductCategoryDao.addProduct(pcName,pcParentId);
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=resp.getWriter();
        if(rs !=-1){
            pw.print("<script>"+
                    "alert('添加成功!');"+
                    "window.location.href='productAdd.jsp';"+
                    "</script>");
        }else{
            pw.print("<script>+" +
                    "alert('添加失败！')"+
                    "window.location.href='productAdd.jsp';"+
                    "</script>");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
