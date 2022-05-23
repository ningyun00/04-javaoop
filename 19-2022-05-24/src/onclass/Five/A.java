package onclass.Five;

/**
 * Description:
 * ClassName: A <br/>
 * date: 2022-05-24 下午 03:42:41 <br/>
 * author: 寜 <br/>
 */
public class A {
    public static void main(String[] args) {
        new Thread(new UDPSender( "localhost", 4444)).start();
        new Thread(new UDPReceive(3333, "B")).start();
    }
}