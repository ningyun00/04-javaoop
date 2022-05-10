package onclass.six;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Description:练习 6：(选做)
 * 要求：
 * 1 实现添加功能
 * 1.1 定义一个学员类（Student），在 Student 类中定义姓名、性别和年龄属性，定义有
 * 参数的构造方法来初始化所有的成员属性
 * 1.2 限制年龄只能输入正整数,否则的会抛出异常来给与提示
 * 1.3 创建学员对象来存放学员信息，并将学员对象添加到 Map<Integer,Student>集合
 * 中(key 设置为学员编号，可自行添加，如:1,2,3...)。
 * 1.4 添加完成后，显示所有已添加的学员姓名
 * 2 实现学员信息显示功能
 * 2.1 输入学生的编号，在 Map<Integer,Student>集合中根据编号获取对应的学员信息，
 * 并显示
 * 3 查询学员信息
 * 3.1 输入学员的编号，查询出是否在集合中存在，
 * 4 实现学员信息删除
 * 4.1 输入学号的编号，查询是否有该学生的存在，如果不存在就提示不在，如果存在就
 * 进行删除
 * 4.2 删除后将集合中学生信息打印
 * package: onclass.six <br/>
 * ClassName: SixTStudent <br/>
 * date: 2022-05-17 下午 12:05:47 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class SixTStudent {
    /**
     * @Description:
     * @Class: SixTStudent
     */
    public static void main(String[] args) {/**主程序*/
        Map<Integer, Student> map = new HashMap<Integer, Student>();
        map.put(1,new Student("zha",23,'女'));
        map.put(2,new Student("z阿斯蒂芬、",24,'女'));
        map.put(3,new Student("阿斯蒂芬",53,'女'));
        map.put(4,new Student("而",26,'女'));
        map.put(5,new Student("撒旦发个",63,'女'));
        map.put(6, new Student("一年半", 33, '女'));
        System.out.println(map);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要显示的学生的编号：");
        System.out.println(map.get(scanner.nextInt()));
        System.out.println("请输入要查找的学生的编号：");
        if (map.containsKey(scanner.nextInt())){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
        System.out.println("请输入要删除的学生的编号：");
        int key = scanner.nextInt();
        if (map.containsKey(key)) {
            map.remove(key);
        } else {
            System.out.println("不存在");
        }
        System.out.println(map);
    }
}