package onclass.three.dao;

import onclass.three.entity.Products;

import java.util.List;

/**
 * Description:
 * ClassName: InterDao <br/>
 * date: 2022-05-24 上午 12:01:12 <br/>
 * author: 寜 <br/>
 */
public interface InterDao {
    int add(Products products);//添加
    int del(Products products);//删除
    int update(Products products);//更新
    List<Products> select();//查询所有
    Products select(String name);//精确查询
    List<Products> selectName(String name);//模糊查询
}
