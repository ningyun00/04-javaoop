package underclass;

import java.io.File;

/**
 * Description:4.删除一个文件夹下所有的子文件和子目录(使用递归,选做
 * package: underclass <br/>
 * ClassName: Five <br/>
 * date: 2022-05-18 下午 12:13:37 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Four {
    /**
     * @Description:
     * @Class: Five
     */
    public static void main(String[] args) {/**主程序*/
        Del(new File("A"));
    }
    public static void Del(File file) {
        File[] files = file.listFiles();
        for (File o : files) {
            if (o.isDirectory()) {
                Del(o);
            } else {
                o.delete();
            }
        }
        file.delete();
    }
}