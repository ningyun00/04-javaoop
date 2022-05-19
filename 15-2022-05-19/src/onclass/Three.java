package onclass;

import java.io.FileReader;
import java.io.IOException;

/**
 * Description:3.用输入字符流(小的管道)读取”e:/a.txt“中内容,到控制台输出
 * package: onclass <br/>
 * ClassName: Three <br/>
 * date: 2022-05-19 上午 11:01:50 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Three {
    /**
     * @Description:
     * @Class: Three
     */
    public static void main(String[] args) throws IOException {/**主程序*/
        FileReader fileReader = new FileReader("a.txt");
        int index = fileReader.read();
        while (index != -1) {
            System.out.print((char) index);
            index = fileReader.read();
        }
        fileReader.close();
    }
}