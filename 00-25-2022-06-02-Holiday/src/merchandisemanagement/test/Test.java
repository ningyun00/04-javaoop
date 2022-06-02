package merchandisemanagement.test;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            main();
        }
    }
    public static  void main(){
        System.out.println("========输入\"exit\"退出：========");
        System.out.println("\t\t\t1.登录");
        System.out.println("\t\t\t2.注册");
        System.out.println("================================");
        String str = scanner.next();
        if (str.equals("1")) {
            int lo = login();
            if (lo == 1) {
                while (true) {
                    AdmLogin.choose();

                }
            } else {
                System.out.println("登陆失败");
            }
        }
        if (str.equals("2")) {
            if (enroll() == 1) {
                System.out.println("注册成功");
            } else {
                System.out.println("注册失败");
            }
        }
        if (str.equals("exit")) {
            close();
        }
    }
    private static void close() {
        System.out.println("退出中....");
        System.exit(0);
    }

    private static int login() {
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        return AdmLogin.select(name, password);
    }

    private static int enroll() {
        return 0;
    }
}
