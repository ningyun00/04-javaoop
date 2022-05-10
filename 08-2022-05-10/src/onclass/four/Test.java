package onclass.four;

/**
 * Description:
 * package: onclass.four <br/>
 * ClassName: Test <br/>
 * date: 2022-05-10 下午 04:56:17 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Test {
    /**
     * @Description: 测试类
     * @Class: Test
     */
    public static void main(String[] args) {/**主程序*/
        Employee employee = new Employee("张三",24,'女',1023,"1008611");
        Manager manager = new Manager("张三", 24, '女', 2000, "10086");
        employee.sing();
        employee.play();
        manager.sing();
        manager.play();
    }
}
/**
 * @topic:
 */