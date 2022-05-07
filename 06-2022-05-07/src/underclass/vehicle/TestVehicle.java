package underclass.vehicle;

/**
 * Description:
 * package: underclass.vehicle <br/>
 * ClassName: TestVehicle <br/>
 * date: 2022-05-07 下午 06:10:45 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class TestVehicle {
    /**
     * @Description: 测试类
     * @Class: TestVehicle
     */
    public static void main(String[] args) {
        /**主程序*/
        Vehicle vehicle = new Car();
        System.out.println(vehicle.billing(10, 200));
        vehicle = new Train();
        System.out.println(vehicle.billing(10, 20));
        vehicle = new Plane();
        System.out.println(vehicle.billing(100, 2000));
    }
}
