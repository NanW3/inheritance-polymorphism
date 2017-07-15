import java.util.*;

public class BookComparator implements Comparator<Book> {
    
    public int compare(Book a, Book b) {
        return a.getNumpages() - b.getNumpages();
    }
}