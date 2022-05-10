package booksmanage.operation;

import booksmanage.book.BookList;

/**
 * Description:
 * package: booksmanage.operation <br/>
 * ClassName: ExitOperation <br/>
 * date: 2022-05-14 下午 05:49:06 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class ExitOperation implements InterOperation{
    /**
     * @Description: 退出图书
     * @Class: ExitOperation
     */
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);
    }
}