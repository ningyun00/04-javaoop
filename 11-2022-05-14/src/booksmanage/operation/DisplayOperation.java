package booksmanage.operation;

import booksmanage.book.Book;
import booksmanage.book.BookList;

/**
 * Description:
 * package: booksmanage.operation <br/>
 * ClassName: DisplayOperation <br/>
 * date: 2022-05-14 下午 05:47:26 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class DisplayOperation implements InterOperation{
    /**
     * @Description:显示图书
     * @Class: DisplayOperation
     */
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}