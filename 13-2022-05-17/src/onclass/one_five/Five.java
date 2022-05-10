package onclass.one_five;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Description:练习 5.
 * 1. 创建一个学生类：有属性：id,name,score
 * 2. 创建一个 List 集合，保存 5 个学生对象
 * 3. 学生类重写 compareTo()方法,实现学生根据成绩从高到低排序
 * package: onclass <br/>
 * ClassName: Five <br/>
 * date: 2022-05-17 上午 11:49:42 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Five {
    /**
     * @Description:
     * @Class: Five
     */
    public static void main(String[] args) {/**主程序*/
        List<Student> list = new ArrayList<>();
        list.add(new Student("01","zhangsan",20));
        list.add(new Student("02","sdfgf",30));
        list.add(new Student("03","ert",10));
        list.add(new Student("04","hg",80));
        list.add(new Student("05", "rfar", 90));
        Collections.sort(list);
        System.out.println(list);
    }
}