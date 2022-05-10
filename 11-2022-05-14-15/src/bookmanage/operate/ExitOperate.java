package bookmanage.operate;

import bookmanage.book.BookList;

import java.io.IOException;

/**
 * Description:
 * package: bookmanage.operate <br/>
 * ClassName: ExitOperate <br/>
 * date: 2022-05-15 上午 02:21:46 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class ExitOperate implements InterOperate {
    /**
     * @Description: 退出系统
     * @Class: ExitOperate
     */
    @Override
    public void work(BookList bookList) throws IOException {
        System.out.println("退出系统");
        System.exit(0);
    }
}