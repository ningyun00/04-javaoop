package onclass.one.test;

import onclass.one.dao.ProductsDao;
import onclass.one.entity.Products;

import java.util.List;

/**
 * Description:
 * ClassName: Test <br/>
 * date: 2022-05-23 下午 12:10:52 <br/>
 * author: 寜 <br/>
 */
public class Test {
    public static void main(String[] args) {
        //添加
        if (ProductsDao.add(new Products(0, "火腿肠", 5, "无")) > 0) System.out.println("添加成功");
        else System.out.println("添加失败");
        //删除
        if (ProductsDao.del(2) > 0) System.out.println("删除成功");
        else System.out.println("删除失败");
        //修改
        if (ProductsDao.update(3, new Products("鸡蛋", 2, "无")) > 0) System.out.println("修改成功");
        else System.out.println("修改失败");
        //查询所有商品
        List<Products> list = ProductsDao.selectAll();
        for (Products products : list) System.out.println(products);
        //根据商品编号查询
        Products products = ProductsDao.selectID(3);
        System.out.println(products);
        //根据商品名称经行模糊查询
        List<Products> list2 = ProductsDao.selectName("鸡");
        for (Products products2 : list2) System.out.println(products);
    }
}