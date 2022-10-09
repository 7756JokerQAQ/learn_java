package com.itheima;

import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 快速入门
 */
public class MyBatisDemo {
    public static void main(String[] args) {
        //加载MyBatis的核心配置文件获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象 用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句
        List<User> users = sqlSession.selectList("test.selectAll");
        System.out.println(users);
        sqlSession.close();
    }


}
