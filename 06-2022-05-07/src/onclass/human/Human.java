package onclass.human;

/**
 * Description:
 * package: onclass.human <br/>
 * ClassName: human <br/>
 * date: 2022-05-07 下午 04:08:53 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public abstract class Human {
    /**
     * @Description: 人类 抽象类
     * @Class: human
     */
    /*1.（抽象）写一个人类，类中有属性：姓名，年龄，性别，一个构造方法为属性初始化，一
个出行的方法，但是这个方法描绘不清楚（因为每个人的出行方式是不一样），所以抽象此
方法
再写一个学生类继承人类型，类中有属性：学生的学号，一个构造方法给属性赋值（父类的
属性通过 super()赋值），重写父类的出行方法：描绘“学生骑自行车出行”
再写一个工人类继承人类型，类中有属性：工人的工作证号，一个构造方法给属性赋值（父
类的属性通过 super()赋值），重写父类的出行方法：描绘“工人坐公交车出行”
再写一个老板类继承人类型，类中有属性：老板的私家车号，一个构造方法给属性赋值（父
类的属性通过 super()赋值），重写父类的出行方法：描绘“老板开车出行”
写一个测试类，采用多态实现调用三种不同对象的出行方法。*/
    private String name;
    private int age;
    private char sex;

    public Human(){}
    public Human(String name,int age,char sex){
       /**
        * @description: 构造方法
        * @method: Human
        * @methodParameterTypes: [java.lang.String, int, char]
        * @methodRetruenTypes: null
        */
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public abstract void travel();//出行 抽象方法
}
