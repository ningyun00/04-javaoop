package onclass.two;

public class DeadLockThread implements Runnable {
    Name name = new Name();
    Age age = new Age();

    @Override
    public void run() {
        synchronized (name) {
            System.out.println("嵌套1 name");
            synchronized (age) {//t2, name, 拿不到B锁,等待
                System.out.println("嵌套1 age");
            }
        }
        synchronized (age) {
            System.out.println("嵌套2 age");
            synchronized (name) {//t1, objB, 拿不到A锁,等待
                System.out.println("嵌套2 name");
            }
        }
        synchronized (name) {
            System.out.println("嵌套3 name");
            synchronized (age) {//t1, objB, 拿不到A锁,等待
                System.out.println("嵌套3 age");
            }
        }
    }
}

class Name {

}

class Age {

}
