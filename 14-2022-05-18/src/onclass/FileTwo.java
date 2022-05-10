package onclass;

import java.io.*;

/**
 * Description:2.用字节流将 a.txt 文件中的文本复制到 b.txt 文件当中(一次读一个字节的方式)
 * package: onclass <br/>
 * ClassName: FileTwo <br/>
 * date: 2022-05-18 上午 11:06:34 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class FileTwo {
    /**
     * @Description:
     * @Class: FileTwo
     */
    public static void main(String[] args) throws IOException {/**主程序*/
        InputStream inputStream = new FileInputStream("a.txt");
        int index = inputStream.read();
        OutputStream outputStream = new FileOutputStream("b.txt");
        while (index!=-1){
            outputStream.write(index);
            index = inputStream.read();
        }
        inputStream.close();
        outputStream.close();
    }
}