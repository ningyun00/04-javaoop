package booksmanage.operation;

import booksmanage.book.Book;
import booksmanage.book.BookList;

/**
 * Description:
 * package: booksmanage.operation <br/>
 * ClassName: ReturnOperation <br/>
 * date: 2022-05-14 下午 05:48:52 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class ReturnOperation implements InterOperation{
    /**
     * @Description:归还图书
     * @Class: ReturnOperation
     */
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.print("请输入你要归还的图书：");
        String name =scanner.next();
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有你要归还的书籍");
    }
}