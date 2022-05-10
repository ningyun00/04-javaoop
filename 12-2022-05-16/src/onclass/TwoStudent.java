package onclass;

import java.util.ArrayList;

/**
 * Description:2、写一个学生的类，类中有属性：编号（int），姓名(String)，性别(char 只能是‘男’
 * 或‘女’)，考试成绩(double)。类中有所有属性的 getXXX 与 setXXX 方法。默认的构造方
 * 法，及能初始化所有属性的构造方法。
 * 再写一个测试类，main 中生成一个 ArrayList 类的对象，用此对象放入 5 个学生对象。
 * 最后输出所有学生的信息。
 * package: onclass <br/>
 * ClassName: TwoStudent <br/>
 * date: 2022-05-16 上午 11:06:08 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class TwoStudent {
    /**
     * @Description:
     * @Class: TwoStudent
     */
    public static void main(String[] args) {/**主程序*/
        ArrayList<Student> stuAList = new ArrayList<>();
        stuAList.add(new Student("001","寜",'男',98));
        stuAList.add(new Student("002","小寜",'女',98));
        stuAList.add(new Student("003","大寜",'男',98));
        stuAList.add(new Student("004","中寜",'女',98));
        stuAList.add(new Student("005","a寜",'女',98));
        stuAList.add(new Student("006","b寜",'女',98));
        stuAList.add(new Student("007","c寜",'女',98));
        for (int i = 0; i < stuAList.size(); i++) {
            System.out.println(stuAList.get(i));
        }
    }
}