package onclass.two;

public class DeadLockThread implements Runnable {
    Name name = new Name();
    Age age = new Age();
    private boolean flag;

    public DeadLockThread(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (name) {
                    System.out.println(Thread.currentThread().getName() + "嵌套1 name");
                    synchronized (age) {//t2, name, 拿不到B锁,等待
                        System.out.println(Thread.currentThread().getName() + "嵌套1 age");
                    }
                }
            }
        } else {
            while (true) {
                synchronized (age) {
                    System.out.println(Thread.currentThread().getName() + "嵌套2 age");
                    synchronized (name) {//t1, objB, 拿不到A锁,等待
                        System.out.println(Thread.currentThread().getName() + "嵌套2 name");
                    }
                }
            }
        }
    }
}

class Name {

}

class Age {

}
