package com.wdk.shop.servlet;

import com.wdk.shop.dao.UserDao;
import com.wdk.shop.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegistServlet")
public class RegistsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //转utf-8
      request.setCharacterEncoding("utf-8");
      String userName=request.getParameter("username");
      String sex=request.getParameterValues("sex")[0];
      String password=request.getParameter("password1");
      String eamil=request.getParameter("email");
      String birthday=request.getParameter("birthday") == null ? "":request.getParameter("birthday");
      String mobile=request.getParameter("mobile") == null ? "":request.getParameter("mobile");
      String address=request.getParameter("address") == null ? "":request.getParameter("address");

        //转utf-8
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter pw=response.getWriter();
//      pw.print(userName+sex+password+eamil+mobile+address);
        //查询有没有该用户
        int count= UserDao.selectByUserName(userName);
        if(count>0){
            pw.print("<script>"+
                    "alert('该用户已经存在！');"+
                    "window.location.href='regists.jsp';"+
                    "</script>"
            );
        }else{
            int rs=UserDao.addUser(new User(password,userName,password,sex,
                    birthday,"",eamil,mobile,address,1));

            if(rs !=-1){
                pw.print("<script>"+
                        "alert('注册成功！');"+
                        "window.location.href='welcome.jsp';"+
                        "</script>"
                );
            }else{
                pw.print("<script>"+
                        "alert('注册失败！');"+
                        "window.location.href='regists.jsp';"+
                        "</script>"
                );
            }

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
