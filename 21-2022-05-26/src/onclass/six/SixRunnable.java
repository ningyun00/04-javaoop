package onclass.six;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class SixRunnable implements Runnable {
    private Socket socket;

    public SixRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = URLDecoder.decode(bufferedReader.readLine(), StandardCharsets.UTF_8);
            String urlName = s.substring(s.indexOf("/") + 1, s.indexOf("HTTP/1.1") - 1);
            InputStream inputStream = new FileInputStream("E:\\S1\\01-作业\\02-HTML\\A-01项目-11-00\\项目\\02\\" + urlName);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(("HTTP/1.1 200 OK\r\nContent-Type:text/html\n\r\n").getBytes(StandardCharsets.UTF_8));
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            while (len != -1) {
                outputStream.write(bytes, 0, len);
                len = inputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
