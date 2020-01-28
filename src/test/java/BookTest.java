import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("The Catcher in the Rye", "J. D. Salinger", "Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Catcher in the Rye", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("The Catcher in the Rye", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("The Catcher in the Rye", book.getGenre());
    }
}
