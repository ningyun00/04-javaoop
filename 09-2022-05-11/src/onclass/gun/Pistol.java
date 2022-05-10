package onclass.gun;

/**
 * Description:
 * package: onclass.gun <br/>
 * ClassName: Pistol <br/>
 * date: 2022-05-12 上午 11:48:22 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Pistol extends Gun{
    /**
     * @Description: 手枪类 继承 枪类
     * @Class: Pistol
     */
    public Pistol(String variety, int weight) {
        super(variety, weight);
    }
    @Override
    public void shoot() {
        System.out.println(super.getVariety()+"品种的手枪，重"+super.getWeight()+"公斤，一颗子弹打出去了");
    }
}
/**
 * @topic:
 */