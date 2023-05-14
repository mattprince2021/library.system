package library.system;

public class BookOLD {
    //instance variables

    private final String bookAuthor;
    private final String bookFormat;
    private final String bookISBN;
    private String bookTitle;
    private String bookGenre;
    private String bookOverview;
    private String bookQuantity;


    //constructors

    public BookOLD(String bTitle, String bAuthor, String bFormat, String bGenre, String bOverview, String bISBN, String bQty) {
        bookTitle = bTitle;
        bookAuthor = bAuthor;
        bookFormat = bFormat;
        bookGenre = bGenre;
        bookOverview = bOverview;
        bookISBN = bISBN;
        bookQuantity = bQty;
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

    public String getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(String bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public String getBookInformation() {
        String bookInformation = bookTitle + "; ";
        bookInformation += bookAuthor + "; ";
        bookInformation += bookFormat + "; ";
        bookInformation += bookGenre + "; ";
        bookInformation += bookISBN + "; ";
        bookInformation += bookOverview + "; ";
        bookInformation += bookQuantity + "; ";
        return bookInformation;
    }
}
