package onclass.one_five;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:练习 1：
 * 城市 区号
 * 长沙 0731
 * 北京 010
 * 常德 0736
 * 1. 创建 Map<String,String>对象存放上述数据 城市做为键,区号作为值
 * 2. 输入城市名，从 Map<String,String>中查询并输出对应的区号
 * 3. 使用两种方式遍历集合中的数据，
 * a.先得到 key 集合，然后再通过 key 遍历 value
 * b.直接得到 value 集合
 * package: onclass <br/>
 * ClassName: OneK <br/>
 * date: 2022-05-17 上午 10:58:44 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class OneK {
    /**
     * @Description:
     * @Class: OneK
     */
    public static void main(String[] args) {/**主程序*/
        Map<String, String> map = new HashMap<String, String>();
        map.put("长沙","0731");
        map.put("北京","010");
        map.put("常德","0736");
        System.out.println(map.get("北京"));
        for(Object o:map.keySet()){
            System.out.println(o+"  "+map.get(o));
        }
        for (Object o : map.values()) {
            System.out.println(o);
        }
    }
}