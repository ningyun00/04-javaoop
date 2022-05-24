package onclass.one;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {//  10.客户端实例
        System.out.println("客户端启动！");
        Socket socket1 = new Socket("127.0.0.1", 10238);//  11.客户端对象
        System.out.println("连接成功！");
        //
        new Thread(new CThread(socket1)).start();

        new Thread(new CThreadR(socket1)).start();
    }
}
