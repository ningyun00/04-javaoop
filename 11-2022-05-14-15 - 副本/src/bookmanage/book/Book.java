package bookmanage.book;

/**
 * Description:
 * package: bookmanage.book <br/>
 * ClassName: Book <br/>
 * date: 2022-05-14 下午 07:59:59 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class Book {
    /**
     * @Description:一本书操作
     * @Class: Book
     */
    private String bookName;//书名
    private String bookAuthor;//书作者
    private double bookPrice;//书价格
    private String bookType;//书类型
    private boolean bookDisplayORHied;//书是否显示或隐藏

    public Book(String bookName, String bookAuthor, double bookPrice, String bookType) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookType = bookType;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookDisplayORHied(boolean bookDisplayORHied) {
        this.bookDisplayORHied = bookDisplayORHied;
    }

    public boolean isBookDisplayORHied() {
        return bookDisplayORHied;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名='" + bookName + '\'' +
                ", 作者='" + bookAuthor + '\'' +
                ", 价格=" + bookPrice +
                ", 类型='" + bookType + '\'' +
                ", " + ((bookDisplayORHied) ? "被借出" : "未被借出") +
                '}';
    }
}