import java.util.HashMap;

public class Book {
    private String title;
    private String author;
    private HashMap<String, String> genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = new HashMap<String, String>();
        this.genre.put("genre", genre);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre(String key) {
        return genre.get(key);
    }

    public void addGenre(String key, String value){
        this.genre.put(key, value);
    }

}
