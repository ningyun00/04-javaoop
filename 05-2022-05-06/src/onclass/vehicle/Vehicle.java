package onclass.vehicle;

public class Vehicle {
    private int speed;//速度
    public Vehicle(){}
    public Vehicle(int speed){this.speed = speed;}

    public int getSpeed() {
        return speed;
    }
    public void studentGoHome(Vehicle vehicle,String name){
        System.out.println(name+"坐时速"+getSpeed()+"公里每小时回家");
    }
}
/*3. 请继承和多态编码实现如下需求
交通工具类:Traffic、公共汽车类 Bus 火车类 Train 飞机类 AirPlan
每种交通工具都有时速属性:speed;
编写学员类 Student，有姓名属性 name
请编写学员回家的行为 goHome，可以选择不同的交通工具来乘坐回家。
如选择的是汽车输出信息:"菜 10 坐时速 120 公里每小时汽车回家
如选择的是火车输出信息:"菜10坐时速180公里每小时火车回家" 如选反的是飞机输出信息:"菜10坐时速320公里每小时飞机回家" 编写 Test3*/