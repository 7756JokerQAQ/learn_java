package com.itheima.test;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class UserMapperTest {
    @Test
  public   void textSelect() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream  = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象 用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        String username="张三";
        String password="123";
        User user=userMapper.select(username,password);

        System.out.println(user);
        sqlSession.close();
    }
}
