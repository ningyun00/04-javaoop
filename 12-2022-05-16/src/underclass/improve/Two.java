package underclass.improve;

import java.util.ArrayList;

/**
 * Description:作业 2:使用随机数产生 26 个不重复的大写字母,计算一共随机生成了多少次才完成
 * （提示：可利用 Set 集合
 * package: underclass.improve <br/>
 * ClassName: Two <br/>
 * date: 2022-05-16 下午 02:14:40 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Two {
    /**
     * @Description:
     * @Class: Two
     */
    public static void main(String[] args) {/**主程序*/
        char A = 65;
        ArrayList<Character> E = new ArrayList<>();
        for (int i = 65; i <= 90; i++) {
            E.add((char) i);
        }//26个字母
        int J = 0;
        while (true) {
            try {/*异常块*/
                if (E.size() == 0) {
                    break;
                } else {
                    A = (char) (65 + (Math.random() * 26));//65~90
                    Character O = A;
                    E.remove(O);
                    J++;
                }
            } catch (Exception exception) {/*异常类型 捕获异常*/}
        }
        System.out.println(J);
    }
}