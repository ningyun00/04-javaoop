package bookmanage.user;

import bookmanage.book.BookList;
import bookmanage.operate.InterOperate;

import java.io.IOException;

/**
 * Description:
 * package: bookmanage.user <br/>
 * ClassName: User <br/>
 * date: 2022-05-15 下午 12:39:09 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public abstract class User {
    /**
     * @Description: 抽象用户
     * @Class: User
     */
    protected String name;
    protected InterOperate[] Interoperate;//接口对书进行操作数组
    public User(String name){
        this.name = name;
    }
    abstract public int main();//抽象方法
    public void doOperate(int index, BookList bookList) throws IOException {
        this.Interoperate[index].work(bookList);
    }
}