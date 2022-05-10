package underclass.one;

/**
 * Description:
 * package: underclass.one <br/>
 * ClassName: V <br/>
 * date: 2022-05-12 下午 07:58:16 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class V {
    /**
     * @Description:
     * @Class: V
     */
    public static void main(String[] args) {/**主程序*/
        String A = "123";
        int B = Integer.parseInt(A);
        System.out.println(getType(B));

    }
    public static String getType(Object o) {
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}
/**
 * @topic:5.定义一个字符串 String,输入"123",将转换为 int 类型
 */