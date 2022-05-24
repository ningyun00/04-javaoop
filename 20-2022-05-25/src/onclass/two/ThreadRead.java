package onclass.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadRead implements Runnable {
    private Socket socket;

    public ThreadRead(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String s = bufferedReader.readLine();
                System.out.println(socket.getLocalPort() + "：" + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
