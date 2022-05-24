package onclass.three;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UDPThread implements Runnable {
    //接收信息
    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入内容");
            String read = scanner.nextLine();//输入的内容
            byte[] bytes = read.getBytes(StandardCharsets.UTF_8);
            try {
                DatagramSocket datagramSocket = new DatagramSocket();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress("127.0.0.1", 10241));
                datagramSocket.send(datagramPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
