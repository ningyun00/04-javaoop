package onclass.Five;

/**
 * Description:
 * ClassName: B <br/>
 * date: 2022-05-24 下午 03:42:45 <br/>
 * author: 寜 <br/>
 */
public class B {
    public static void main(String[] args) {
        new Thread(new UDPSender("localhost", 3333)).start();
        new Thread(new UDPReceive(4444, "A")).start();
    }
}