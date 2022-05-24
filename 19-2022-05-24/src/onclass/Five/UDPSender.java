package onclass.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Description: 发送端
 * ClassName: UDPSender <br/>
 * date: 2022-05-24 下午 03:14:27 <br/>
 * author: 寜 <br/>
 */
public class UDPSender implements Runnable {
    DatagramSocket datagramSocket = null;//数据包 套结字   对象
    private String IP;//本地IP地址
    private int sendPort;//发送端口号

    public UDPSender(String IP, int sendPort) {
        this.IP = IP;
        this.sendPort = sendPort;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入对话内容：");
                String dateLine = scanner.nextLine();
                if (dateLine.equals("exit")) {
                    System.exit(0);
                    break;
                }
                byte[] bytes = dateLine.getBytes();//内容
                datagramSocket = new DatagramSocket();
                //                                                 内容   从0开始    内容长度                            本机IP 发送端口
                DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress(IP, sendPort));
                datagramSocket.send(datagramPacket);//发送数据
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}