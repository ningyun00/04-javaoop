package underclass;

import java.util.Scanner;

/**
 * Description:
 * package: underclass <br/>
 * ClassName: one <br/>
 * date: 2022-05-13 下午 05:13:11 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class One {
    /**
     * @Description: 课后第一题
     * @Class: one
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int i1 = 0;
        while (i == 1) {
            System.out.println("请输入一个数:");
            String str1 = scanner.next();
            try {/*异常块*/
                i1 = Integer.parseInt(str1);
                i = 0;
            } catch (Exception exception) {/*异常类型 捕获异常*/
                i = 1;
            }
        }
        System.out.println(i1+100);
    }
}
/**
 * @topic:1、输入一个字符串，将此字符串转换为一个整数，如果不成功就继续输入，直到成功得到一个整数后，将此数加100输出结果。
 */