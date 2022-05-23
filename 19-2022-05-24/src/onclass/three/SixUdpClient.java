package onclass.three;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Description:
 * ClassName: SixUdpClient <br/>
 * date: 2022-05-24 上午 11:58:36 <br/>
 * author: 寜 <br/>
 */
public class SixUdpClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端");
        DatagramSocket datagramSocket = new DatagramSocket(10236);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[100], 100);
        datagramSocket.receive(datagramPacket);
        System.out.println(datagramPacket.getPort() + "：" + new String(datagramPacket.getData(), 0, datagramPacket.getLength()));

    }
}