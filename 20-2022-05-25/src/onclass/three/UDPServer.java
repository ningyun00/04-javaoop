package onclass.three;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//服务器
public class UDPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器已启动");
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1000], 1000);
        DatagramSocket datagramSocket = new DatagramSocket(10241);
        while (true) {
            datagramSocket.receive(datagramPacket);
            String read = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println(datagramSocket.getPort() + "：" + read);
        }

    }

}
