package bookmanage.user;

import bookmanage.book.BookList;


import java.io.*;
import java.util.Scanner;

/**
 * Description:
 * package: bookmanage.user <br/>
 * ClassName: Main <br/>
 * date: 2022-05-14 下午 08:12:59 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Main {
    /**
     * @Description:
     * @Class: Main
     */
    public static User login() {
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("当前权限为普通用户");
        return new RegularUsers(name);
    }

    public static void main(String[] args) throws IOException, InterruptedException {/**主程序*/
        try{/*异常块*/
            BookList bookList = new BookList();
            User user = login();
            do {
                int index = user.main();
                user.doOperate(index, bookList);
            } while (true);
        }catch(Exception exception){/*异常类型 捕获异常*/
            System.out.println("系统异常");
        }
    }
}