package onclass;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Description:2.用输出字符流向(new FileWriter(f,true))"e:/a.txt"追加“小样，你坏坏！！！“
 * package: onclass <br/>
 * ClassName: Two <br/>
 * date: 2022-05-19 上午 10:59:11 <br/>
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
        FileWriter fileWriter = new FileWriter("a.txt", true);
        fileWriter.append("\n小样，你坏坏！！！");
        fileWriter.close();
    }
}