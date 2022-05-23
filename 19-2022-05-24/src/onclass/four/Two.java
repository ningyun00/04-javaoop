package onclass.four;

/**
 * Description:
 * ClassName: Two <br/>
 * date: 2022-05-24 下午 02:22:17 <br/>
 * author: 寜 <br/>
 */
public class Two {
    public static void main(String[] args) {
        new Thread(new TalkSend(3333,"localhost",6666)).start();
        new Thread(new TalkReceive(8888,"佐伊")).start();
    }
}