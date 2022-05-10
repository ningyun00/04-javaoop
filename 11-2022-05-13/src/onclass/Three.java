package onclass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 * package: onclass <br/>
 * ClassName: Three <br/>
 * date: 2022-05-13 下午 05:04:54 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Three {
    /**
     * @Description: 第三题
     * @Class: Three
     */
    public static void main(String[] args) {/**主程序*/
        long a = 1334117150328L;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:m:ss");
        Date b = new Date(a);
        try {/*异常块*/
            a = b.getTime();
            String d = simpleDateFormat.format(a);
            System.out.println(d);
        } catch (Exception exception) {/*异常类型 捕获异常*/
            exception.printStackTrace();
        }
    }
}
/**
 * @topic:3.将一个长整型类型的数字，如: long a = 1334117150328，
 * 将换为日期对象，要求输出格式:2012-4-11 12:10:35
 */