package onclass.one;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Description:
 * package: onclass.one <br/>
 * ClassName: I <br/>
 * date: 2022-05-12 下午 03:58:10 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class I {
    /**
     * @Description:
     * @Class: I
     */
    public static void main(String[] args) throws UnsupportedEncodingException {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String string = scanner.next();
        int one = Integer.parseInt(string);
        System.out.println(one);
    }
}
/**
 * @topic:1、从控制台输入一个字符串的"123456"，利用包装类
 * Integer，转换成基本数据类型的 int 来接收
 */