package library.system;

import jakarta.persistence.Entity;
//import javax.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Book
{
    private String bookTitle;
    private String bookAuthor;
    private String bookFormat;
    private String bookGenre;
    private String bookOverview;
    private String bookISBN;
    private int bookQty;
    private int bookID;

    @Id
    public  int getBookID()
    {
        return  bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookISBN()
    {
        return bookISBN;
    }

    public void setBookISBN(String newISBN)
    {
        bookISBN = newISBN;
    }
    public String getBookTitle()
    {
        return bookTitle;
    }

    public void setBookTitle(String newBookTitle)
    {
        this.bookTitle = newBookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String newBookAuthor) {
        bookAuthor = newBookAuthor;
    }
    public String getbookFormat()
    {
        return bookFormat;
    }

    public void setBookFormat(String newBookFormat) {
        bookFormat = newBookFormat;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String newBookGenre) {
        this.bookGenre = newBookGenre;
    }


    public String getBookOverview() {
        return bookOverview;
    }

    public void setBookOverview(String newBookOverview) {
        this.bookOverview = newBookOverview;
    }

    public int getBookQty() {
        return bookQty;
    }

    public void setBookQty(int newBookQty) {
        bookQty = newBookQty;
    }
}
