package booksmanage.book;

/**
 * Description: 图书管理系统
 * package: booksmanage.book <br/>
 * ClassName: Book <br/>
 * date: 2022-05-14 下午 03:58:25 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Book {
    /**
     * @Description: 一本图书
     * @Class: Book
     */
    private String name;//书名
    private String author;//作者
    private int price;//价格
    private String type;//书的类型
    private boolean isBorrowed;//是否显示图书

    /**
     * 构造方法
     */
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名='" + name + '\'' +
                ", 作者='" + author + '\'' +
                ", 价格=" + price +
                ", 类型='" + type + '\'' +
                ", "+((isBorrowed)?"被借出":"未被借出")+
                '}';
    }
}