package onclass.three;

/**
 * Description:
 * package: onclass.three <br/>
 * ClassName: Test <br/>
 * date: 2022-05-10 下午 04:20:59 <br/>
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
        Auto auto = new Car(4, "红色", 200, 60, "冷气", "红尘情歌");
        auto.hasten();
        auto.decelerate();
        auto.stopCar();
    }
}
/**
 * @topic:
 */