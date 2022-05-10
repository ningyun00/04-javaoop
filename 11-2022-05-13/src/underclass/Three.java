package underclass;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Description:
 * package: underclass <br/>
 * ClassName: Three <br/>
 * date: 2022-05-14 下午 12:05:41 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Three {
    /**
     * @Description: 课后 第三题
     * @Class: Three
     */
    public static void main(String[] args) {/**主程序*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入邮箱：");
        String email = scanner.next();
        boolean bEmail = Pattern.matches("^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$", email);
        if (bEmail){
            System.out.println("ok");
        }else   {
            System.out.println("失败");
        }
    }
}
/**
 * @topic:3.Email地址验证: 建议最好不要把所有的判断都写在一 起,把判断拆分处理
 * 1:.必定包含.和@
 * 2:.和@不能位于首尾
 * 3:.可以出现多次,但@只能一次
 * 4:.不能在@之前出现
 * 5:.不能紧接@后面出现
 * 6:.不能连续出现:  hyg@com
 * 7:末尾必须是.com,.net,.cn,.org结尾
 */
/*        boolean t = false;
        if (email.contains(".") && email.contains("@")) {
            for (int i = 0; i < email.length(); i++) {
                if (i == 0) {
                    String cEmail = String.valueOf(email.charAt(i));
                    if (cEmail.contains(".") && cEmail.contains("@")) {
                        t=false;
                    }else{
                        t = true;
                    }
                } else if (i == email.length() - 1) {
                    String cEmail = String.valueOf(email.charAt(i));
                    if (cEmail.contains(".") && cEmail.contains("@")) {
                        t=false;
                    }else {
                        t = true;
                    }
                }
            }
            if (t){
                for (int i = 0; i < email.length(); i++) {
                    if (email.contains(String.valueOf(email.charAt(i)))){
                        System.out.println(i);
                    }
                    if(email.contains("@")){
                        System.out.println(i);
                    }
                }
            }
        }*/