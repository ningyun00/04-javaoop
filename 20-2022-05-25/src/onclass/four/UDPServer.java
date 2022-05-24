package onclass.four;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;

//服务器
public class UDPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器已启动");
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1000], 1000);
        DatagramSocket datagramSocket = new DatagramSocket(10241);
        String read = null;
        while (true) {
            datagramSocket.receive(datagramPacket);
            read = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println(datagramSocket.getPort() + "：" + read);
        }

    }

}
