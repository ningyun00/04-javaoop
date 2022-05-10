package onclass.one;

/**
 * Description:
 * package: onclass.one <br/>
 * ClassName: Human <br/>
 * date: 2022-05-10 下午 03:40:33 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Human {
    /**
     * @Description: 人类
     * @Class: Human
     */
    private String name;//姓名

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
/**
 * @topic: 1、 定义一个类，该类有一个私有成员属性 name，通过构造方法将其进行赋值，
 * 并提供该成员的 getXXX()和 setXXX()方法
 */