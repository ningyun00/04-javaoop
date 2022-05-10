package onclass.one_five;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 练习 2：
 * 请创建一个 Book 类,字段:id,name,price,author
 * 实现对书的管理：
 * 1.一个泛型 Map 集合，往内分别添加三本图片， 分别设置相应的 id 编号为 key
 * 2.显示出集合中数量
 * 3.循环显示出书的信息
 * 4.根据相应的编号查询的对应图书的信息
 * 5.根据相应的编号进行删除，然后显示出来
 * package: onclass <br/>
 * ClassName: Two <br/>
 * date: 2022-05-17 上午 11:07:08 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Two {
    /**
     * @Description:
     * @Class: Two
     */
    public static void main(String[] args) {/**主程序*/
        Map<String, Book> map = new HashMap<>();
        map.put("01", new Book("asdf", 230, "ning"));
        map.put("02", new Book("a45f", 280, "ning"));
        map.put("03", new Book("a56f", 260, "ning"));
        map.put("04", new Book("asdff", 230, "ning"));
        for(Object o: map.keySet()){
            System.out.println(o+"--"+map.get(o));
        }
        System.out.println(map.get("01"));
        System.out.println(map.remove("01"));
        System.out.println(map);
    }
}