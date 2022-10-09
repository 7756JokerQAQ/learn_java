package com.itheima.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDemo_6 {
    @Test
    public void textResultSet() throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //接收用户名和密码
        String name = "zhangsan";
        String pwd = "123";
        String sql = "select * from tb_user where username='" + name + "' and password='" + pwd + "'";
        //获取stmt对象
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        //判断登录是否成功
        if (rs.next()) {
            System.out.println("登录成功！！");
        } else {
            System.out.println("登录失败~~");
        }
        rs.close();
        stmt.close();
        conn.close();

    }

    /**
     * SQL注入
     * @throws Exception
     */
    @Test
    public void textLogin_Inject() throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //接收用户名和密码
        String name = "sadasdasd";
        String pwd = "' or '1' = '1";
        String sql = "select * from tb_user where username='" + name + "' and password='" + pwd + "'";
        //获取stmt对象
        System.out.println(sql);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        //判断登录是否成功
        if (rs.next()) {
            System.out.println("登录成功！！");
        } else {
            System.out.println("登录失败~~");
        }
        rs.close();
        stmt.close();
        conn.close();

    }
}
