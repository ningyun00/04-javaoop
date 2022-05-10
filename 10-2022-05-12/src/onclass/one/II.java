package onclass.one;

import java.util.Scanner;

/**
 * Description:
 * package: onclass.one <br/>
 * ClassName: II <br/>
 * date: 2022-05-12 下午 04:45:10 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class II {
    /**
     * @Description:
     * @Class: II
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个整数字符串：");
        String two = scanner.next();
        System.out.println(Integer.parseInt(two));
        System.out.println(Double.parseDouble(two));
    }
}
/**
 * @topic:2、输入一个整数字符串，把其转换为整数和小数输出
 */