package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo3 {
    public static void main(String[] args) throws Exception {
        //注册驱动
        // Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);
        //定义SQL语句
        String sql1 = "update account set money =3000 where id =1";
        String sql2 = "update account set money =3000 where id =2";
        //获取执行sql的对象Statement
        Statement stmt = conn.createStatement();


        try {
            //**开启事务
            conn.setAutoCommit(false); //如果注释掉则会修改数据
            //执行sql
            int count1 = stmt.executeUpdate(sql1);  //受影响的行数
            //处理结果
            System.out.println(count1);
           // int i = 3 / 0;  //打开手动制造一个异常
            int count2 = stmt.executeUpdate(sql2);  //受影响的行数
            //处理结果
            System.out.println(count2);
            //提交事务
            conn.commit();
        } catch (Exception throwables) {
            //回滚事务
            conn.rollback();
            throwables.printStackTrace();
        }


        //释放资源
        stmt.close();
        conn.close();
        ;
    }
}
