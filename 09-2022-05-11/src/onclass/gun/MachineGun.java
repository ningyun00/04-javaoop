package onclass.gun;

/**
 * Description:
 * package: onclass.gun <br/>
 * ClassName: MachineGun <br/>
 * date: 2022-05-12 上午 11:51:31 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class MachineGun extends Gun{
    /**
     * @Description: 机枪类 
     * @Class: MachineGun
     */
    public MachineGun(String variety, int weight) {
        super(variety, weight);
    }

    @Override
    public void shoot() {
        System.out.println(super.getVariety()+"品种的机枪，重"+super.getWeight()+"公斤，一颗子弹打出去了");
    }
}
/**
 * @topic:
 */