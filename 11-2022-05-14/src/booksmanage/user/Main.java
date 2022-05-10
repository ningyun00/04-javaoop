package booksmanage.user;

import booksmanage.book.BookList;

import java.util.Scanner;

/**
 * Description:
 * package: booksmanage.user <br/>
 * ClassName: Main <br/>
 * date: 2022-05-14 下午 05:45:18 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Main {
    /**
     * @Description:
     * @Class: Main
     */
    public static User login(){
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请选择身份：\n1.管理员\n2.普通用户");
        int choice = scanner.nextInt();
        if (choice==1){
            return new Admin(name);
        }else{
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {/**主程序*/
        BookList bookList = new BookList();
        User user = login();
        while (true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
}