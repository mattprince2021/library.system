package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class models a Book held in the Library. A book has a unique library ID, unique ISBN code, title, author, format
 * genre, overview and quantity.
 *
 * @author matthewprince
 * @version 1.0
 */

@Entity
public class Book {
    private int bookID;
    private String bookISBN;
    private String bookTitle;
    private String bookAuthor;
    private String bookFormat;
    private String bookGenre;
    private String bookOverview;
    private int bookQuantity;

    /**
     * @param bID       unique ID of the book in the library
     * @param bISBN     unique
     * @param bAuthor   name of the author of the book
     * @param bTitle    title of the book
     * @param bGenre    the genre of the book (e.g. Horror, Fiction)
     * @param bFormat   the physical format of the book (paperback or hardback)
     * @param bOverview a brief synopsis of the book
     * @param bQuantity the total volume of copies
     */
    public Book(int bID, String bISBN, String bAuthor, String bTitle, String bGenre, String bFormat, String bOverview,
                int bQuantity) {
        bookID = bID;
        bookISBN = bISBN;
        bookTitle = bTitle;
        bookAuthor = bAuthor;
        bookGenre = bGenre;
        bookFormat = bFormat;
        bookOverview = bOverview;
        bookQuantity = bQuantity;
    }

    public Book() {

    }

    /**
     * Gets the ID of the Book
     *
     * @return the ID of the Book
     */

    @Id
    public int getBookID() {
        return bookID;
    }

    /**
     * Setting the Book ID is controlled by the controller, this increments the most recent Book ID by 1
     */
    public void setBookID(int newBookID) {
        bookID = newBookID;
    }

    /**
     * Gets the ISBN of the Book
     *
     * @return the ISBN of the Book
     */
    public String getBookISBN() {
        return bookISBN;
    }

    /**
     * Sets the ISBN of the Book
     */
    public void setBookISBN(String newISBN) {
        bookISBN = newISBN;
    }

    /**
     * Gets the Title of the Book
     *
     * @return the Title of the Book
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the Title of the Book
     */
    public void setBookTitle(String newBookTitle) {
        bookTitle = newBookTitle;
    }

    /**
     * Gets the Author of the Book
     *
     * @return the Author of the Book
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * Sets the Author of the Book
     */
    public void setBookAuthor(String newBookAuthor) {
        bookAuthor = newBookAuthor;
    }

    /**
     * Gets the Format of the Book
     *
     * @return the Format of the Book
     */
    public String getBookFormat() {
        return bookFormat;
    }

    /**
     * Sets the Format of the Book
     */
    public void setBookFormat(String newBookFormat) {
        bookFormat = newBookFormat;
    }

    /**
     * Gets the Genre of the Book
     *
     * @return the Genre of the Book
     */
    public String getBookGenre() {
        return bookGenre;
    }

    /**
     * Sets the Genre of the Book
     */
    public void setBookGenre(String newBookGenre) {
        bookGenre = newBookGenre;
    }

    /**
     * Gets the Overview of the Book
     *
     * @return the Overview of the Book
     */
    public String getBookOverview() {
        return bookOverview;
    }

    /**
     * Sets the Overview of the Book
     */
    public void setBookOverview(String newBookOverview) {
        bookOverview = newBookOverview;
    }

    /**
     * Gets the Quantity of Book copies
     *
     * @return the Quantity of Book copies
     */
    public int getBookQuantity() {
        return bookQuantity;
    }

    /**
     * Sets the Quantity of Book copies
     */
    public void setBookQuantity(int newBookQuantity) {
        bookQuantity = newBookQuantity;
    }
}
