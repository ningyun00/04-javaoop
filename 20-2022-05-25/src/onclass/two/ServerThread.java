package onclass.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //  读取客户端传入的内容
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //  发送客户端的内容
            while (true) {
                String s = bufferedReader.readLine();
                System.out.println(socket.getPort() + "客户端发送测试信息：" + s);
                for (Socket socket1 : ServerMain.socketList) {
                    PrintWriter printWriter = new PrintWriter(socket1.getOutputStream());
                    printWriter.println(s);
                    printWriter.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
