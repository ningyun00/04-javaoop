package underclass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * Description:1.实现从控制台接收一些字符串，写入文件中，当输入”exit”,停止
 * package: underclass <br/>
 * ClassName: One <br/>
 * date: 2022-05-18 上午 11:47:39 <br/>
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
        Scanner scanner = new Scanner(System.in);
        File file = new File("课后第一题.txt");
        file.createNewFile();
        String exit = "";
        do {
            System.out.println("请输入要写入文件的内容：");
            exit = scanner.next();
            OutputStream outputStream = new FileOutputStream("课后第一题.txt", true);
            outputStream.write((exit+"\n").getBytes());
        } while (!exit.equals("exit"));
    }
}