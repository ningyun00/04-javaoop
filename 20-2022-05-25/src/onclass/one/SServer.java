package onclass.one;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用 TCP 协议和线程实现同时收发的聊天程序
 * 服务器端
 */
public class SServer {
    static List<Socket> socketList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动....");
        //  1.创建服务器
        ServerSocket serverSocket = new ServerSocket(10238);
        //  2.循环服务器阻塞
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("连接到服务器！");
            socketList.add(socket);
            //  3.创建服务器接收端;
            //  4.创建接收线程
            new Thread(new SThread(socket)).start();
        }
    }
}
