package underclass.vehicle;

/**
 * Description:
 * package: underclass.vehicle <br/>
 * ClassName: Train <br/>
 * date: 2022-05-07 下午 05:24:34 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Train implements Vehicle{
    /**
     * @Description: 火车类 接口 交通工具
     * @Class: Train
     */
    @Override
    public double billing(double weight, double space) {
        /**
         * @description: 火车 计费方式
         * @method: billing
         * @methodParameterTypes: [double, double]
         * @methodRetruenTypes: double
         */
        if (space<=900){
            return weight*space*250;
        }else if (space>900){
            return  weight*space*300;
        }else{
            return -1;
        }
    }
}
