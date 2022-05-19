package onclass;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Description:1.用输出字符流（new FileWriter()）向"e:/a.txt"写入“你好，小样”换行后“小样，你
 * 坏”。
 * package: onclass <br/>
 * ClassName: One <br/>
 * date: 2022-05-19 上午 10:55:19 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class One {
    /**
     * @Description:
     * @Class: One
     */
    public static void main(String[] args)throws IOException {/**主程序*/
        FileWriter fileWriter = new FileWriter("a.txt");
        fileWriter.write("你好，小样\n小样，你好坏");
        fileWriter.close();
    }
}