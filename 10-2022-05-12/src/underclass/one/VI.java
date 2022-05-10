package underclass.one;

/**
 * Description:
 * package: underclass.one <br/>
 * ClassName: VI <br/>
 * date: 2022-05-12 下午 08:05:15 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class VI {
    /**
     * @Description:
     * @Class: VI
     */
    public static void main() {/**主程序*/
        /*long stime = System.currentTimeMillis();

        String A = "A";
        for (int i = 0; i < 10000; i++) {
            A += A;
        }
        System.out.println(A);
        Thread.sleep(1000);
        // 结束时间
        long etime = System.currentTimeMillis();
        // 计算执行时间
        System.out.printf("执行时长：%d 毫秒.", (etime - stime));*/
        String str="";
        long starTime=System.nanoTime();
        //计算循环10000的时间
        for(int i=0;i<10000;i++){
            str=str+i;
        }
        long endTime=System.nanoTime();
        long Time=endTime-starTime;
        System.out.println(Time);
    }
}
/**
 * @topic:6.分别使用 String 与 StringBuffer 类连接 10000 个字符串，比较他们连接所花费的时间
 */