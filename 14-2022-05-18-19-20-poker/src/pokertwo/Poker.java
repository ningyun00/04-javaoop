package pokertwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Description:
 * package: poker <br/>
 * ClassName: Poker <br/>
 * date: 2022-05-18 下午 03:11:35 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Poker {
    /**
     * @Description:
     * @Class: Poker
     */
    public static void lookPoker(List<String> ls) {

    }

    public static void main(String[] args) {/**主程序*/
        //创建扑克牌盒子
        List<String> poker = new ArrayList<>();
        //创建玩家
        List<String> one = new ArrayList<>();//1号
        List<String> two = new ArrayList<>();//2号
        List<String> three = new ArrayList<>();//3号
        //创建扑克牌
        poker.add("大王");
        poker.add("小王");
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String c : colors) {
            for (String n : number) {
                poker.add(c + n);
            }
        }

        //洗牌
        Collections.shuffle(poker);
        for (int i = 0; i < poker.size() - 3; i++) {
            one.add(poker.get(i));
            i += 1;
            two.add(poker.get(i));
            i += 1;
            three.add(poker.get(i));
        }
        for (String o : one) {
            poker.remove(o);
        }
        for (String t : two) {
            poker.remove(t);
        }
        for (String th : three) {
            poker.remove(th);
        }
    }
}