package onclass.studnt;

/**
 * Description:
 * package: onclass.studnt <br/>
 * ClassName: Studnt <br/>
 * date: 2022-05-12 上午 11:21:38 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Studnt {
    /**
     * @Description: 学生类
     * @Class: Studnt
     */
    private String name;//姓名
    private int age;//年龄

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
/**
 * @topic:1.有一个学生类，类中有私有属性：姓名、年龄，公有的get和set方法。有构造方法为属性初始化值
 * 再做一个班级的类，类中有属性：存放30个学生的数组（Student[]），统计当前人数的计数器。类中有方法：向班级中加入学生的方法，及两个得到学生的方法。
 * public 学生 get(整形 下标);
 * public 学生 get(字符串 学生名);
 * 以上两个方法是方法的重载，也就是说：我们要得到一个学生，可以通过学生所在的下标得到。也可以通过学生的名字得到。如：假如数组中下标2上放了一个学生“小红”,15岁。那么调用  班级.get(2)  与调用  班级.get("小红") 得到的学生对象相同。
 */