package pokertwo;

import java.util.*;

/**
 * Description:
 * package: pokertwo <br/>
 * ClassName: PokerOne <br/>
 * date: 2022-05-18 下午 04:26:23 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class PokerOne {
    /**
     * @Description:
     * @Class: PokerOne
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        //盒子
        HashMap<Integer, String> hMIS = new HashMap<>();
        List<Integer> lI = new ArrayList<>();
        //牌
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String n : number) {
            for (String c : colors) {
                hMIS.put(index, c + n);
                lI.add(index);
                index++;
            }
        }
        hMIS.put(index, "大王");
        lI.add(index);
        index++;
        hMIS.put(index, "小王");
        lI.add(index);
        System.out.println(hMIS);
        System.out.println(lI);
        //洗牌
        Collections.shuffle(lI);
        System.out.println(lI);

        //发牌
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        for (int i = 0; i < lI.size(); i++) {
            if (i >= lI.size() - 3) {
                dipai.add(lI.get(i));
            } else if (i % 3 == 0) {
                player1.add(lI.get(i));
            } else if (i % 3 == 1) {
                player2.add(lI.get(i));
            } else if (i % 3 == 2) {
                player3.add(lI.get(i));
            }
        }
        lookPoker("ning", player1, hMIS);
        lookPoker("ying", player2, hMIS);
        lookPoker("ningying", player3, hMIS);
        lookPoker("底牌", dipai, hMIS);
        int pl1 = 0;
        int pl2 = 0;
        int pl3 = 0;
        int min = 0;
        System.out.println("发牌结束");
        System.out.println("请抢地主：");
        while (true) {
            System.out.print("一号玩家：");
            String ple1 = scanner.next();
            if (ple1.equals("抢"))
                pl1 += 1;
            System.out.print("二号玩家：");
            String ple2 = scanner.next();
            if (ple2.equals("抢"))
                pl2 += 1;
            System.out.print("三号玩家：");
            String ple3 = scanner.next();
            if (ple3.equals("抢"))
                pl3 += 1;
            if (pl1 == 1 && !(pl2 == 1) && !(pl3 == 1)) {//yes,no,no
                player1.addAll(dipai);
                lookPoker("ning", player1, hMIS);
                break;
            } else if (pl1 == 1 && pl2 == 1 && !(pl3 == 1)) {//yes,yes,no
                player2.addAll(dipai);
                lookPoker("ning", player1, hMIS);
                break;
            }
        }
    }

    public static void lookPoker(String name, TreeSet<Integer> treeSet, HashMap<Integer, String> hMIS) {
        System.out.print(name + ":");
        for (Integer key : treeSet) {
            String value = hMIS.get(key);
            System.out.print(value);
        }
        System.out.println();
    }
}