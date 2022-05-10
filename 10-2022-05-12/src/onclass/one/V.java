package onclass.one;

import java.util.Scanner;

/**
 * Description:
 * package: onclass.one <br/>
 * ClassName: V <br/>
 * date: 2022-05-12 下午 05:29:00 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class V {
    /**
     * @Description:
     * @Class: V
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入:");
        String str1 = scanner.next();
        StringBuffer sb = new StringBuffer(str1);
        sb.insert(2,"java");
        System.out.println(sb);
        sb.replace(2,6, "android");
        System.out.println(sb);
        sb.delete(9,11);
        System.out.println(sb);
    }
}
/**
 * @topic:5.从控制台输入一个字符串"我是软件工程师",用 StringBuffer
 * 对它进行操作。(1).添加,效果改为"我是 java 软件工程师"
 * (2).修改，将上述添加后的效果改为"我是 android 软件工程师"
 * (3).删除，效果改为"我是 android 工程师
 */