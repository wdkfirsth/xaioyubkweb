package com.wdk.shop.dao;



import com.wdk.shop.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public  class UserDao extends BaseDao {

    public UserDao() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

    }

    //查询用户名和密码
    public static int selectByUserNameAndPassword(String  userName, String passWord) {
        //定义查询到的count值
       int count=0;

       PreparedStatement ps=null;
       ResultSet rs=null;
       Connection conn = null;
        try {
            conn = BaseDao.getConnection();
            ps=conn.prepareStatement("select count(*) from `easybuy_user` where EU_USER_NAME=? and EU_PASSWORD=?");
            ps.setString(1,userName);
            ps.setString(2,passWord);
            rs = ps.executeQuery();
            while (rs.next()){
                count = rs.getInt(1);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            closeAll(rs,ps,conn);
        }



        return count;
    }

    //判断是普通用户还是管理员
    public static User selectAdmin(String name, String pwd){
        User user=null;
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("select * from `easybuy_user` where EU_USER_NAME = ? and EU_PASSWORD=?");
            ps.setString(1,name);
            ps.setString(2,pwd);
            rs=ps.executeQuery();
            while (rs.next()){
                user=new User(rs.getString("EU_USER_ID"),
                        rs.getString("EU_USER_NAME"),
                        rs.getString("EU_PASSWORD"),
                        rs.getString("EU_SEX"),
                        rs.getString("EU_BIRTHDAY"),
                        rs.getString("EU_IDENTITY_CODE"),
                        rs.getString("EU_EMAIL"),
                        rs.getString("EU_MOBILE"),
                        rs.getString("EU_ADDRESS"),
                        rs.getInt("EU_STATUS"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            closeAll(rs,ps,conn);
        }
        return user;
    }
    //查询用户是否存在
    public static int selectByUserName(String  userName) {
        //定义查询到的count值
        int count=0;

        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection conn = null;
        try {
            conn = BaseDao.getConnection();
            ps=conn.prepareStatement("select count(*) from `easybuy_user` where EU_USER_NAME=? ");
            ps.setString(1,userName);
            rs = ps.executeQuery();
            while (rs.next()){
                count = rs.getInt(1);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }finally {
            closeAll(rs,ps,conn);
        }



        return count;
    }

    //添加用户
    public static int addUser(User user){
        PreparedStatement ps=null;
        int rs = 0;
        Connection conn = null;
        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("insert into `easybuy_user`(EU_USER_ID,EU_USER_NAME,EU_PASSWORD," +
                    "EU_SEX,EU_BIRTHDAY,EU_IDENTITY_CODE,EU_EMAIL,EU_MOBILE,EU_ADDRESS,EU_STATUS) values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,user.getPassword());
            ps.setString(2,user.getUserName());
            ps.setString(3,user.getPassword());
            ps.setString(4,user.getSex());
            ps.setString(5,user.getBirthday());
            ps.setString(6,user.getCode());
            ps.setString(7,user.getEmail());
            ps.setString(8,user.getMobile());
            ps.setString(9,user.getAddress());
            ps.setInt(10,user.getStatus());
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

    //查询所有用户
    public static List<User> selectAll(){
        List<User> userList=new ArrayList<User>();
        User user=null;
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn=BaseDao.getConnection();
            ps=conn.prepareStatement("select * from `easybuy_user` ");
            rs=ps.executeQuery();
            while (rs.next()){
                user=new User(rs.getString("EU_USER_ID"),
                        rs.getString("EU_USER_NAME"),
                        rs.getString("EU_PASSWORD"),
                        rs.getString("EU_SEX"),
                        rs.getString("EU_BIRTHDAY"),
                        rs.getString("EU_IDENTITY_CODE"),
                        rs.getString("EU_EMAIL"),
                        rs.getString("EU_MOBILE"),
                        rs.getString("EU_ADDRESS"),
                        rs.getInt("EU_STATUS"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            closeAll(rs,ps,conn);
        }
        return userList;
    }

}
