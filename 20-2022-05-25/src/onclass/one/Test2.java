package onclass.one;

import java.io.IOException;
import java.net.Socket;

public class Test2 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动！");
        Socket socket2 = new Socket("127.0.0.1", 10238);
        System.out.println("连接成功！");
        new Thread(new CThread(socket2)).start();
        new Thread(new CThreadR(socket2)).start();
    }
}
