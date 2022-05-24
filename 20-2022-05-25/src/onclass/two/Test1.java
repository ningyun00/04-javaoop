package onclass.two;

import java.io.IOException;
import java.net.Socket;

public class Test1 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端以开启");
        Socket socket = new Socket("127.0.0.1", 10239);
        System.out.println("客户端" + socket.getLocalPort() + "已连接：");
        new Thread(new ClientThread(socket)).start();
    }
}
