package onclass.two;

public class DeadLock {
    public static void main(String[] args) {
        DeadLockThread deadLockThread1 = new DeadLockThread(true);
        DeadLockThread deadLockThread2 = new DeadLockThread(false);
        new Thread(deadLockThread1,"一号").start();
        new Thread(deadLockThread2,"二号").start();
    }
}
