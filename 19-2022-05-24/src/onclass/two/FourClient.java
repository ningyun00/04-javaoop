package onclass.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Description:
 * ClassName: FourClient <br/>
 * date: 2022-05-24 上午 11:31:49 <br/>
 * author: 寜 <br/>
 */
public class FourClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        Socket socket = ServerAndClient.client("127.0.0.1", 10235);
        BufferedWriter bufferedWriter = ServerAndClient.bw(socket);
        BufferedReader bufferedReader = ServerAndClient.br(socket);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("客户端(输入)：");
            bufferedWriter.write(scanner.next() + "\n");
            bufferedWriter.flush();

            String serverOut = bufferedReader.readLine();
            if (serverOut.endsWith("exit")) break;
            System.out.println("服务端(输出)：" + serverOut);
        }
        ServerAndClient.close(bufferedWriter, bufferedReader, socket);
    }
}