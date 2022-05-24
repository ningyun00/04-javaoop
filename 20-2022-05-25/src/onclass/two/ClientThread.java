package onclass.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread implements Runnable {
    private Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            while (true) {
                System.out.println("请输入内容：");
                String s = scanner.nextLine();
                printWriter.println(s);
                printWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
