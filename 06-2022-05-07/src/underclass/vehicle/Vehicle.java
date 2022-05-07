package underclass.vehicle;

/**
 * Description:
 * package: underclass.vehicle <br/>
 * ClassName: Vehicle <br/>
 * date: 2022-05-07 下午 05:14:39 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public interface Vehicle {
    /**
     * @Description: 交通工具 接口
     * @Interface: Vehicle
     */
    int plane = 1;//飞机
    int train = 2;//火车
    int car = 3;//汽车

    double billing(double weight, double space);// t,km
}
/*需求背景：一个运输公司从网上得到订单，订单上标会有货物重量和运输里程，该公司可以
使用 3 种运输工具：卡车、火车、飞机。
要求：
1. 编写运输接口，为接口添加 3 个常量，表示运输工具:
提示：
飞机常量：public static final int TRUCK = 1; //火车：TRAIN = 2 卡车： CAR
= 3
2.在接口中声明一个计算运费的方法，参数是重量和里程，返回运费:
提示：
运输方法：double cost(double weight, double space); //weight 是重量（单
位：t）,space 是距离(单位：km)
3.卡车、火车、飞机分别实现运输接口，重写计算运费发法，计算规则如下：
（1）.卡车：运费 ＝ 重量 ＊ 距离 ＊ 120，当距离大于 1000（KM）或重量大于 60
（t）的时候拒载，返回-1。
（2）.火车：当距离在 900（KM）内（包含）时，运费=重量 ＊ 距离 ＊ 250，大于 900
（KM）运费＝ 重量 ＊ 距离 ＊ 300
（3）.飞机：当距离大于 500（KM）时，运费＝重量＊距离＊750，否则拒载，返回-1。
4. 编写测试类，测试运输接口和实现类
*/
