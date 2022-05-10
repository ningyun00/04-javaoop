package onclass.one_five;

/**
 * Description:
 * package: onclass <br/>
 * ClassName: Book <br/>
 * date: 2022-05-17 上午 11:07:39 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Book {
    /**
     * @Description:
     * @Class: Book
     */
    private String name;//姓名
    private int price;//价格
    private String author;//作者

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名：'" + name + '\'' +
                ", 价格：" + price +
                ", 作者：'" + author + '\'' +
                '}';
    }
}