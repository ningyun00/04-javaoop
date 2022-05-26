package onclass.one;

public class PriorityThread implements Runnable {
    public PriorityThread() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
