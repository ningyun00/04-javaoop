package onclass.five;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Five {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        System.out.println("服务器已经启动");
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("用户" + socket.getPort() + ":已连接到服务器");
            new Thread(new FiveRunnable(socket, "服务器"), "服务器2").start();
        }
    }
}
