package onclass.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * Description:
 * ClassName: TalkSend <br/>
 * date: 2022-05-24 下午 02:12:49 <br/>
 * author: 寜 <br/>
 */
public class TalkSend implements Runnable {
    DatagramSocket datagramSocket = null;
    BufferedReader reader = null;
    private int fromPort;
    private String toIP;
    private int toPort;

    public TalkSend(int fromPort, String toIP, int toPort) {
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;
    }

    @Override
    public void run() {
        try {
            datagramSocket = new DatagramSocket(fromPort);//端口号
            //准备数据，控制台读取输入
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                String data = reader.readLine();
                byte[] datas = data.getBytes();
                //2.创建数据包
                //参数：数据，数据开始点，数据长度，发送的地址
                DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress(toIP, toPort));
                //3.发送数据包
                datagramSocket.send(packet);
                if (data.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        datagramSocket.close();
    }
}