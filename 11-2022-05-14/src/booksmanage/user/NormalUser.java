package booksmanage.user;

import booksmanage.operation.*;

import java.util.Scanner;

/**
 * Description:
 * package: booksmanage.user <br/>
 * ClassName: NormalUser <br/>
 * date: 2022-05-14 下午 06:50:55 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class NormalUser extends User {
    /**
     * @Description:
     * @Class: NormalUser
     */
    public NormalUser(String name) {
        super(name);
        this.interOperations=new InterOperation[]{
                new ExitOperation(),//0
                new FindOperation(),//1
                new BorrowOperation(),//2
                new ReturnOperation()//3
        };
    }
    @Override
    public int menu() {
        System.out.println("======================================================");
        System.out.println("\t\t\t\t\t欢迎" + this.name + "来到图书管理系统");
        System.out.println("\t\t\t\t\t\t1.查阅图书");
        System.out.println("\t\t\t\t\t\t2.借出图书");
        System.out.println("\t\t\t\t\t\t3.归还图书");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t0.退出系统");
        System.out.println("======================================================");
        Scanner scanner = new Scanner(System.in);
        int choice =  scanner.nextInt();
        return choice;
    }
}