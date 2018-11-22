package com.wdk.shop.dao;

import com.wdk.shop.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao extends BaseDao {



    //添加商品
    public static int addProduct(Product product){
        PreparedStatement ps=null;
        Connection conn=null;
        int rs=0;

        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("insert into `easybuy_product`" +
                    "(EP_NAME, EP_DESCRIPTION, EP_PRICE, EP_STOCK, EPC_ID, EPC_CHILD_ID, EP_FILE_NAME)" +
                    " values (?,?,?,?,?,?,?)");
            ps.setString(1,product.getProdName());
            ps.setString(2,product.getProdDesc());
            ps.setFloat(3,product.getProdPrice());
            ps.setInt(4,product.getProdStock());
            ps.setInt(5,product.getPcId());
            ps.setInt(6,product.getPcChildId());
            ps.setString(7,product.getProdFileName());
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
            BaseDao.closeAll(ps,conn);
        }


        return rs;
    }


    //查询商品
    public static List<Product> selectAll(){

        List<Product> products=new ArrayList<Product>();
        Product product=null;
        PreparedStatement ps=null;
        Connection conn=null;
        ResultSet rs=null;

        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("select * from `easybuy_product`");
            rs=ps.executeQuery();
            while (rs.next()){
                product=new Product(rs.getInt("EP_ID"),
                        rs.getString("EP_NAME"),
                        rs.getString("EP_DESCRIPTION"),
                        rs.getFloat("EP_PRICE"),
                        rs.getInt("EP_STOCK"),
                        rs.getInt("EPC_ID"),
                        rs.getInt("EPC_CHILD_ID"),
                        rs.getString("EP_FILE_NAME"));
                products.add(product);
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

        return products;
    }
}
