import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;


    @Before
    public void before(){
        book1 = new Book("The Catcher in the Rye", "J. D. Salinger", "Fiction");
        book2 = new Book("Doctor Sleep", "Stephen King", "Horror");
        book3 = new Book("Pride and Prejudice", "Jane Austen", "Fiction");
        book4 = new Book("It", "Stephen King", "Horror");
        book5 = new Book("The Whisper Man", "Alex North", "Thriller");
        book6 = new Book("The Hating Game", "Salley Thorne", "Romcom");
        ArrayList <Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        library = new Library(5, books);
    }

    @Test
    public void hasBooks(){
        assertEquals(3, library.stockCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book4);
        assertEquals(4, library.stockCount());
    }

    @Test
    public void reachedCapacity(){
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.stockCount());
    }
}
