package bookmanage.operate;

import bookmanage.book.Book;
import bookmanage.book.BookList;

import java.io.IOException;

/**
 * Description:
 * package: bookmanage.operate <br/>
 * ClassName: DisplayOperate <br/>
 * date: 2022-05-15 上午 01:58:10 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class DisplayOperate implements InterOperate {
    /**
     * @Description:
     * @Class: DisplayOperate
     */
    @Override
    public void work(BookList bookList) throws IOException {
        System.out.println("显示图书");
        try{/*异常块*/
            for (int i = 0; i < bookList.getBookNumber(); i++) {
                Book book = bookList.getBooks(i);
                if (book!=null){
                    System.out.println(book);
                }
            }
        }catch(Exception exception){/*异常类型 捕获异常*/

        }
    }
}