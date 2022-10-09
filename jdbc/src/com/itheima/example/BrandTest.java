package com.itheima.example;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class BrandTest {
    //增删改查

    /**
     * 查询所有
     * SQL:select *from tb_brand
     * 参数：不需要
     * 结果：list<Brand>
     */
    @Test
    public  void testSelectAll(){
        Properties prop=new Properties();
       // prop.load(new FileInputStream());
    }

}
