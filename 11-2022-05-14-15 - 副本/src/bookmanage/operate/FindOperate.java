package bookmanage.operate;

import bookmanage.book.Book;
import bookmanage.book.BookList;

import java.io.IOException;

/**
 * Description:
 * package: bookmanage.operate <br/>
 * ClassName: FindOperate <br/>
 * date: 2022-05-15 下午 12:21:08 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class FindOperate implements InterOperate {
    /**
     * @Description:查找图书
     * @Class: FindOperate
     */
    @Override
    public void work(BookList bookList) throws IOException {
        System.out.println("查找图书");
        System.out.print("请输入你要查找的图书的书名：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getBookName().equals(name)){
                System.out.println("找到了这本书！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未找到你要的书籍");
    }
}