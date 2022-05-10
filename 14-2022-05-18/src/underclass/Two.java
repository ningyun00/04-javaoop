package underclass;

import java.io.*;

/**
 * Description:2.输出某个文件夹下的文件名(包含文件路径)和文件夹名,不包含子文件夹下的内容
 * package: underclass <br/>
 * ClassName: Two <br/>
 * date: 2022-05-18 上午 11:55:50 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Two {
    /**
     * @Description:
     * @Class: Two
     */
    public static void main(String[] args) throws IOException {/**主程序*/
        File file1 = new File("D:\\");
        File[] file = file1.listFiles();
        for(File o:file){
            System.out.println(o.getName());
            System.out.println(o.getPath());
        }
    }
}