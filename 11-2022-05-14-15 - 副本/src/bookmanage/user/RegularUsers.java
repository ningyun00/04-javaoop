package bookmanage.user;

import bookmanage.operate.*;

import java.util.Scanner;

/**
 * Description:
 * package: bookmanage.user <br/>
 * ClassName: RegularUsers <br/>
 * date: 2022-05-15 下午 12:46:30 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class RegularUsers extends User {
    /**
     * @Description: 普通用户
     * @Class: RegularUsers
     */
    public RegularUsers(String name) {
        super(name);
        this.Interoperate = new InterOperate[]{
                new ExitOperate(), //退出系统
                new FindOperate(),//查找图书
                new DisplayOperate(),//显示图书
                new Addoperate(),//添加图书
                new BorrowOperate(),//借出图书
                new ReturnOperate()//归还图书
        };
    }

    @Override
    public int main() {
        System.out.println("======================================================");
        System.out.println("\t\t\t\t\t欢迎" + this.name + "来到图书管理系统");
        System.out.println("\t\t\t\t\t\t1.查阅图书");
        System.out.println("\t\t\t\t\t\t2.显示图书");
        System.out.println("\t\t\t\t\t\t3.添加图书");
        System.out.println("\t\t\t\t\t\t4.借出图书");
        System.out.println("\t\t\t\t\t\t5.归还图书");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t0.退出系统");
        System.out.println("======================================================");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        return index;
    }
}