package onclass.four;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Four {
    public static void main(String[] args) throws IOException {
        //4.使用文件流读取 add.html 数据到程序中并且输
        ServerSocket serverSocket = new ServerSocket(10000);//配置服务器
        //服务器已启动;
        System.out.println("服务器已启动");
        while (true) {
            try {
                Socket socket = serverSocket.accept();//对象阻塞,等待传入客户端
                System.out.println("客户端已连接" + socket.getPort());//连接成功提示
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//接收浏览器访问IP端口文件目录;
                String str = URLDecoder.decode(bufferedReader.readLine(), StandardCharsets.UTF_8);//拿取到:GET http/1.1 文件名;
                String url = str.substring(str.indexOf("/") + 1, str.indexOf("HTTP/1.1") - 1);//截取需要打开的文件目录
                String readString = Files.readString(Path.of("E:\\S2\\04-javaoop\\22-2022-05-27\\src\\onclass\\three\\" + url));
                OutputStream outputStream = socket.getOutputStream();//写入到浏览器
                outputStream.write("HTTP/1.1 200 OK\r\nContent-type:text/html\r\n\r\n".getBytes(StandardCharsets.UTF_8));
                outputStream.write(readString.getBytes(StandardCharsets.UTF_8));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
