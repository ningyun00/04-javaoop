package underclass.vehicle;

/**
 * Description:
 * package: underclass.vehicle <br/>
 * ClassName: Car <br/>
 * date: 2022-05-07 下午 05:20:31 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Car implements Vehicle{
    /**
     * @Description: 卡车类 接口 交通工具
     * @Class: Car
     */
    @Override
    public double billing(double weight, double space) {
        /**
         * @description: 汽车 计费方式
         * @method: billing
         * @methodParameterTypes: [double, double]
         * @methodRetruenTypes: double
         */

        if (space < 1000 && weight < 60) {
            return weight * space * 120;
        } else {
            return -1;
        }
    }
}
