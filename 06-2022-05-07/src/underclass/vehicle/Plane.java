package underclass.vehicle;

/**
 * Description:
 * package: underclass.vehicle <br/>
 * ClassName: Plane <br/>
 * date: 2022-05-07 下午 05:28:34 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Plane implements Vehicle{
    /**
     * @Description: 飞机类 接口 交通工具
     * @Class: Plane
     */
    @Override
    public double billing(double weight, double space) {
        if (space>500) {
            return weight * space * 750;
        } else {
            return -1;
        }
    }
}
