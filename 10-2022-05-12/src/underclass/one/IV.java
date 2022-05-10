package underclass.one;

import java.util.Scanner;

/**
 * Description:
 * package: underclass.one <br/>
 * ClassName: IV <br/>
 * date: 2022-05-12 下午 07:50:43 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class IV {
    /**
     * @Description:
     * @Class: IV
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            System.out.println("输入"+(i+1)+":");
            sb.append(scanner.next()+",");
        }
        System.out.println(sb);
    }
}
/**
 * @topic:4. 定义 StringBuffer 对象，循环输入 s2 学期学的课程（js,c#,sql,java,jsp）追加到
 * StringBuffer 对象里面输出。
 */