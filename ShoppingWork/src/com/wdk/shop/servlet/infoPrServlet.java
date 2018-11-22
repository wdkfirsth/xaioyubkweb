package com.wdk.shop.servlet;

import com.wdk.shop.dao.ProductDao;
import com.wdk.shop.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "infoPrServlet")
public class infoPrServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");


        List<Product> products= ProductDao.selectAll();
        if(products.size()>0){
            req.setAttribute("prs",products);
            req.getRequestDispatcher("infoPr.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("infoPr.jsp").forward(req,resp);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
