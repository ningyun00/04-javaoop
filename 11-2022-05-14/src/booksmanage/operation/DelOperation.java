package booksmanage.operation;

import booksmanage.book.Book;
import booksmanage.book.BookList;

/**
 * Description:
 * package: booksmanage.operation <br/>
 * ClassName: DelOperation <br/>
 * date: 2022-05-14 下午 05:46:43 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class DelOperation implements InterOperation {
    /**
     * @Description: 删除图书
     * @Class: DelOperation
     */
    @Override
    public void work(BookList bookList) {
        System.out.println("--#删除图书#--");
        System.out.print("请输入你要删除的图书的书名：");
        String name = scanner.next();
        int pos = -1;//不存在该书
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                pos = i;
                break;//有相同的书就返回i下标
            }
        }
        if (pos==-1){//当pos没有改变直接返回
            System.out.println("没有 找到要删除的书籍");
            return;
        }
        for (int i = 0; i < bookList.getBookNumber(); i++) {
            Book book = bookList.getBooks(1+1);
            bookList.setBooks(i,book);
        }
        bookList.setBookNumber(bookList.getBookNumber()-1);
        System.out.println("删除成功！");
    }
}