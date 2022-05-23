package onclass.four;

/**
 * Description:
 * ClassName: One <br/>
 * date: 2022-05-24 下午 02:22:11 <br/>
 * author: 寜 <br/>
 */
public class One {
    public static void main(String[] args) {
        new Thread(new TalkSend(2222,"localhost",8888)).start();
        new Thread(new TalkReceive(6666,"伊泽瑞尔")).start();
    }
}