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
 * ClassName: BorrowOperate <br/>
 * date: 2022-05-14 下午 11:43:33 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class BorrowOperate implements InterOperate {
    /**
     * @Description:借出图书
     * @Class: BorrowOperate
     */
    @Override
    public void work(BookList bookList) throws IOException {
        System.out.println("借出图书");
        System.out.println("请输入你要借的图书的书名:");
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
            try {/*异常块*/
                Book book = bookList.getBooks(i);
                if (book.getBookName().equals(name)) {
                    book.setBookDisplayORHied(true);
                    bBook[i] = "true";
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
                    System.out.println("成功借出");
                }
            } catch (NullPointerException exception) {/*异常类型 捕获异常*/
                System.out.println("空异常");
            } catch (Exception e) {
                System.out.println("系统异常");
            }
        }
        System.out.println("你要的图书不存在");
    }
}