package onclass.three;

public class Test2 {
    private final static int port = 10243;

    public static void main(String[] args) {
        new Thread(new UDPThread()).start();
    }
}
