package onclass.one;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Description:
 * package: onclass.one <br/>
 * ClassName: III <br/>
 * date: 2022-05-12 下午 04:47:23 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class III {
    /**
     * @Description:
     * @Class: III
     */
    public static void main(String[] args) throws UnsupportedEncodingException {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个中文字符串：");
        String three = scanner.next();
        char[] threeCharArr = three.toCharArray();
        for (int i = 0; i < threeCharArr.length; i++) {
            System.out.print(threeCharArr[i] + "\t");
        }
        System.out.println();

        String threeNew = new String(three);
        //UTF-8
        byte[] threeByteArr = threeNew.getBytes("UTF-8");
        System.out.println(threeByteArr);
        for (int i = 0; i < threeByteArr.length; i++) {
            System.out.print(threeByteArr[i] + "\t");
        }
        System.out.println();
        //GBK
        threeByteArr = threeNew.getBytes("gbk");
        System.out.println(threeByteArr);
        for (int i = 0; i < threeByteArr.length; i++) {
            System.out.print(threeByteArr[i] + "\t");
        }
        System.out.println();
        //iso-8859-1
        threeByteArr = threeNew.getBytes("iso-8859-1");
        System.out.println(threeByteArr);
        for (int i = 0; i < threeByteArr.length; i++) {
            System.out.print(threeByteArr[i] + "\t");
        }
    }
}
/**
 * @topic: 3、输入一个带中文的字符串，
 *  （1)、把其转换成字符数组并输出
 *  （2)、把其按三种编码方式转换成字节数组输出(gbk,iso-8859-1,utf-8)
 */