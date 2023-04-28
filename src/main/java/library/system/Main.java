package library.system;

public class Main
{
    public static void main(String[] args) {
        Book testing = new Book("The Star", "M. X. Smith", "Hardback", "Horror",
                "First book in an exciting new series, blending the real and the absurd",
                "274573839475");

        String bookName = testing.getBookTitle();
        System.out.println("Book is " + bookName);
        String bookAuthor = testing.getBookAuthor();
        System.out.println("written by " + bookAuthor);
    }
}
