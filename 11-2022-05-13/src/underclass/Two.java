package underclass;

import java.util.Scanner;

/**
 * Description:
 * package: underclass <br/>
 * ClassName: Two <br/>
 * date: 2022-05-13 下午 05:19:10 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Two {
    /**
     * @Description: 课后第二题
     * @Class: Two
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String str1 = scanner.next();
        char str2 = str1.charAt(0);
        if (Character.isUpperCase(str2)){
            System.out.println("是大写字母");
        }else{
            System.out.println("不是大写字母");
        }
    }
}
/**
 * @topic:2、输入一个字符串，取出这个字符串中的第一个字符，判断这个字符是否为大写字母。（查帮助，Character类）
 */