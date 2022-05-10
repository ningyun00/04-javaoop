package booksmanage.operation;

import booksmanage.book.Book;
import booksmanage.book.BookList;
import org.w3c.dom.ls.LSOutput;

/**
 * Description:
 * package: booksmanage.operation <br/>
 * ClassName: FindOperation <br/>
 * date: 2022-05-14 下午 05:47:05 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class FindOperation implements InterOperation{
    /**
     * @Description: 查找图书
     * @Class: FindOperation
     */
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.print("请输入你要查找的图书的书名：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                System.out.println("找到了这本书！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没找的这本书");
    }
}