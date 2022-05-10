package booksmanage.operation;

import booksmanage.book.Book;
import booksmanage.book.BookList;

/**
 * Description:
 * package: booksmanage.operation <br/>
 * ClassName: BorrowOperation <br/>
 * date: 2022-05-14 下午 05:48:18 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class BorrowOperation implements InterOperation{
    /**
     * @Description: 显示 借出 图书
     * @Class: BorrowOperation
     */
    @Override
    public void work(BookList bookList) {
        System.out.println("借出图书");
        System.out.print("请输入你要借出的书名：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                book.setBorrowed(true);
                System.out.println("成功借出");
                return;
            }
        }
        System.out.println("你要找的图书不存在！");
    }
}