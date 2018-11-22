package com.wdk.shop.dao;

import com.wdk.shop.entity.ProductCategory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductCategoryDao extends BaseDao {


    //查询所有数据
    public static List<ProductCategory> selectAll(){
        List<ProductCategory> productCategories=new ArrayList<ProductCategory>();
        ProductCategory productCategory=null;
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("select * from `easybu_product_category`");
            rs=ps.executeQuery();
            while (rs.next()){
                productCategory=new ProductCategory(rs.getInt("EU_ID"),
                        rs.getString("EU_NAME"),rs.getInt("EU_PARENTID"));
                productCategories.add(productCategory);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        finally {
            closeAll(rs,ps,conn);
        }
        return productCategories;
    }

    //增添数据

    public static int addProduct(String pcName, int pcParentId){

        PreparedStatement ps=null;
        Connection conn=null;
        int rs=0;
        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("insert into `easybu_product_category` (EU_NAME, EU_PARENTID) values(?,?)");
            ps.setString(1,pcName);
            ps.setInt(2,pcParentId);
            rs=ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {

                try {
                    if(null!=ps){
                    ps.close();
                    }
                    if(null!=conn){
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();

            }
        }

        return rs;
    }

    //删除数据
    public static int deleteProduct(int pcId){
        PreparedStatement ps=null;
        Connection conn=null;
        int rs=0;
        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("delete  `easybu_product_category` where EU_ID=?");
            ps.setInt(1,pcId);
            rs=ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {

            try {
                if(null!=ps){
                    ps.close();
                }
                if(null!=conn){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }

        return rs;
    }

    //修改数据
    public static int updateProduct(String pcName,int pcId){
        PreparedStatement ps=null;
        Connection conn=null;
        int rs=0;
        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("update `easybu_product_category` set EU_NAME= ? where EU_ID=?");
            ps.setString(1,pcName);
            ps.setInt(2,pcId);
            rs=ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {

            try {
                if(null!=ps){
                    ps.close();
                }
                if(null!=conn){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();

            }
        }

        return rs;
    }

}
