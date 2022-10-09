package com.itheima.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        //注册驱动
       // Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        String url="jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username="root";
        String password="123456";
       Connection conn= DriverManager.getConnection(url,username,password);
        //定义SQL语句
        String sql="update account set money =2000 where id =1";
       //获取执行sql的对象Statement
        Statement stmt=conn.createStatement();
       //执行sql
       int count= stmt.executeUpdate(sql);  //受影响的行数
        //处理结果
        System.out.println(count);
        //释放资源
        stmt.close();
        conn.close();;
    }
}
