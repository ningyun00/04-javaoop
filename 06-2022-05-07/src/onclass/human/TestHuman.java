package onclass.human;

/**
 * Description:
 * package: onclass.human <br/>
 * ClassName: TestHuman <br/>
 * date: 2022-05-07 下午 04:46:14 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class TestHuman {
    /**
     * @Description: 测试类
     * @Class: TestHuman
     */
    public static void main(String[] args) {
        Human HStudent = new Student("王八", 20, '公', "1008611");
        HStudent.travel();
        Human HWorker = new Worker();
        HWorker.travel();
        Human HBoss = new Boss();
        HBoss.travel();
    }
}
