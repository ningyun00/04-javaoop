package onclass.one;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Description:
 * ClassName: TwoClient <br/>
 * date: 2022-05-24 上午 11:01:38 <br/>
 * author: 寜 <br/>
 */
public class TwoClient {//客户端

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10234);
        System.out.println("客户端启动");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//输出流 客户端 --> 服务端
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//输入流   服务端 --> 客户端
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("客户端(输入)：");
            bufferedWriter.write(scanner.next() + "\n");
            bufferedWriter.flush();

            String rl = bufferedReader.readLine();
            if (rl.endsWith("exit")) break;
            System.out.println("服务端(输出)：" + rl);
        }
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}