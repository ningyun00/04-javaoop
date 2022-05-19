package underclass;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:给一个文件目录,遍历该目录下的所有文件,如果是.java 文件,则利用字符流读取该 java 源
 * 文件,统计全部 java 文件的代码共有多少行,java 文件个数有多
 * package: underclass <br/>
 * ClassName: Three <br/>
 * date: 2022-05-19 上午 11:35:24 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Three {
    /**
     * @Description:
     * @Class: Three
     */
    static int numberJava = 0;
    static int lineJava = 0;

    public static void main(String[] args) throws IOException {/**主程序*/
        openFile(new File("E:\\S2\\04-javaoop\\15-2022-05-19\\src"));//文件路径
        System.out.println("java文件有：" + numberJava);
        System.out.println("java文件内有：" + lineJava + "行");
    }

    public static void openFile(File file) throws IOException {
        File[] file1 = file.listFiles();
        assert file1 != null;
        for (File f : file1) {
            if (f.isDirectory()) {
                openFile(f);
            } else if (f.isFile()) {
                if (Pattern.matches("^[A-Za-z0-9-_]+(.java)$", f.getName())) {
                    numberJava++;
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(f.getPath()));
                    String A = bufferedReader.readLine();
                    while (A != null) {
                        lineJava++;
                        A = bufferedReader.readLine();
                    }
                }
            }
        }
    }
}