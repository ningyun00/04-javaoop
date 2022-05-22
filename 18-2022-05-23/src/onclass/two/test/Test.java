package onclass.two.test;

import onclass.two.dao.ProductsOperate;
import onclass.two.entity.Products;

import java.util.List;

/**
 * Description:
 * ClassName: Test <br/>
 * date: 2022-05-23 下午 03:57:05 <br/>
 * author: 寜 <br/>
 */
public class Test {
    public static void main(String[] args) {
        //添加
        if (ProductsOperate.add(new Products(0, "牛肉", 5, "无")) > 0) System.out.println("添加成功");
        else System.out.println("添加失败");
        //删除
        if (ProductsOperate.del(6) > 0) System.out.println("删除成功！");
        else System.out.println("删除失败！");
        //修改
        if (ProductsOperate.update(5, new Products("蛋糕", 5, "无")) > 0) System.out.println("修改成功");
        else System.out.println("修改失败");
        //精确查找
        List<Products> productsList = ProductsOperate.select();
        for (Products products : productsList) System.out.println(products);
        //模糊查找
        List<Products> productsList2 = ProductsOperate.select("鸡");
        for (Products products2 : productsList2) System.out.println(products2);
    }
}