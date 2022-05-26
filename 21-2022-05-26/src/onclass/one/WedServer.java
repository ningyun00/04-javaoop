package onclass.one;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class WedServer {
    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket serverSocket = new ServerSocket(8001);
        //创建连接客户端
        while (true) {
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024];
            String s = URLDecoder.decode(new String(bytes, 0, inputStream.read(bytes)), "utf-8");
            System.out.println(s);
            OutputStream outputStream = socket.getOutputStream();


            outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
            outputStream.write("Content-Type:text/html\r\n".getBytes());
            outputStream.write("\r\n".getBytes());


            outputStream.write(("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "     <head>\n" +
                    "         <meta charset=\"utf-8\" />\n" +
                    "         <title></title>\n" +
                    "     </head>\n" +
                    "     <body>\n" +
                    "         <p>阿瑟东让她以后就会发光的发生大事故回家</p>\n" +
                    "     </body>\n" +
                    "</html>").getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
        }
    }
}
