package com.wdk.shop.servlet;

import com.jspsmart.upload.*;
import com.wdk.shop.dao.ProductDao;
import com.wdk.shop.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "addPrsServlet")
public class addPrsServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //实列化
        SmartUpload  su=new SmartUpload();
        su.initialize(this.getServletConfig(),request,response);

        try {
            su.upload("utf-8");
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }

        //获得所有文件
        Files fs=su.getFiles();
        //获得上传文件
        File f = fs.getFile(0);
        //获得文件名
        String fname = f.getFileName();

        try {
            //保存图片到指定位置
//            su.save("/manager/product");
            //绝对路径
            f.saveAs("C:\\Users\\Administrator\\Desktop\\IDEA\\ShoppingWork\\web\\product\\"+fname);
        } catch (SmartUploadException e) {

            e.printStackTrace();
        }

        Request req = su.getRequest();
        String name=req.getParameter("namePr");
        String id=req.getParameter("select");
        String price = req.getParameter("pricePr");
        String desc=req.getParameter("desc");
        String stock=req.getParameter("numPr");


        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=response.getWriter();

        Product product=null;
        if(price!=null && stock != null && id != null ){
            product=new Product(0, name, desc,
                    Float.parseFloat(price),
                    Integer.parseInt(stock),
                    Integer.parseInt(id.split("-")[0]),
                    Integer.parseInt(id.split("-")[1]),
                    fname);
        }
        int count = 0;
        if(product!=null){
            count = ProductDao.addProduct(product);
            if(count>0){
                pw.print("<script>"+
                        "alert('添加成功');"+
                        "window.location.href='addpr.jsp';"+
                        "</script>");
            }else{
                pw.print("<script>"+
                        "alert('添加失败');"+
                        "window.location.href='addpr.jsp';"+
                        "</script>");
            }
        }






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
