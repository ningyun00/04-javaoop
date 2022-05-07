package onclass.two;

/**
 * Description:
 * package: onclass.two <br/>
 * ClassName: TestRiver <br/>
 * date: 2022-05-09 下午 04:26:43 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class TestRiver {
    /**
     * @Description:
     * @Class: TestRiver
     */
    public static void main(String[] args) {/**主程序*/
        River river = new YellowRiver(10, 5);
        River river1 = new YangziRiver(10,20);
        try{/*异常块*/
            river1.flow();
        }catch(Exception exception){/*异常类型 捕获异常*/
            exception.printStackTrace();
        }
        try{/*异常块*/
            river.flow();
        }catch(Exception exception){/*异常类型 捕获异常*/
            exception.printStackTrace();
        }
    }
}
/**
 * @topic:
 */