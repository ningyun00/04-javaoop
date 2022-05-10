package onclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Description:4、编写班级类，一个班级可以存放多个学生（可以使用 ArrayList 集合存放学生姓名/也可
 * 尝试 ArrayList 中放 Student 学生对象）。
 * 1)类中有增加一个学员 add()方法
 * 2)类中有删除一个学员 remove()方法。删除有二种方式，第一种，可以传入下标，第二种，
 * 可以传入对象。
 * 3)一个班级与另一个班级联宜，addAll()将两个班级的学员合并成一个班级
 * package: onclass <br/>
 * ClassName: Four <br/>
 * date: 2022-05-16 上午 11:36:39 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Four {
    /**
     * @Description:
     * @Class: Four
     */
    public static void main(String[] args) {/**主程序*/
        ArrayList aList = new ArrayList();
        aList.add("李四");
        Student zs = new Student("001", "张三", '女', 30);
        aList.add(zs);
        aList.add("网阿布");
        Student ls = new Student("002", "李四", '男', 23);
        aList.add(ls);
        aList.remove("李四");
        aList.remove(0);
        aList.addAll(Collections.singleton("A"));
        StudentTwo stu2 = new StudentTwo("022", "李ba", '男', 23);
        aList.addAll(Collections.singleton(stu2));
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }
    }
}