package onclass.two;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description:
 * ClassName: ServerAndClient <br/>
 * date: 2022-05-24 上午 11:32:22 <br/>
 * author: 寜 <br/>
 */
public class ServerAndClient {
    public static Socket server(int port) throws IOException {
        return new ServerSocket(port).accept();
    }

    public static BufferedWriter bw(Socket socket) throws IOException {
        return new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//服务端 --> 客户端
    }

    public static BufferedReader br(Socket socket) throws IOException {
        return new BufferedReader(new InputStreamReader(socket.getInputStream()));  //客户端 --> 服务端
    }

    public static Socket client(String host, int port) throws IOException {
        return new Socket(host, port);
    }

    public static void close(BufferedWriter bufferedWriter, BufferedReader bufferedReader, Socket socket) throws IOException {
        if (bufferedWriter != null) bufferedWriter.close();
        if (bufferedReader != null) bufferedReader.close();
        if (socket != null) socket.close();
    }
}