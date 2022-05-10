package bookmanage.operate;

import bookmanage.book.Book;
import bookmanage.book.BookList;

import java.io.IOException;

/**
 * Description:
 * package: bookmanage.operate <br/>
 * ClassName: DelOperate <br/>
 * date: 2022-05-15 上午 01:45:51 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class DelOperate implements InterOperate {
    /**
     * @Description: 删除图书
     * @Class: DelOperate
     */
    @Override
    public void work(BookList bookList) throws IOException {
        System.out.println("--#删除图书#--");
        System.out.print("请输入你要删除的图书的书名：");
        String name = scanner.next();
        int pos = -1;//不存在该书
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getBookName().equals(name)) {
                pos = i;
                break;
            }
        }
        if (pos==-1){
            System.out.println("没有找到该书");
            return;
        }
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(i+1);
            bookList.setBooks(i, book);
        }
        bookList.setBookNumber(bookList.getBookNumber()-1);
        System.out.println("删除成功");
    }
}