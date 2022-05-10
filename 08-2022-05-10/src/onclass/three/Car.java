package onclass.three;

/**
 * Description:
 * package: onclass.three <br/>
 * ClassName: Car <br/>
 * date: 2022-05-10 下午 04:11:32 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Car extends Auto{
    /**
     * @Description:
     * @Class: Car
     */
    private String hvac;//空调
    private String CD;//音乐
    public Car(int tyres, String color, double weight, double speed,String hvac,String CD){
        super(tyres,color,weight,speed);
        this.hvac = hvac;
        this.CD = CD;
    }
    public Car(int tyres, String color, double weight, double speed) {
        super(tyres, color, weight, speed);
    }
    public void hasten(){
        System.out.println("小汽车加速");
    }
    public void decelerate(){
        System.out.println("小汽车减速");
    }
}
/**
 * @topic:
 */