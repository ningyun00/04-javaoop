package onclass.two;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;

public class WedHtml {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8002);
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String s = URLDecoder.decode(bufferedReader.readLine(), "utf-8");
                System.out.println(s);
                String url = s.substring(s.indexOf("/") + 1, s.lastIndexOf("HTTP/1.1") - 1);
                System.out.println("想要访问的网页: " + url);
                InputStream inputStream = new FileInputStream("E:\\S1\\01-作业\\02-HTML\\" + url);
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:text/html\n".getBytes());
                outputStream.write("\r\n".getBytes());
                byte[] bytes = new byte[1024];
                int len = inputStream.read(bytes);
                while (len != -1) {
                    outputStream.write(bytes, 0, len);
                    len = inputStream.read(bytes);
                }
                outputStream.flush();
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
    }
}
