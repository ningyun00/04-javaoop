package onclass.one;

/**
 * Description:
 * package: onclass.one <br/>
 * ClassName: ExceptionTest <br/>
 * date: 2022-05-09 下午 03:57:07 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class ExceptionTest {
    /**
     * @Description: 异常
     * @Class: ExceptionTest
     */
    public void go() throws Exception{
        System.out.println("我抛个异常玩玩啊");
        throw new Exception("我抛个异常玩玩啊");
    }
    public void main(){
        try{/*异常块*/
            go();
        }catch(Exception exception){/*异常类型 捕获异常*/
            exception.printStackTrace();
        }finally{/*结束异常执行*/

        }
    }
}
/**
 * @topic: 1.编写类 ExceptionTest：
 * 定义两个方法：go()和 main()
 * 在 go 方法中声明要抛出异常，在该方法体内，抛出一个 Exception 对象,异常信息为
 * "我抛个异常玩玩啊" 在 main()方法中，调用 go 方法，使用 try/catch 捕获 go
 */