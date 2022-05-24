package onclass.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CThread implements Runnable {
    private Socket socket;//    指定客户端

    public CThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);// 用户输入内容
        try {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());//控制台输出
            while (true) {
                System.out.println("请输入内容：");// 给用户提示
                String s = scanner.nextLine();//输入A

                printWriter.println(s);//输出A
                printWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
