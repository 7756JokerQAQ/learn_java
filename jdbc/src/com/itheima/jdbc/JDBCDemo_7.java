package com.itheima.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;

//防止注入SQL
public class JDBCDemo_7 {
    @Test
    public void textPreparedStatement() throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //接收用户名和密码
        String name = "zhangsan";
        String pwd = "' or '1' = '1";  //此时注入无效
        //定义SQL
        String sql = "select*from tb_user where username=? and password=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //设置？的值
        pstmt.setString(1, name);
        pstmt.setString(2, pwd);
        ResultSet rs = pstmt.executeQuery();


        //判断登录是否成功
        if (rs.next()) {
            System.out.println("登录成功！！");
        } else {
            System.out.println("登录失败~~");
        }
        rs.close();
        pstmt.close();
        conn.close();

    }
    @Test
    public void textPreparedStatement2() throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false&userServerPrepStmts=true";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //接收用户名和密码
        String name = "zhangsan";
        String pwd = "' or '1' = '1";  //此时注入无效
        //定义SQL
        String sql = "select*from tb_user where username=? and password=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //设置？的值
        pstmt.setString(1, name);
        pstmt.setString(2, pwd);
        ResultSet rs = pstmt.executeQuery();


        //判断登录是否成功
        if (rs.next()) {
            System.out.println("登录成功！！");
        } else {
            System.out.println("登录失败~~");
        }
        rs.close();
        pstmt.close();
        conn.close();

    }


}
