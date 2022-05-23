package onclass.one;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Description:
 * ClassName: OneServer <br/>
 * date: 2022-05-24 上午 11:01:20 <br/>
 * author: 寜 <br/>
 */
public class OneServer {//服务器

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10234);
        System.out.println("服务器启动");
        Socket socket = serverSocket.accept();
        System.out.println("服务器与客户端建立连接");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//服务端 --> 客户端
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //客户端 --> 服务端
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String rl = bufferedReader.readLine();
            if (rl.endsWith("exit")) break;
            System.out.println("客户端(输出)：" + rl);

            System.out.print("服务器(输入)：");
            bufferedWriter.write(scanner.next() + "\n");
            bufferedWriter.flush();
        }
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
    }
}