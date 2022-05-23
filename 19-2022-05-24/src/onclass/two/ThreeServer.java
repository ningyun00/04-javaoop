package onclass.two;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Description:
 * ClassName: ThreeServer <br/>
 * date: 2022-05-24 上午 11:31:30 <br/>
 * author: 寜 <br/>
 */
public class ThreeServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动");
        Socket socket = ServerAndClient.server(10235);
        System.out.println("客户端与服务器已建立连接");
        BufferedWriter bufferedWriter = ServerAndClient.bw(socket);
        BufferedReader bufferedReader = ServerAndClient.br(socket);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String clientOut = bufferedReader.readLine();
            if (clientOut.endsWith("exit")) break;
            System.out.println("客户端：" + clientOut);

            System.out.print("服务器：");
            bufferedWriter.write(scanner.next() + "\n");
            bufferedWriter.flush();
        }
        ServerAndClient.close(bufferedWriter,bufferedReader,socket);
    }
}