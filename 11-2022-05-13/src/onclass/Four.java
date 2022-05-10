package onclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Description:
 * package: onclass <br/>
 * ClassName: Four <br/>
 * date: 2022-05-14 下午 01:38:53 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Four {
    /**
     * @Description: 上机提高题
     * @Class: Four
     */
    public static void main(String[] args) {/**主程序*/
        System.out.println("一\t二\t三\t四\t五\t六\t日");
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DATE,1);
        int d = c.get(Calendar.DAY_OF_WEEK);
        if(d ==1){
            d=7;
        }else{
            d--;
        }
        int br =0;//空格的数量
        for (int i = 1; i < d; i++) {
            System.out.print(" \t");//打印空格
            br ++;//统计空格
        }
        c.add(Calendar.MONTH, 1);
        c.add(Calendar.DATE, -1);
        int maxDay = c.get(Calendar.DATE);
        for (int i = 1; i <= maxDay; i++) {
            System.out.print(i+"\t");
            br++;
            if (br==7){
                System.out.println();
                br=0;
            }
        }
    }
}
/**
 * @topic: 提高题：输出当前月的月历
 * 该示例的功能是输出当前系统时间所在月的日历，例如当前系统时间是 2019 年 4 月 1 日，
 * 则输出 2019 年 4 月的日历
 */