package underclass;

import java.io.*;

/**
 * Description:2.从控制台接受字母写入文件，要求用 BufferedReader、BufferedWrite
 * package: underclass <br/>
 * ClassName: Two <br/>
 * date: 2022-05-19 上午 11:28:28 <br/>
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedWriter bufferedWriterTxt = new BufferedWriter(new FileWriter("d.txt", true));
        bufferedWriter.write("请输入字母：");
        bufferedWriter.flush();
        bufferedWriterTxt.write(bufferedReader.readLine());
        bufferedWriterTxt.flush();
        bufferedWriter.write("写入成功！");
        bufferedWriter.flush();
        bufferedWriterTxt.close();
        bufferedWriter.close();
        bufferedReader.close();
    }
}