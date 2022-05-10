package onclass.one_five;

import java.util.ArrayList;

/**
 * Description:练习 3.（请自己判断应该使用哪种集合）
 * 随机生成 26 个大写字母,要求获得一共随机生存了多少次才产生不重复的 26 个大写字母, 输出的时候要求排序输出
 * package: onclass <br/>
 * ClassName: Three <br/>
 * date: 2022-05-17 上午 11:20:50 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Three {
    /**
     * @Description:
     * @Class: Three
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