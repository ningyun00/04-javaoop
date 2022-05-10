package underclass;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Description:
 * package: underclass <br/>
 * ClassName: Four <br/>
 * date: 2022-05-14 下午 12:37:31 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Four {
    /**
     * @Description: 课后第四题
     * @Class: Four
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入:");
        String str1 = scanner.next();
        System.out.println(Arrays.toString(str1.split("(?<=[a-z])(?=[A-Z])")));
    }
}
/**
 * @topic:4. 输入一个字符串：
 * 例如:
 * XinruiTomUuP
 * 根据英文单词由大写字母分解:
 * Xinrui
 * Tom
 * Uup
 */
/*        StringBuffer strBuffer = new StringBuffer();
        char[] cStrBuffer = str1.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < cStrBuffer.length; i++) {
            if (cStrBuffer[i] < 'a' && i != 0){
                start = end;
                end = i;
                strBuffer.append(str1.substring(start,end)+" ");
            }
        }
        strBuffer.append(str1.substring(end,cStrBuffer.length));
        System.out.println(strBuffer.toString());*/