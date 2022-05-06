package underclass.time;

public class Test_MyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(1, 2, 3);
        myTime.display();

        System.out.println(myTime.addHour(10));
        System.out.println(myTime.addMinute(10));
        System.out.println(myTime.addSecond(10));

        System.out.println(myTime.subHour(10));
        System.out.println(myTime.subMinute(10));
        System.out.println(myTime.subSecond(10));
    }
}
