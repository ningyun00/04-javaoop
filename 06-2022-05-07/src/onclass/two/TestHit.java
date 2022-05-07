package onclass.two;

/**
 * Description:
 * package: onclass.two <br/>
 * ClassName: TestHit <br/>
 * date: 2022-05-07 下午 04:59:14 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class TestHit{
    /**
     * @Description: 测试类
     * @Class: TestHit
     */
    public static void main(String[] args) {
        Hit HFat = new Fat();
        HFat.hit();
        Hit HThin = new Thin();
        HThin.hit();
    }
}
