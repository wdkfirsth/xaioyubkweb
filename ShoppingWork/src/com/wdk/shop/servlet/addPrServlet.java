package com.wdk.shop.servlet;

import com.wdk.shop.dao.ProductCategoryDao;
import com.wdk.shop.entity.ProductCategory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "addPrServlet")
public class addPrServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=resp.getWriter();
        List<ProductCategory> productCategories=ProductCategoryDao.selectAll();
        if(productCategories.size()>0) {
            req.setAttribute("prclass",productCategories);
            req.getRequestDispatcher("addpr.jsp").forward(req,resp);
//            pw.print("<script>" +
//                    "window.location.href='addpr.jsp';" +
//                    "</script>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
