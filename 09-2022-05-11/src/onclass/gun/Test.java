package onclass.gun;

/**
 * Description:
 * package: onclass.gun <br/>
 * ClassName: Test <br/>
 * date: 2022-05-12 上午 11:52:50 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Test {
    /**
     * @Description:
     * @Class: Test
     */
    public static void main(String[] args) {/**主程序*/
        Gun pistol = new Pistol("井口",20);
        Gun machineGun = new MachineGun("井口",20);
        pistol.shoot();
        machineGun.shoot();
    }
}
/**
 * @topic:
 */