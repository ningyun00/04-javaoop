package onclass.home_one;
/**测试类*/
public class Test {
    public static void main(String[] args) {
        /*学生类*/
        Person person = new Person();
        person.setName("寜");
        /*飞机*/
        AirPlan airPlan = new AirPlan();
        airPlan.setSpeed(10);
        /*汽车*/
        Bus bus = new Bus();
        bus.setSpeed(10);
        /*火车*/
        Train train = new Train();
        train.setSpeed(10);
        /*回家*/
        person.goHome(bus);
        person.goHome(train);
        person.goHome(airPlan);
    }
}
