package onclass.vehicle;

public class Train extends Student{
    public Train(){}
    public Train(int speed){super(speed);}
    public void studentGoHome(Vehicle vehicle,String name){
        System.out.println(name+"坐时速"+getSpeed()+"公里每小时火车回家");
    }
}
