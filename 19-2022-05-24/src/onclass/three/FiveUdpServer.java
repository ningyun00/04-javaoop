package onclass.three;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Description:
 * ClassName: FiveUdpServer <br/>
 * date: 2022-05-24 上午 11:58:21 <br/>
 * author: 寜 <br/>
 */
public class FiveUdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入内容：");
        byte[] bytes = scanner.next().getBytes();
        datagramSocket.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 10236));
    }
}