package onclass.five;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;

public class FiveRunnable implements Runnable {
    private Socket socket;
    private String name;

    public FiveRunnable(Socket socket, String name) {
        this.socket = socket;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = URLDecoder.decode(bufferedReader.readLine(), StandardCharsets.UTF_8);
            String url = s.substring(s.indexOf("/") + 1, s.indexOf("HTTP/1.1") - 1);
            InputStream inputStream = new FileInputStream("E:\\S1\\01-作业\\02-HTML\\A-01项目-11-00\\项目\\02\\" + url);

            OutputStream outputStream = socket.getOutputStream();

            outputStream.write("HTTP/1.1 200 OK\r\n".getBytes(StandardCharsets.UTF_8));
            outputStream.write("Content-Type:text/html\r\n".getBytes(StandardCharsets.UTF_8));
            outputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            while (len != -1) {
                outputStream.write(bytes, 0, len);
                len = inputStream.read(bytes);
            }
            PreparedStatement preparedStatement = null;
            preparedStatement.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
