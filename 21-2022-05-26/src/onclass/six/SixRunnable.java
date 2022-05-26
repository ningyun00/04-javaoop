package onclass.six;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

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
            //byte[] bytes = Files.readAllBytes(Paths.get("E:\\S2\\02-JS(javascript)\\15-2022-04-12\\考试\\" + s.substring(s.indexOf("/") + 1, s.indexOf("HTTP/1.1") - 1)));
            //byte[] bytes = Files.readAllBytes(Paths.get("E:\\S2\\02-JS(javascript)\\15-2022-04-12\\考试\\" + s.substring(s.indexOf("/") + 1, s.indexOf("HTTP/1.1") - 1)));

            InputStream inputStream = new FileInputStream("E:\\S1\\01-作业\\02-HTML\\01HTML-10-25\\上机\\01\\" + s.substring(s.indexOf("/") + 1, s.indexOf("HTTP/1.1") - 1));
//           String bytes = Files.readString(Paths.get("E:\\S2\\02-JS(javascript)\\15-2022-04-12\\考试\\" + s.substring(s.indexOf("/") + 1, s.indexOf("HTTP/1.1") - 1)));
//            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//            bufferedWriter.write("HTTP/1.1 200 OK\r\nContent-Type:text/html\n\r\n");
//            int s1 = inputStream.read();
//            while (true) {
//                bufferedWriter.write(s1);
//                s1 = inputStream.read();
//            }
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("HTTP/1.1 200 OK\r\nContent-Type:text/html\n\r\n".getBytes(StandardCharsets.UTF_8));
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

    @Override
    public String toString() {
        return "SixRunnable{" +
                "socket=" + socket +
                '}';
    }
}
