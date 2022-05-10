package bookmanage.operate;

import bookmanage.book.BookList;

import java.io.IOException;
import java.util.Scanner;

/**
 * Description:
 * package: bookmanage.operate <br/>
 * ClassName: interoperate <br/>
 * date: 2022-05-14 下午 09:14:23 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public interface InterOperate {
    /**
     * @Description: 接口 抽象书类
     * @Interface: interoperate
     */
    void work(BookList bookList) throws IOException;//抽象对象书
    Scanner scanner = new Scanner(System.in);
}
