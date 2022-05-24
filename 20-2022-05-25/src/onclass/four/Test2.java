package onclass.four;

public class Test2 {
    private final static int port = 10243;

    public static void main(String[] args) {
        new Thread(new UDPThread("撒旦")).start();
        new Thread(new UDPSend(10242)).start();
        new Thread(new UDPReception(port)).start();
    }
}
