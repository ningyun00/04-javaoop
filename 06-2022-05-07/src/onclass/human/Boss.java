package onclass.human;

/**
 * Description:
 * package: onclass.human <br/>
 * ClassName: Boss <br/>
 * date: 2022-05-07 下午 04:39:08 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Boss extends Human{
    /**
     * @Description: 老板类 继承人类
     * @Class: Boss
     */
    private String CarID;//车牌号
    public Boss(){}
    public Boss(String name, int age, char sex, String CarID) {
       /**
        * @description: 老板 重构构造方法
        * @method: Boss
        * @methodParameterTypes: [java.lang.String, int, char, java.lang.String]
        * @methodRetruenTypes: null
        */
        super(name, age, sex);
        this.CarID = CarID;
    }

    public String getCarID() {
        /**
         * @description: 获取老板车牌号
         * @method: getCarID
         * @methodParameterTypes: []
         * @methodRetruenTypes: java.lang.String
         */
        return CarID;
    }

    @Override
    public void travel() {
        System.out.println("老板开车出行");
    }
}
