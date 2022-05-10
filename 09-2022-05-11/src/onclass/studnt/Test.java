package onclass.studnt;

/**
 * Description:
 * package: onclass.studnt <br/>
 * ClassName: Test <br/>
 * date: 2022-05-12 上午 11:32:36 <br/>
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
        Studnt studnt = new Studnt();
        Classs classs = new Classs();
        classs.Add("张三");
        classs.Add("小红");
        System.out.println(classs.get("小红"));
        System.out.println(classs.get(1));
    }
}
/**
 * @topic:
 */