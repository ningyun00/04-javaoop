package booksmanage.operation;

import booksmanage.book.Book;
import booksmanage.book.BookList;

/**
 * Description:
 * package: booksmanage.operation <br/>
 * ClassName: AddOperation <br/>
 * date: 2022-05-14 下午 05:46:03 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class AddOperation implements InterOperation {
    /**
     * @Description:添加书
     * @Class: AddOperation
     */
    @Override
    public void work(BookList bookList) {
        System.out.println("--#添加图书#--");
        System.out.print("请输入你要添加的图书的书名：");
        String name = scanner.next();
        System.out.print("请输入你要添加的图书的作者:");
        String author = scanner.next();
        System.out.print("请输入你要添加的图书的价格：");
        int price = scanner.nextInt();
        System.out.print("请输入你要添加的图书的类型:");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        bookList.setBooks(bookList.getBookNumber(), book);
        bookList.setBookNumber(bookList.getBookNumber()+1);
        System.out.println("添加成功！");
    }
}