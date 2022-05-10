package onclass;

import javax.imageio.IIOException;
import java.io.*;

/**
 * Description:3.实现图片等二进制文件的复制(小水桶的方式)
 * package: onclass <br/>
 * ClassName: FileThree <br/>
 * date: 2022-05-18 上午 11:19:16 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class FileThree {
    /**
     * @Description:
     * @Class: FileThree
     */
    public static void main(String[] args) throws IOException {/**主程序*/
        InputStream inputStream = new FileInputStream("漆原琉华.JPG");
        byte[] bytes = new byte[1024];
        int index = inputStream.read(bytes);
        OutputStream outputStream = new FileOutputStream("漆原琉华-copy.JPG");
        while (index != -1) {
            outputStream.write(bytes, 0, index);
            index = inputStream.read(bytes);
        }
        inputStream.close();
        outputStream.close();
    }
}