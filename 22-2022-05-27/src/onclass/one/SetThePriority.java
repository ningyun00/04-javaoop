package onclass.one;

/*设置优先级*/
public class SetThePriority {
    public static void main(String[] args) {
        Thread one = new Thread(new PriorityThread(), "一号线");

        Thread two = new Thread(new PriorityThread(), "二号线");
        Thread three = new Thread(new PriorityThread(), "三号线");
        three.setPriority(10);
        two.setPriority(5);
        one.setPriority(1);

        one.start();
        two.start();
        three.start();
    }
}
