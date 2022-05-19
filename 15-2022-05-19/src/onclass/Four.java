package onclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Description:4.使用输入字符流（大的管道）BufferedReader 读取”e:/a.txt“中内容，到控制台输出
 * package: onclass <br/>
 * ClassName: Four <br/>
 * date: 2022-05-19 上午 11:07:17 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Four {
    /**
     * @Description:
     * @Class: Four
     */
    public static void main(String[] args) throws IOException {/**主程序*/
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        char[] chars = new char[100];
        int last = bufferedReader.read(chars);
        while (last!=-1){
            System.out.println(new String(chars,0,last));
            last = bufferedReader.read(chars);
        }
        bufferedReader.close();
    }
}