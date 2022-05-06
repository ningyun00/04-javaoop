package onclass.vehicle;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Vehicle bus = new Bus(50);
        student.goHome(bus, "张三");
        Vehicle train = new Train(200);
        student.goHome(train, "李四");
        Vehicle  airPlan= new AirPlan(800);
        student.goHome(airPlan, "王五");
    }
}
