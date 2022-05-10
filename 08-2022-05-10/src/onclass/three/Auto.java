package onclass.three;

/**
 * Description:
 * package: onclass.three <br/>
 * ClassName: Auto <br/>
 * date: 2022-05-10 下午 04:03:03 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Auto {
    /**
     * @Description: 汽车类
     * @Class: Auto
     */
    private int tyres;//轮胎个数
    private String color;//汽车颜色
    private double weight;//汽车重量
    private double speed;//汽车速度

    public Auto(int tyres, String color, double weight, double speed) {
        this.tyres = tyres;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public void hasten() {
        System.out.println("汽车加速");
    }

    public void decelerate() {
        System.out.println("汽车减速");
    }

    public void stopCar() {
        System.out.println("汽车停车");
    }
}
/**
 * @topic:3、 建立一个汽车 Auto 类，包括轮胎个数，汽车颜色，车身重量、速度等成员
 * 变量。并通过不同的构造方法 创建实例。至少要求： 汽车能够加速，减速，
 * 停车。 再定义一个小汽车类 Car，继承 Auto，并添加空调、CD 等成员变量，
 * 覆盖加速，减速的方法
 */