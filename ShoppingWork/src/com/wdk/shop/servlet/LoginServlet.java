package com.wdk.shop.servlet;

import com.wdk.shop.dao.BaseDao;
import com.wdk.shop.dao.UserDao;
import com.wdk.shop.entity.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String userName=request.getParameter("username");
        String password=request.getParameter("password");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=response.getWriter();

        int count= UserDao.selectByUserNameAndPassword(userName,password);
        if(count>0){
            User user=UserDao.selectAdmin(userName,password);
            if(user.getStatus()==2){
                pw.print("<script>"+
                        "alert('登录成功！');"+
                        "window.location.href='manager/manager.jsp';"+
                        "</script>"
                );
//                response.sendRedirect("manager/manager.jsp");
            }else{
                pw.print("<script>"+
                        "alert('登录成功！');"+
                        "window.location.href='main.jsp';"+
                        "</script>"
                );
//                response.sendRedirect("main.jsp");
            }
        }
        else{
            pw.print("<script>"+
                    "alert('用户名或密码错误！');"+
                    "window.location.href='login.jsp';"+
                    "</script>"
                    );
        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }
}
