package underclass.one;

/**
 * Description:
 * package: underclass.one <br/>
 * ClassName: VIII <br/>
 * date: 2022-05-12 下午 08:21:54 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class VIII {
    /**
     * @Description:
     * @Class: VIII
     */
    public static void main(String[] args) {/**主程序*/
        String str = "asdfghjhgfdsasdfghbvcxsertSGHJGFDSARETRGDFDERT12345898765434567898安迪就承诺书vi妓女i就大难不死居然能把啊你v交付部队额";
        int big = 0;
        int small =0;
        int jb = 0;
        int number = 0;
        char [] str1 = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str1[i])){
                big++;
            }else if(Character.isLowerCase(str1[i])){
                small++;
            }else if(Character.isDigit(str1[i])){
                number++;
            }else{
                jb++;
            }
        }
        System.out.println(big);
        System.out.println(small);
        System.out.println(number);
        System.out.println(jb);
    }
}
/**
 * @topic:7.(挑战)统计一个字符串中包含多少数字,多少大写字母,多少小写字母,多少其它符号
 * 提示:请查看 Character
 */