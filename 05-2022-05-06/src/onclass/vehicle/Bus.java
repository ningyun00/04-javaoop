package onclass.vehicle;

public class Bus extends Student{
    public Bus(){}
    public Bus(int speed){super(speed);}
    public void studentGoHome(Vehicle vehicle,String name){
        System.out.println(name+"坐时速"+getSpeed()+"公里每小时汽车回家");
    }
}
