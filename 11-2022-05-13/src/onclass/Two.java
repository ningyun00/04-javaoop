package onclass;

import java.awt.print.PageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 * package: onclass <br/>
 * ClassName: Two <br/>
 * date: 2022-05-13 下午 04:46:15 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Two {
    /**
     * @Description: 第二题
     * @Class: Two
     */
    public static void main(String[] args) {/**主程序*/
        String str1 = "2001/01/01 16:02:02";
        String str2 = "2010-01-01 16 时";
        String str3 = "2010 年 01 月 01 日 16 时 02 分 02 秒";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:m:ss");
        try{/*异常块*/
            Date date1 = simpleDateFormat.parse(str1);
            System.out.println(date1);
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
            Date date2 = simpleDateFormat.parse(str2);
            System.out.println(date2);
            simpleDateFormat = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 m 分 ss 秒");
            Date date3 = simpleDateFormat.parse(str3);
            System.out.println(date3);
        }catch(ParseException exception){/*异常类型 捕获异常*/
            exception.printStackTrace();
        }
    }
}
/**
 * @topic:2. 将以下三种格式的字符串日期转换为日期对象，
 * 如:"20010/01/01 16:02:02"
 * "2010-01-01 16 时"
 * "2010 年 01 月 01 日 16 时 02 分 02 秒
 */