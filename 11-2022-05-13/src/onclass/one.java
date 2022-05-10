package onclass;

import java.util.Date;

/**
 * Description:
 * package: onclass <br/>
 * ClassName: one <br/>
 * date: 2022-05-13 下午 04:36:38 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class one {
    /**
     * @Description:    第一题
     * @Class: one
     */
    public static void main(String[] args) {/**主程序*/
        Date date = new Date(2010-1900,4-1,1);//时间对象
        Date date2 = new Date(2019-1900,3-1,11);//时间对象
        long date_date2 = date2.getTime()-date.getTime();
        System.out.println(date_date2/1000/60/60/24);
    }
}
/**
 * @topic:1、计算两个日期之间相差的天数 例如计算 2010 年 4 月 1 号和 2019 年 3 月 11 号之间相差的天数，可以使用 Date 的 getTime()
 * 方法来做
 */