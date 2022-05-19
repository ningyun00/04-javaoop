package onclass;

import java.io.*;

/**
 * Description:5.新建立一个文件“e:/b.txt”将 1 题中的内容复制过来(用大管道)
 * package: onclass <br/>
 * ClassName: Five <br/>
 * date: 2022-05-19 上午 11:12:59 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Five {
    /**
     * @Description:
     * @Class: Five
     */
    public static void main(String[] args) throws IOException {/**主程序*/
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("b.txt"));
        char [] chars = new char[100];
        int last = bufferedReader.read(chars);
        while (last!=-1){
            bufferedWriter.write(new String(chars,0,last));
            last = bufferedReader.read(chars);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}