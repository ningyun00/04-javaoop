package booksmanage.operation;

import booksmanage.book.BookList;

import java.util.Scanner;

/**
 * Description:
 * package: booksmanage.operation <br/>
 * ClassName: InterOperation <br/>
 * date: 2022-05-14 下午 05:45:42 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public interface InterOperation {
    /**
     * @Description: 书籍接口
     * @Class: InterOperation
     */
    void work(BookList bookList);//抽象对象书
    Scanner scanner = new Scanner(System.in);
}