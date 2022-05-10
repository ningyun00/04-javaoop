package onclass.one;

import java.util.Locale;

/**
 * Description:
 * package: onclass.one <br/>
 * ClassName: IIII <br/>
 * date: 2022-05-12 下午 04:49:31 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class IV {
    /**
     * @Description:
     * @Class: IIII
     */
    public static void main(String[] args) {/**主程序*/
        String s = "accpHelloWorldHH";
        char[] c=s.toCharArray();//单字符数组
        int i=0;
        StringBuffer sb = new StringBuffer();
        while(i<s.length()){//循环字符串长度
            while(i<s.length()&&c[i]>'Z') {//长度
                sb.append(c[i]);
                i++;
            }
            System.out.print(sb.toString()+" ");
            if(i<s.length()){
                sb = new StringBuffer();
                sb.append(c[i++]);
            }
        }
        System.out.println(sb.toString());
    }
}
/**
 * @topic:4.拆分一个字符串,以大写字母作为标识,将一个字符串中的单词提取出来并且保存到一个 数组里
 * 比如 accpHelloWorldHH
 * 那么就要拆为 accp,Hello,World,H,
 */