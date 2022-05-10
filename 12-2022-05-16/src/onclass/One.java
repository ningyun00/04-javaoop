package onclass;

import java.util.ArrayList;

/**
 * Description:1、使用 ArrayList 类生成一个集合对象，向此集合对象中加入“一只羊”，“一头牛”，一个
 * 整数包装对象 1，一个小数包装对象 5.8，再加入一个“人”。然后循环输出这些对象的值。
 * package: onclass.one <br/>
 * ClassName: One <br/>
 * date: 2022-05-16 上午 11:01:53 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class One {
    /**
     * @Description:
     * @Class: One
     */
    public static void main(String[] args) {/**主程序*/
        ArrayList aList = new ArrayList();
        aList.add("一只羊");
        aList.add("一头牛");
        aList.add(1);
        aList.add(5.8);
        aList.add("人");
        for (Object o : aList) {
            System.out.println(o);
        }
    }
}