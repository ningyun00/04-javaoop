package onclass.two;

public class DeadLock {
    public static void main(String[] args) {
        DeadLockThread deadLockThread = new DeadLockThread();
        new Thread(deadLockThread).start();
        new Thread(deadLockThread).start();
    }
}
