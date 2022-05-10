package onclass.one_five;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Description:练习 4.
 * 1. 创建狗类：有属性：id,name,age 。
 * 2. 创建一个 set 集合，插入 3 条狗，然后遍历他们（要求使用迭代器方式遍历）。
 * 3. 然后删除其中一条。
 * （要求重写狗类的 hashCode,equals 方法，测试添加重复数据）
 * package: onclass <br/>
 * ClassName: Four <br/>
 * date: 2022-05-17 上午 11:23:58 <br/>
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
        Set<Dog> set = new LinkedHashSet<>();
        set.add(new Dog("01","baigou",12));
        set.add(new Dog("02","bio",12));
        set.add(new Dog("03","bai",12));
        set.add(new Dog("04","bou",12));
        Iterator<Dog> iDog = set.iterator();
        while(iDog.hasNext()) {
            System.out.println(iDog.next());
        }
        set.remove(new Dog("04", "bou", 12));
        System.out.println(set);
        set.add(new Dog("05","b2u",12));
        System.out.println(set);
        set.add(new Dog("05", "AAA", 45));
        System.out.println(set);
    }
}