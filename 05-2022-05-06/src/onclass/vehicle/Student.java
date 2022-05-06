package onclass.vehicle;

public class Student extends Vehicle{
    private String name;//姓名
    public Student(){}
    public Student(int speed){super(speed);}
    public void goHome(Vehicle vehicle,String name){
        vehicle.studentGoHome(vehicle,name);
    }
}
