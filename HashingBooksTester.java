import java.util.*;

public class HashingBooksTester {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Moby Dick", "Melville", 922));
        books.add(new Book("Moby Dick", "Melville", 922));
        books.add(new Book("Animal Farm", "Orwell", 199));
        books.add(new Book("1984", "Orwell", 245));

        Set<Book> bookSet = new HashSet<>(books); //put the whole arraylist into a set
        //duplicates are removed because all elements in a Set must be unique\
        System.out.println(bookSet); // a toString for Set to print it out.



    }
}