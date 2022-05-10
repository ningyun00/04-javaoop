package onclass.four;

/**
 * Description:
 * package: onclass.four <br/>
 * ClassName: Role <br/>
 * date: 2022-05-10 下午 04:25:32 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public abstract class Role {
    /**
     * @Description: 抽象类
     * @Class: Role
     */
    private String name;//姓名
    private int age;//年龄
    private char sex;//性别

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public abstract void play();//抽象方法
    public Role(){}
    public Role(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
/**
 * @topic:4、 综合题
 * 定义一个抽象的"Role"类，有姓名，年龄，性别等成员变量
 * 1. 要求尽可能隐藏所有变量(能够私有就私有,能够保护就不要公有)，再通
 * 过 GetXXX()和 SetXXX()方法对各变量进行读写。具有一个抽象的 play()
 * 方法，该方法不返回任何值，同时至少定义两个构造方法。Role 类中要
 * 体现出 this 的几种用法。
 * 2. 从 Role 类派生出一个"Employee"类，该类具有 Role 类的所有成员（构
 * 造方法除外），并扩展 salary 成员变量，同时增加一个静态成员变量“职
 * 工编号（ID）”。同样要有至少两个构造方法，要体现出 this 和 super 的
 * 几种用法，还要求覆盖 play()方法，并提供一个 final sing()方法。
 * 3. "Manager"类继承"Employee"类，有一个 final 成员变量"vehicle"
 * 4. 在 main()方法中制造 Manager 和 Employee 对象,并测试这些对象的方
 */