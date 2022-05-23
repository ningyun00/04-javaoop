package onclass.three.test;

import onclass.three.dao.ProductsDaoInter;
import onclass.three.entity.Products;

/**
 * Description:
 * ClassName: Test <br/>
 * date: 2022-05-24 上午 12:33:03 <br/>
 * author: 寜 <br/>
 */
public class Test {
    public static void main(String[] args) {
        ProductsDaoInter productsDaoInter = new ProductsDaoInter();
        //添加
        if (productsDaoInter.add(new Products(2, "草莓", 13, "无")) > 0) System.out.println("添加成功");
        else System.out.println("添加失败");
        //删除
        if (productsDaoInter.del(new Products(2)) > 0) System.out.println("删除成功");
        else System.out.println("删除失败");
        //修改
        if (productsDaoInter.update(new Products(3, "鸡蛋", 15, "无")) > 0) System.out.println("修改成功");
        else System.out.println("修改失败");
        //查询所有
        for (Products productsAll : productsDaoInter.select()) System.out.println(productsAll);
        //精确查询
        System.out.println(productsDaoInter.select("面包"));
        //模糊查询
        for (Products productsPrecise : productsDaoInter.selectName("面")) System.out.println(productsPrecise);

    }
}