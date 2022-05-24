package onclass.four;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UDPSend implements Runnable {
    private int SendPort;//发送端口

    public UDPSend(int sendPort) {
        SendPort = sendPort;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入发送对象的端口号");
            String s = scanner.nextLine();
            if (s.equals(SendPort)) {
                byte[] bytes = scanner.nextLine().getBytes(StandardCharsets.UTF_8);
                DatagramSocket datagramSocket = new DatagramSocket();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress("127.0.0.1", SendPort));
                datagramSocket.send(datagramPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
