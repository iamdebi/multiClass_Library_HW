import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity, ArrayList<Book> stock) {
        this.capacity = capacity;
        this.stock = stock;
    }


    public int stockCount() {
       return this.stock.size();
    }

    public void addBook(Book book) {
        if (stockCount() < capacity) {
            this.stock.add(book);
        }
    }
}
