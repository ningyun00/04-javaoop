package onclass.three;

public class Test1 {
    private final static int port = 10242;

    public static void main(String[] args) {
        new Thread(new UDPThread()).start();

    }
}
