import java.util.ArrayList;

public class Borrower {
    private ArrayList <Book> borrowedCollection;

    public Borrower() {
        this.borrowedCollection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.borrowedCollection.size();
    }

    public void addBook(Book book) {

        this.borrowedCollection.add(book);
    }

    public void borrowBook(Library library, Book book) {
        addBook(book);
        library.removeBook(book);
    }
}
