package booksmanage.user;

import booksmanage.operation.*;

import java.util.Scanner;

/**
 * Description:
 * package: booksmanage.user <br/>
 * ClassName: Admin <br/>
 * date: 2022-05-14 下午 06:37:39 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Admin extends User {
    /**
     * @Description: 管理员类
     * @Class: Admin
     */
    Scanner scanner = new Scanner(System.in);
    public Admin(String name) {
        super(name);
        this.interOperations = new InterOperation[]{
                new ExitOperation(), //0
                new FindOperation(), //1
                new AddOperation(), //2
                new DelOperation(), //3
                new DisplayOperation()//4
        };
    }

    @Override
    public int menu() {
        System.out.println("======================================================");
        System.out.println("\t\t\t\t欢迎" + this.name + "来到图书管理系统");
        System.out.println("\t\t\t\t\t1.查阅图书");
        System.out.println("\t\t\t\t\t2.添加图书");
        System.out.println("\t\t\t\t\t3.删除图书");
        System.out.println("\t\t\t\t\t4.显示图书");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t0.退出系统");
        System.out.println("======================================================");
        int choice =  scanner.nextInt();
        return choice;
    }
}