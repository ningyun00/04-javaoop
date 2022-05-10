package underclass.one;

import java.util.Scanner;

/**
 * Description:
 * package: underclass.one <br/>
 * ClassName: I <br/>
 * date: 2022-05-12 下午 07:01:37 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class I {
    /**
     * @Description:
     * @Class: I
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        char[] arrChar = new char[10];
        String[] arrStr = new String[10];
        String sbDASB = "";
        for (int i = 0; i < 10; i++) {
            System.out.println("输入" + (i + 1) + ":");
            arrStr[i] = scanner.next();
            System.out.println(getType(arrStr[i]));
        }
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i].toCharArray();
            System.out.println(getType(arrStr[i]));
        }
        for (int i = 0; i < arrStr.length; i++) {
            arrChar[i] = arrStr[i].charAt(0);
            System.out.println(getType(arrChar[i]));
        }
        for (int i = 0; i < arrChar.length; i++) {
            sbDASB += arrChar[i];
            System.out.println(getType(sbDASB));
        }
        System.out.println(sbDASB);
        arrChar = sbDASB.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {
            System.out.print(arrChar[i]);
            System.out.println();
            System.out.print(getType(arrChar[i]));
        }
        byte [] arrByte = sbDASB.getBytes();
        for (int i = 0; i < arrByte.length; i++) {
            System.out.println(arrByte);
            System.out.println(arrByte[i]);
        }
    }

    public static String getType(Object o) {
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}
/**
 * @topic:1. 定义一个 10 个长度的char类型的数组， 输入 10 个字符， 将此数组转换成字符串
 * 2. 将第一题的字符串还原成 char类型的数组，输出
 * 3. 将第一题的字符串转换成 byte 类型的数组，输出
 */