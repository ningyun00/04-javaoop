package attachtitle;

/**
 * Description:
 * AAAA,2222,3333,4444,5555,6666,7777,8888,9999,10101010,JJJJ,QQQQ,KKKK,DIB,SIML;
 * package: attachtitle <br/>
 * ClassName: Poker <br/>
 * date: 2022-05-16 下午 02:47:43 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class PokerOne {
    /**
     * @Description:
     * @Class: Poker
     */
    public static void main(String[] args) {/**主程序*/
        final int Number = 52;//出去大王小王
        int cards[] = new int[Number];
        String designAndColor[] = {"红桃", "黑桃", "梅花", "方块"};
        String pokerNumber[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < cards.length; i++) {
            cards[i] += i;
        }
        for (int i = 0; i < cards.length; i++) {
            cards[i] = (int) ((Math.random() * 52));
        }
        for (int i = 0; i < cards.length; i++) {
            System.out.printf("%s%s ", designAndColor[cards[i] / 13], pokerNumber[cards[i] % 13]);
            if ((i+1)%13==0){
                System.out.println();
            }
        }
    }
}