package onclass.two;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerMain {
    static List<Socket> socketList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //1.创建服务器
        System.out.println("正在启动服务器.....");
        ServerSocket serverSocket = new ServerSocket(/*端口号*/10239);
        while (true) {
            Socket socket = serverSocket.accept();//创建阻塞以便客户端连接
            System.out.println(socket.getPort() + "客户端已连接服务器");
            socketList.add(socket);
            //  服务器线程   进行读写(读,转发)
            new Thread(new ServerThread(socket)).start();
        }
    }
}
