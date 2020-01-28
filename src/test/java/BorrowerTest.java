import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;
    private Borrower borrower;

    @Before
    public void before(){
        book1 = new Book("The Catcher in the Rye", "J. D. Salinger", "Fiction");
        book2 = new Book("Doctor Sleep", "Stephen King", "Horror");
        book3 = new Book("Pride and Prejudice", "Jane Austen", "Fiction");
        book4 = new Book("It", "Stephen King", "Horror");
        book5 = new Book("The Whisper Man", "Alex North", "Thriller");
        book6 = new Book("The Hating Game", "Salley Thorne", "Romcom");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        library = new Library(5, books);
        borrower = new Borrower();
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public  void canAddBook(){
        borrower.addBook(book6);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library, book3);
        assertEquals(1, borrower.bookCount());
        assertEquals(2, library.stockCount());
    }
}
