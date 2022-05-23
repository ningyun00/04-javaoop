package onclass.Five;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Description: 接收端
 * ClassName: UDPReceive <br/>
 * date: 2022-05-24 下午 03:34:05 <br/>
 * author: 寜 <br/>
 */
public class UDPReceive implements Runnable {
    DatagramSocket datagramSocket = null;
    private int port;//接收端的端口号
    private String receiver;//接收者

    public UDPReceive(int port, String receiver) {
        this.port = port;
        this.receiver = receiver;
        try {
            datagramSocket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                byte[] database = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(database, 0, database.length);
                datagramSocket.receive(datagramPacket);
                String date = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                if (date.equals("exit")) {
                    System.exit(0);
                    break;
                }
                System.out.println(receiver + "：" + date);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        datagramSocket.close();
    }
}