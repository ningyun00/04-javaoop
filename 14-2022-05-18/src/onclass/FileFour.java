package onclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileStore;

/**
 * Description:4.删除一个文件夹下所有的文件和子文件夹
 * package: onclass <br/>
 * ClassName: FileFour <br/>
 * date: 2022-05-18 上午 11:25:44 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class FileFour {
    /**
     * @Description:
     * @Class: FileFour
     */
    public static void Del(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                Del(f);
            }else{
                f.delete();
            }
            f.delete();
        }
    }

    public static void main(String[] args) throws IOException {/**主程序*/
        File file = new File("中国");
        Del(file);
    }

}