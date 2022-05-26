package onclass.six;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Six {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println("服务器已经启动！");
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("对象已经连接"+socket.getPort());
            new Thread(new SixRunnable(socket)).start();
        }
    }
}
