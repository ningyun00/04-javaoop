package onclass.gun;

/**
 * Description:
 * package: onclass.gun <br/>
 * ClassName: Gun <br/>
 * date: 2022-05-12 上午 11:45:42 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Gun {
    /**
     * @Description: 枪类
     * @Class: Gun
     */
    private String variety;//品种
    private int weight;//重量

    public Gun(String variety, int weight) {
        this.variety = variety;
        this.weight = weight;
    }

    public void shoot() {
        System.out.println("开枪了");
    }

    public String getVariety() {
        return variety;
    }

    public int getWeight() {
        return weight;
    }

}
/**
 * @topic:2.写一个枪类，类中有属性：品种（进口枪还是国产枪），重量。还有一个开枪的方法，输出“开枪了”。两个子类是： 手枪类：类中重写开枪的方法，输出“XX品种的手枪，重XX公斤，一颗子弹打出去了”。
 * 机枪类：类中重写开枪的方法，输出“XX品种的机枪，重XX公斤，一连串的子弹打出去了”。
 * 测试类中定义一个枪的变量，用此变量记录一个手枪的对象，调用这把枪的开枪方法，注意观察输出的结果，是调用的枪的开枪方法，还是调用的手枪的开枪方法。再生成一把机枪的对象放入到这个枪的变量中去，又调用这把枪的开枪方法，观察结果。
 */