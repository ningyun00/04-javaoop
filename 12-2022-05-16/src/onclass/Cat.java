package onclass;

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
 * ClassName: Cat <br/>
 * date: 2022-05-16 上午 11:20:23 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Cat {
    /**
     * @Description:
     * @Class: Cat
     */
    private String name;//姓名
    private int age;//年龄
    public Cat(){}
    public Cat(String name,int age){this.name = name;this.age = age;}
    public void SayHy(){
        System.out.println("我是"+this.name+"的猫，年龄"+this.age+"岁");
    }
}