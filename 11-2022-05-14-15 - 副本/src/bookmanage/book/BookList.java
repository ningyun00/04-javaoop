package bookmanage.book;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Description:
 * package: bookmanage.book <br/>
 * ClassName: BookList <br/>
 * date: 2022-05-14 下午 08:11:12 <br/>
 *
 * @author: 寜 <br/>
 * @version: JDK 17.0.1
 */
public class BookList {
    /**
     * @Description: 好多本书
     * @Class: BookList
     */
    private Book[] books = new Book[100];//书组
    private int bookNumber;//多少本书

    public BookList() throws IOException {
        Scanner scName = new Scanner(new FileReader("NameBookFile.txt"));
        Scanner scAuthor = new Scanner(new FileReader("AuthorBookFile.txt"));
        Scanner scPrice = new Scanner(new FileReader("PriceBookFile.txt"));
        Scanner scType = new Scanner(new FileReader("TypeBookFile.txt"));
        int J = 0;
        while (scName.hasNextLine()) {
            String notName = scName.nextLine();
            String notAuthor = scAuthor.nextLine();
            String notPrice = scPrice.nextLine();
            String notType = scType.nextLine();
            if (notName != "" && notAuthor != "" && notPrice != "" && notType != "") {
                books[J] = new Book(notName, notPrice, Integer.parseInt(notPrice), notType);
                J++;
                bookNumber = J + 1;
            }
        }
       /* try{*//*异常块*//*
            for (int i = 0; i < books.length; i++) {
                if (!books[i].equals(" ")){
                    System.out.println(books[i]);
                }else{
                    break;
                }
            }
        }catch(NullPointerException exception){*//*异常类型 捕获异常*//*
        }*/
    }

    public void setBooks(int index, Book book) {//第几本书,书籍对象
        this.books[index] = book;
    }//设置第几本书存在

    public Book getBooks(int index) {//获取第几本书存在
        return this.books[index];
    }

    public void setBookNumber(int bookNumber) {//设置第几本书
        this.bookNumber = bookNumber;
    }

    public int getBookNumber() {
        return bookNumber;
    }//设置几本书
}
/*
    public String bookName() throws IOException {
        String name = "";
        try (Scanner scanner = new Scanner(new FileReader("NameBookFile.txt"))) {*//*异常块*//*
            while (scanner.hasNextLine()) {
                name = scanner.nextLine();
            }
        }
       return name;
    }

    public String bookAuthor() throws IOException {
        String author = "";
        try (Scanner scanner = new Scanner(new FileReader("AuthorBookFile.txt"))) {*//*异常块*//*
            while (scanner.hasNextLine()) {
                author = scanner.nextLine();
            }
        }
        return author;
    }

    public int bookPrice() throws IOException {
        String price = "0";
        try (Scanner scanner = new Scanner(new FileReader("PriceBookFile.txt"))) {*//*异常块*//*
            while (scanner.hasNextLine()) {
                price = scanner.nextLine();
            }
        }
        return Integer.parseInt(price);
    }

    public String bookType() throws IOException {
        String type = "0";
        try (Scanner scanner = new Scanner(new FileReader("TypeBookFile.txt"))) {*//*异常块*//*
            while (scanner.hasNextLine()) {
                type = scanner.nextLine();
            }
        }
        return type;
    }*/