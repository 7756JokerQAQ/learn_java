package com.itheima.mapper;


import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.text.BreakIterator;
import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /**
     * 查询所有
     */
    List<Brand> selectAll();

    /**
     * 查看详情
     */
    Brand selectById(int id);

    /**
     * 条件查询
     * 1.散装参数 如果方法中有多个参数需要使用
     * 2.对象参数
     * 3.map集合参数
     *
     * @param status
     * @param companyName
     * @param brandName
     * @return
     */
    //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);
   // List<Brand> selectByCondition(Brand brand);
    List<Brand> selectByCondition(Map map);
    List<Brand>selectByConditionSingle(Brand brand);
    /**
     * 添加
     */
    void add(Brand brand);
    int update(Brand brand);
    void deleteById(int id);
    /**
     * 批量删除
     */
    void deleteByIds(int []ids);
}
