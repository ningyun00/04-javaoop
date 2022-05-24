package onclass.four;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReception implements Runnable {
    private int RPort;

    public UDPReception(int RPort) {
        this.RPort = RPort;
    }

    @Override
    public void run() {
        try {
            byte[] database = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(database, 0, database.length);
            DatagramSocket datagramSocket = new DatagramSocket(RPort);
            datagramSocket.receive(datagramPacket);
            String date = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            System.out.println("：" + date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
