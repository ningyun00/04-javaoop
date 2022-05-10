package onclass;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Description:3.ArrayList
 * 1)创建一个猫类，名为 Cat，为其定义名字和年龄字段，定义构造方法初始化属性，为其
 * 定义一个名为 SayHy 的方法，实现自我介绍的行为（答应我是**的猫，年龄**岁）
 * 2)创建一个控制台应用程序
 * 3)在 Main 中创建一个 ArrayList 的集合对象 al
 * 4)在 Main 中创建 3 只猫对象 cat1(“小黑猫”，1),cat2（”小白猫”,2）,cat3(“小花猫”,3)
 * 5)用集合对象 al 添加上述 3 只猫对象,
 * 6)并循环调用每只猫的 SayHy 方法
 * 7)删除一只小花猫.
 * 8)判断集合中是否包含小花猫对象
 * package: onclass <br/>
 * ClassName: ThreeCat <br/>
 * date: 2022-05-16 上午 11:20:42 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class ThreeCat {
    /**
     * @Description:
     * @Class: ThreeCat
     */
    public static void main(String[] args) {/**主程序*/
        ArrayList<Cat> catAList = new ArrayList<>();
        Cat cat1 = new Cat("小黑猫", 1);
        Cat cat2 = new Cat("小白猫", 2);
        Cat cat3 = new Cat("小花猫", 3);
        catAList.add(cat1);
        catAList.add(cat2);
        catAList.add(cat3);
        for (int i = 0; i < catAList.size(); i++) {
            catAList.get(i).SayHy();
        }
        if (catAList.contains(cat3)) {
            System.out.println(catAList.remove(cat3));
        } else {
            System.out.println("小花猫不存在");
        }
    }
}