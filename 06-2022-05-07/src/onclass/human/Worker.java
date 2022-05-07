package onclass.human;

import com.sun.security.jgss.GSSUtil;

/**
 * Description:
 * package: onclass.human <br/>
 * ClassName: Worker <br/>
 * date: 2022-05-07 下午 04:33:31 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Worker extends Human {
    /**
     * @Description: 工人类 继承人类
     * @Class: Worker
     */
    private String WID;//工号

    public Worker() {
    }

    public Worker(String name, int age, char sex, String WID) {
        /**
         * @description: 工人 重构构造方法
         * @method: Worker
         * @methodParameterTypes: [java.lang.String, int, char, java.lang.String]
         * @methodRetruenTypes: null
         */

        super(name, age, sex);
        this.WID = WID;
    }

    public String getWID() {
        /**
         * @description: 获取工人编号
         * @method: getWID
         * @methodParameterTypes: []
         * @methodRetruenTypes: java.lang.String
         */
        return WID;
    }

    @Override
    public void travel() {
        System.out.println("工人坐公交车出行");
    }
}
