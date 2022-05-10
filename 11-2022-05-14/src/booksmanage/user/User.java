package booksmanage.user;

import booksmanage.book.BookList;
import booksmanage.operation.InterOperation;

/**
 * Description:
 * package: booksmanage.user <br/>
 * ClassName: User <br/>
 * date: 2022-05-14 下午 06:33:18 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public abstract class User {
    /**
     * @Description: 抽象用户类
     * @Class: User
     */
    protected String name;//用户名
    protected InterOperation[] interOperations;//接口--对书操作
    public User(String name) {
        this.name = name;
    }
    abstract public int menu();//抽象方法
    public  void doOperation(int choice, BookList bookList){
        this.interOperations[choice].work(bookList);
    }
}