package attachtitle;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Description:
 * package: attachtitle <br/>
 * ClassName: PokerTwo <br/>
 * date: 2022-05-16 下午 03:19:13 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class PokerTwo {
    /**
     * @Description:
     * @Class: PokerTwo
     */
    public static void main(String[] args) {/**主程序*/
        final int N = 52;
        ArrayList pokers = new ArrayList();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> Number = new ArrayList<>();
        colors.add("♥");//0
        colors.add("♠");//1
        colors.add("♦");//2
        colors.add("♣");//3
        for (int i = 0; i < 4; i++) {
            Number.add("A");
            Number.add("2");
            Number.add("3");
            Number.add("4");
            Number.add("5");
            Number.add("6");
            Number.add("7");
            Number.add("8");
            Number.add("9");
            Number.add("10");
            Number.add("J");
            Number.add("Q");
            Number.add("K");
        }
        int r = 0;
        int h = 0;
        int f = 0;
        int m = 0;
        for (int i = 0; i < N; i++) {
            int c = (int) (Math.random()*4);
            if (r != 3) {
                r++;
                System.out.println(c);
            } else if (h != 3) {
                h++;
                System.out.println(c);
            } else if (f != 3) {
                f++;
            } else if (m != 3) {
                m++;
            }
        }
    }
}