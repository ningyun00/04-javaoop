package onclass.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SThread implements Runnable {//    5.接收线程
    private Socket socket;//    6.创建虚拟 发送客户端

    public SThread(Socket socket) {//   7.传入实体发送客户端
        this.socket = socket;   // 客户端
    }

    //接收
    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//   8.获取用户传入的内容
            while (true) {
                //  服务器读取客户端内容输出到服务器
                String str = bufferedReader.readLine();//读取 指定 用户传入的内容
                System.out.println("测试：" + str);
                //  服务器接收指定对象发送到其余客户端
                for (Socket s : SServer.socketList) {//对象列表
                    PrintWriter printWriter = new PrintWriter(s.getOutputStream());//   9.依次发送到客户端列表    10.创建客户端实例
                    printWriter.println("用户" + socket.getPort() + "说：" + str);
                    printWriter.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
