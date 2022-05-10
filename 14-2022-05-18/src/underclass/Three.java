package underclass;

import java.io.File;

/**
 * Description:3.在控制台打出一个文件夹里面所有的文件名和文件夹名。(使用递归,选做)
 * package: underclass <br/>
 * ClassName: four <br/>
 * date: 2022-05-18 下午 12:05:57 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Three {
    /**
     * @Description:
     * @Class: four
     */
    public static void main(String[] args) {/**主程序*/
        operFile("E:\\S2\\04-javaoop\\01-2022-04-26\\src\\onclass");
    }

    public static void operFile(String path) {
        File f = new File(path);
        File[] files = f.listFiles();
        for (File o : files) {
            if (o.isFile()) {
                System.out.println(o.getName() + "----文件");
            }
            if (o.isDirectory()) {
                System.out.println(o.getName() + "----文件夹");
                operFile(o.getPath());
            }
        }
    }
}