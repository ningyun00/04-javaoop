package underclass.improve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Description:提高题：
 * 作业 1：定义一个 ArrayList 集合，然后将集合中的元素进行排序（使用冒泡排序）
 * 作业 2:使用随机数产生 26 个不重复的大写字母,计算一共随机生成了多少次才完成
 * （提示：可利用 Set 集合
 * package: underclass.improve <br/>
 * ClassName: One <br/>
 * date: 2022-05-16 上午 11:50:50 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class One {
    /**
     * @Description:
     * @Class: One
     */
    public static void main(String[] args) {/**主程序*/
        ArrayList<Integer> intAList = new ArrayList<>();
     /*   intAList.add(2);
        intAList.add(6);
        intAList.add(3);
        intAList.add(78);
        intAList.add(9);
        intAList.add(5);
        intAList.add(8);
        intAList.add(45);*/
        Random random = new Random();
        while (true) {
            intAList.add(random.nextInt(100) + 1);
            if (intAList.size() == 200) {
                break;
            }
        }
        for (int i = 0; i < intAList.size()-1; i++) {
            for (int j = 1; j < intAList.size() - i; j++) {
                if (intAList.get(j - 1).compareTo(intAList.get(j)) > 0) {
                    Integer K = intAList.get(j - 1);
                    intAList.set(j-1, intAList.get(j));
                    intAList.set(j, K);
                }
            }
        }
/*        int[] intArr = new int[intAList.size()];
        for (int i = 0; i < intAList.size(); i++) {
            intArr[i] = intAList.get(i);
        }
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr.length - 1 - i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int K = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = K;
                }
            }
        }*/
/*        for (Integer integer : intArr) {
            System.out.println(integer);
        }*/
        for (Integer integer : intAList) {
            System.out.println(integer);
        }
    }
}