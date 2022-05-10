package onclass.four;

/**
 * Description:
 * package: onclass.four <br/>
 * ClassName: Employee <br/>
 * date: 2022-05-10 下午 04:42:52 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Employee extends Role {
    /**
     * @Description: 员工类 继承 角色类
     * @Class: Employee
     */
    private double salary;
    private String ID;//职工编号
    @Override
    public void play() {
        System.out.println("好人");
    }

    public Employee(String name, int age, char sex,double salary) {
        super(name,age,sex);
        this.salary = salary;
    }

    public Employee(String name, int age, char sex, double salary,String ID) {
        super(name, age, sex);
        this.ID = ID;
    }
    public final void sing(){
        System.out.println("并提供一个 final sing()方法。");
    }
}
/**
 * @topic:
 */