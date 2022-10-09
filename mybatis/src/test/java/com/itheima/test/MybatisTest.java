package com.itheima.test;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    @Test
    public void testSelectAll() {
        //1、获取SqlSessionFactory的对象
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
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
        sqlSession.close();

    }

    @Test
    public void testSelectById() {
        //1、获取SqlSessionFactory的对象
        int id = 1;
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
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);
        sqlSession.close();

    }

    @Test
    public void testSelectByCondition() {
        //接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
//      2.  //封装对象
//        Brand brand=new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
        Map map = new HashMap<>();
        //map.put("status", status);
        map.put("companyName", companyName);
        // map.put("brandName", brandName);
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
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        // 1 List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        //   List<Brand> brands = brandMapper.selectByCondition(brand);
        List<Brand> brands = brandMapper.selectByCondition(map);
        System.out.println(brands);

        sqlSession.close();

    }

    @Test
    public void testSelectByConditionSingle() {
        //接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
//      2.  //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        //brand.setCompanyName(companyName);
        // brand.setBrandName(brandName);

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
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        // 1 List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        //   List<Brand> brands = brandMapper.selectByCondition(brand);
        List<Brand> brands = brandMapper.selectByConditionSingle(brand);
        System.out.println(brands);
        sqlSession.close();
    }

    @Test
    public void testAdd() {
        //接收参数
        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int ordered = 100;
//      2.  //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);

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
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        brandMapper.add(brand);
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testUpdate() {
        //接收参数
        int status = 1;
      //  String companyName = "波导手机";
       // String brandName = "波导11";
        String description = "手机中的战斗机22";
        int ordered = 200;
        int id=5;
//      2.  //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
      //  brand.setCompanyName(companyName);
       // brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setId(id);

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
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //执行方法
        int update1 = brandMapper.update(brand);
        System.out.println(update1);
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testDeleteById() {
        //接收参数
        int status = 1;
        int id=5;
//      2.  //封装对象
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
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        brandMapper.deleteById(id);
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void testDeleteByIds() {
        //接收参数

        int []ids={1,2};
//      2.  //封装对象
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
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        brandMapper.deleteByIds(ids);
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }


}
