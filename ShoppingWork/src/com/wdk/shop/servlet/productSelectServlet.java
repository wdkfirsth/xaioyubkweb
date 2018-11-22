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

@WebServlet(name = "productSelectServlet")
public class productSelectServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        List<ProductCategory> productCategories= ProductCategoryDao.selectAll();
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=resp.getWriter();
        if(productCategories.size()>0){
            req.setAttribute("productCategories",productCategories);
            req.getRequestDispatcher("productInfo.jsp").forward(req,resp);
        }else{
//            req.getRequestDispatcher("productInfo.jsp").forward(req,resp);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
