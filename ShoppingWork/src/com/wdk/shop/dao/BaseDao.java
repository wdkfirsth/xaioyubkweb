package com.wdk.shop.dao;

import java.sql.*;

public class BaseDao {
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String connUrl = "jdbc:mysql://localhost:3306/shopping";
    private static String user = "root";
    private static String password = "wdk7289148";
    private static Connection conn = null;
    private static ResultSet rs = null;
    private static Statement stm = null;
    public static String s="dd";


    // 获取数据库连接
    public static Connection getConnection() throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        Class.forName(driverName).newInstance();
        conn = DriverManager.getConnection(connUrl, user, password);
//        if(!conn.isClosed()){
//            s="sds";
//        }
        return conn;
    }


    //关闭数据库
    public static void closeAll(ResultSet rs,Statement ps,Connection conn){
            try {
                if(null!=rs) {
                    rs.close();
                }
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
    //关闭数据库
    public static void closeAll(Statement ps,Connection conn){
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

    //
    public static int executeIUD(String sql,Object[] params) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        int count=0;
        Connection conn=getConnection();
        PreparedStatement ps=null;
        try {
            ps=conn.prepareStatement(sql);
            if(params!=null){

                for(int i=0;i<params.length;i++){
                    ps.setObject(i+1,params[i]);
                }
            }
            count=ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
      finally {
            closeAll(null,ps,conn);
        }
        return  count;

    }


}
