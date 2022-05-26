package onclass.four;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class Four {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10087);//服务器
        System.out.println("服务器已经开启");
        while (true) {
            try {
                Socket socket = serverSocket.accept();//连接客户端阻塞
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String s = URLDecoder.decode(bufferedReader.readLine(), StandardCharsets.UTF_8);
                System.out.println(s);
                String A = s.substring(s.indexOf("/") + 1, s.indexOf("HTTP/1.1") - 1);
                System.out.println(A);
                InputStream inputStream = new FileInputStream("E:\\S1\\01-作业\\02-HTML\\" + A);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:text/html\n\r\n".getBytes(StandardCharsets.UTF_8));
                byte[] bytes = new byte[1024];
                int len = inputStream.read(bytes);
                while (len != -1) {
                    outputStream.write(bytes, 0, len);
                    len = inputStream.read(bytes);
                }
            } catch (Exception e) {

            }
        }
    }
}
