package onclass.human;

/**
 * Description:
 * package: onclass.human <br/>
 * ClassName: Student <br/>
 * date: 2022-05-07 下午 04:23:57 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Student extends Human {
    /**
     * @Description: 学生类 继承人类
     * @Class: Student
     */
    private String SID;//学号

    public Student() {
    }

    public Student(String name, int age, char sex, String SID) {
        /**
         * @description: 学号 重构构造方法
         * @method: Student
         * @methodParameterTypes: [java.lang.String, int, char, java.lang.String]
         * @methodRetruenTypes: null
         */

        super(name, age, sex);
        this.SID = SID;
    }

    public String getID() {
        /**
         * @description: 获取学号
         * @method: getID
         * @methodParameterTypes: []
         * @methodRetruenTypes: java.lang.String
         */
        return SID;
    }

    @Override
    public void travel() {
        /**
         * @description: 重写抽象方法
         * @method: travel
         * @methodParameterTypes: []
         * @methodRetruenTypes: void
         */

        System.out.println("学生骑自行车出行");
    }
}
