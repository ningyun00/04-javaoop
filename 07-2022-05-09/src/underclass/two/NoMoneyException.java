package underclass.two;

/**
 * Description:
 * package: underclass.two <br/>
 * ClassName: NoMoneyException <br/>
 * date: 2022-05-09 下午 04:59:45 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class NoMoneyException extends RuntimeException{
    /**
     * @Description: 自定义异常
     * @Class: NoMoneyException
     */
    public NoMoneyException(String noMoneyException) {
        super(noMoneyException);
    }
}
/**
 * @topic:
 */