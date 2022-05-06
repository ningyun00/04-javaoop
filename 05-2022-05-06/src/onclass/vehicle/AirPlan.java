package onclass.vehicle;

public class AirPlan extends Student{
    public AirPlan(){}
    public AirPlan(int speed){super(speed);}
    public void studentGoHome(Vehicle vehicle,String name){
        System.out.println(name+"坐时速"+getSpeed()+"公里每小时飞机回家");
    }
}
