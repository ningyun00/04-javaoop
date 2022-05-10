package underclass.one;

import java.sql.Time;

/**
 * Description:
 * package: underclass.one <br/>
 * ClassName: VII <br/>
 * date: 2022-05-12 下午 08:15:02 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class VII {
    /**
     * @Description:
     * @Class: VII
     */
    public static void main() {/**主程序*/
        StringBuffer bulider = new StringBuffer("");
        long starTime = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            bulider.append(j);
        }
        long endTime = System.nanoTime();
        long Time = endTime - starTime;
        System.out.println(Time);
    }
}
/**
 * @topic:
 */