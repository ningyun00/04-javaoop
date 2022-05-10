package onclass.four;

/**
 * Description:
 * package: onclass.four <br/>
 * ClassName: Manager <br/>
 * date: 2022-05-10 下午 04:54:17 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Manager extends Employee{
    /**
     * @Description: 经理类 继承 员工类
     * @Class: Manager
     */
    private final String vehicle = "宝马";
    public Manager(String name, int age, char sex, double salary, String ID) {
        super(name, age, sex, salary, ID);
    }

    public Manager(String name, int age, char sex, double salary) {
        super(name, age, sex, salary);
    }

    @Override
    public void play() {
        System.out.println("好车"+vehicle);
    }
}
/**
 * @topic:
 */