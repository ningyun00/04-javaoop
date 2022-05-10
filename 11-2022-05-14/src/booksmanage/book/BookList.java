package booksmanage.book;

import java.util.Arrays;

/**
 * Description: 图书管理系统
 * package: booksmanage.book <br/>
 * ClassName: BookList <br/>
 * date: 2022-05-14 下午 05:44:26 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class BookList {
    /**
     * @Description: N本书类
     * @Class: BookList
     */
    private Book[] books = new Book[100];//存放多少本书
    private int bookNumber;//书籍数量

    public BookList() {//放三本书在图书管理系统里
        books[0] = new Book("NET", "寜", 200, "专业知识");
        books[1] = new Book("javaES", "小寜", 2000, "技术知识");
        books[2] = new Book("数据结构", "小宁寜", 20000, "兴趣知识");
        bookNumber = 3;
    }

    public void setBooks(int pos, Book book) {//第几本书,书籍对象
        this.books[pos] = book;
    }

    public Book getBooks(int pos) {//获取第几本书
        return this.books[pos];
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public int getBookNumber() {
        return bookNumber;
    }
}