package library.system;

public class Book {
    //instance variables

    private String bookTitle, bookAuthor, bookFormat, bookGenre, bookOverview, bookISBN;

    //constructors

    public Book(String bTitle, String bAuthor, String bFormat, String bGenre, String bOverview, String bISBN)
    {
        bookTitle = bTitle;
        bookAuthor = bAuthor;
        bookFormat = bFormat;
        bookGenre = bGenre;
        bookOverview = bOverview;
        bookISBN = bISBN;
    }

    //methods

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookFormat() {
        return bookFormat;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookOverview() {
        return bookOverview;
    }

    public void setBookOverview(String bookOverview) {
        this.bookOverview = bookOverview;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public String getBookInformation()
    {
        String bookInformation = bookTitle + "; ";
        bookInformation += bookAuthor + "; ";
        bookInformation += bookFormat + "; ";
        bookInformation += bookGenre + "; ";
        bookInformation += bookISBN + "; ";
        bookInformation += bookOverview + "; ";
        return bookInformation;
    }
}
