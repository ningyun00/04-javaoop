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
 * ClassName: Addoperate <br/>
 * date: 2022-05-14 下午 09:24:44 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Addoperate implements InterOperate {
    /**
     * @Description: 添加图书
     * @Class: Addoperate
     */
    @Override
    public void work(BookList bookList) throws IOException {
        System.out.println("--#添加图书#--");
        System.out.print("请输入你要添加的图书的书名：");
        String name = scanner.next();
        System.out.print("请输入你要添加的图书的作者:");
        String author = scanner.next();
        System.out.print("请输入你要添加的图书的价格：");
        int price = scanner.nextInt();
        System.out.print("请输入你要添加的图书的类型:");
        String type = scanner.next();
        Book book = new Book(name, author, price, type);
        bookList.setBooks(bookList.getBookNumber(), book);
        bookList.setBookNumber(bookList.getBookNumber() + 1);
        try {/*异常块*/
            FileWriter fwName = new FileWriter("NameBookFile.txt", true);
            fwName.append("\n").append(name);
            fwName.close();
            FileWriter fwAuthor = new FileWriter("AuthorBookFile.txt", true);
            fwAuthor.append("\n").append(author);
            fwAuthor.close();
            FileWriter fwPrice = new FileWriter("PriceBookFile.txt", true);
            fwPrice.append("\n").append(String.valueOf(price));
            fwPrice.close();
            FileWriter fwType = new FileWriter("TypeBookFile.txt", true);
            fwType.append("\n").append(type);
            fwType.close();
            //书状态
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
            }          //拿到所有书的状态
            FileWriter fwDisplayHied1 = new FileWriter("DisplayORHiedBookFile.txt");
            fwDisplayHied1.write("");//清空所有书的状态
            bBook[J] = "false";
            for (int i = 0; i < bBook.length; i++) {//重新给书状态
                FileWriter fwDisplayHied = new FileWriter("DisplayORHiedBookFile.txt", true);
                if (bBook[i] == null) {
                    break;
                }
                fwDisplayHied.append(bBook[i] + "\n");
                fwDisplayHied.close();
            }
        } catch (IOException exception) {/*异常类型 捕获异常*/
            exception.printStackTrace();
        }
        System.out.println("添加成功！");
    }
}