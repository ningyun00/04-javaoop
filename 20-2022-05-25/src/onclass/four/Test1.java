package onclass.four;

public class Test1 {
    private final static int port = 10242;

    public static void main(String[] args) {
        new Thread(new UDPThread("张三")).start();
        new Thread(new UDPSend(10243)).start();
        new Thread(new UDPReception(port)).start();
    }
}
