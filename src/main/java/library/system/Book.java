package library.system;

import javax.persistence.*;

@Entity
public class Book
{
    private int bookID;
    private String bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private String bookFormat;
    private String bookGenre;
    private String bookOverview;
    private int bookQuantity;

    @Id
    public int getBookID()
    {
        return  bookID;
    }

    public void setBookID(int newBookID)
    {
        bookID = newBookID;
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
        bookTitle = newBookTitle;
    }

    public String getBookAuthor()
    {
        return bookAuthor;
    }

    public void setBookAuthor(String newBookAuthor)
    {
        bookAuthor = newBookAuthor;
    }

    public String getBookFormat()
    {
        return bookFormat;
    }

    public void setBookFormat(String newBookFormat)
    {
        bookFormat = newBookFormat;
    }

    public String getBookGenre()
    {
        return bookGenre;
    }

    public void setBookGenre(String newBookGenre)
    {
        bookGenre = newBookGenre;
    }


    public String getBookOverview()
    {
        return bookOverview;
    }

    public void setBookOverview(String newBookOverview)
    {
        bookOverview = newBookOverview;
    }

    public int getBookQuantity()
    {
        return bookQuantity;
    }

    public void setBookQuantity(int newBookQuantity)
    {
        bookQuantity = newBookQuantity;
    }
}
