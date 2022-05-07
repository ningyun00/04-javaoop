package onclass.two;

/**
 * Description:
 * package: onclass.two <br/>
 * ClassName: River <br/>
 * date: 2022-05-09 下午 04:10:20 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public abstract class River {
    /**
     * @Description: 河类 抽象类
     * @Class: River
     */
    private int alertWaterLevels;//警戒水位
    private int frontWaterLevel;//前水位

    public abstract void flow() throws Exception;
    public River(int alertWaterLevels, int frontWaterLevel) {
        /**
         * @description: alertWaterLevels警戒水位 frontWaterLevel前水位
         * @method: River
         * @methodParameterTypes: [int, int]
         * @methodRetruenTypes:
         */
        this.alertWaterLevels = alertWaterLevels;
        this.frontWaterLevel = frontWaterLevel;
    }

    public int getAlertWaterLevels() {
        return alertWaterLevels;
    }

    public int getFrontWaterLevel() {
        return frontWaterLevel;
    }
}
/**
 * @topic: 2．用程序描述黄河和长江，假设黄河水位高出警戒水位 5M 时决堤，长江水位高出警戒水
 * 位 9M 时决堤。
 * 提示：
 * (1) 定义江河类 River(抽象类),定义抽象方法 flow()，定义属性：警戒水位 int warning，当
 * 前水位 int waterline，并将二个属性封装。（水位，水面离河度的高度）
 * (2) 建立黄河类(YellowRiver)与长江类(LongRiver)，都继承江河类。
 * (3) 二个类都重写 flow()方法，水位正常时:黄河输出“黄河在流：黄河之水天上来”，长江
 * 输出“长江在流：孤帆远影碧空尽，惟见长江天际流” 决堤时抛出异常，异常信息是：“黄
 * 河决堤了”或“长江决堤了”
 * 黄河的决堤: this.getWaterLine() - this.getWarning() > 5
 * 长江的决堤:this.getWaterLine() - this.getWarning() > 9
 */