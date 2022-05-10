package onclass;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * Description:1.利用 File 类在当前作业的项目下创建一个目录结构为:中国/湖南/长沙/java.txt
 * 的目录和文件.
 * package: onclass <br/>
 * ClassName: FileOne <br/>
 * date: 2022-05-18 上午 11:00:29 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class FileOne {
    /**
     * @Description:
     * @Class: FileOne
     */
    public static void main(String[] args) throws IOException {/**主程序*/
        File file = new File("中国\\湖南\\长沙");
        file.mkdirs();
        file = new File("中国\\湖南\\长沙\\java.txt");
        file.createNewFile();
    }
}