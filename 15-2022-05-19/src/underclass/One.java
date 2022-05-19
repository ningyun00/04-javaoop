package underclass;

import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Description:1.利用字符流,将 a.txt 文件里的内容读取出来,然后再写到 b.txt 文件当中
 * package: underclass <br/>
 * ClassName: One <br/>
 * date: 2022-05-19 上午 11:16:38 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class One {
    /**
     * @Description:
     * @Class: One
     */
    public static void main(String[] args) throws IOException {/**主程序*/
        FileReader fileReader = new FileReader("a.txt");
        FileWriter fileWriter = new FileWriter("c.txt");
        char[] chars = new char[100];
        int last = fileReader.read(chars);
        while (last != -1) {
            fileWriter.write(new String(chars, 0, last));
            last = fileReader.read(chars);
        }
        fileWriter.close();
        fileReader.close();
    }
}