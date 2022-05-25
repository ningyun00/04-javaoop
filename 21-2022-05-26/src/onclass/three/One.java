package onclass.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class One {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = URLDecoder.decode(bufferedReader.readLine(), StandardCharsets.UTF_8);
        System.out.println(s);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
        outputStream.write("Content-Type:text/html\r\n".getBytes());
        outputStream.write("\r\n".getBytes());
        outputStream.write("""
                <!DOCTYPE html>
                <html>
                     <head>
                         <meta charset="utf-8" />
                         <title></title>
                     </head>
                     <body>
                         <p>欧克</p>
                     </body>
                </html>""".getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
    }
}
