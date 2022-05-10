package bookmanage.operate;

import bookmanage.book.Book;
import bookmanage.book.BookList;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Description:
 * package: bookmanage.operate <br/>
 * ClassName: ReturnOperate <br/>
 * date: 2022-05-15 下午 12:27:06 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class ReturnOperate implements InterOperate {
    /**
     * @Description:归还图书
     * @Class: ReturnOperate
     */
    @Override
    public void work(BookList bookList) throws IOException {
        try {/*异常块*/
            System.out.println("归还图书");
            System.out.print("请输入你要归还的图书：");
            String name = scanner.next();
            String[] bBook = new String[100];
            Scanner scDisplayHied = new Scanner(new FileReader("DisplayORHiedBookFile.txt"));
            int J = 0;
            while (scDisplayHied.hasNextLine()) {
                String notNull = scDisplayHied.nextLine();
                bBook[J] = notNull;
                if (bBook[J] == null) {
                    break;
                }
                J++;
            }
            for (int i = 0; i < bookList.getBookNumber(); i++) {
                Book book = bookList.getBooks(i);
                if (book.getBookName().equals(name)) {
                    book.setBookDisplayORHied(false);
                    bBook[i] = "false";
                    FileWriter fwDisplayHied1 = new FileWriter("DisplayORHiedBookFile.txt");
                    fwDisplayHied1.write("");
                    for (int j = 0; j < bBook.length; j++) {
                        if (bBook[j] == null) {
                            return;
                        }
                        FileWriter fwDisplayHied = new FileWriter("DisplayORHiedBookFile.txt", true);
                        fwDisplayHied.append(bBook[j] + "\n");
                        fwDisplayHied.close();
                    }
                    System.out.println("成功归还");
                }
            }
        } catch (NullPointerException exception) {/*异常类型 捕获异常*/
            System.out.println("空异常");
        } catch (Exception e) {
            System.out.println("系统异常");
        }
        System.out.println("没有你要归还的书籍");
    }
}