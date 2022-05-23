package onclass.four;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Description:
 * ClassName: TalkReceive <br/>
 * date: 2022-05-24 下午 02:20:36 <br/>
 * author: 寜 <br/>
 */
public class TalkReceive implements Runnable {
    DatagramSocket socket = null;
    private int port;
    private String msgFrom;

    public TalkReceive(int port, String msgFrom) {
        this.port = port;
        this.msgFrom = msgFrom;
    }

    @Override
    public void run() {
        //1.创建socket
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        while (true) {

            try {
                //2.准备接收包裹
                byte[] container = new byte[100 ];
                DatagramPacket packet = new DatagramPacket(container, 0, container.length);
                //3.阻塞式接受包裹
                socket.receive(packet);
                //显示接受数据
                byte[] data = packet.getData();
                String receiveData = new String(data, 0, data.length);
                System.out.println(msgFrom + ":" + receiveData);
                if (receiveData.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}