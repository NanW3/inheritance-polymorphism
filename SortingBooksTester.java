import java.util.*;

public class SortingBooksTester {
    public static void main(String[] args) {
        Book b1 = new Book("Moby Dick", "Melville", 922);
        Book b2 = new Book("Emma", "Austen", 221);
        Book b3 = new Book();

        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        Collections.sort(books, new BookComparator()); // Book class doesn't implement Comparable
        // you can not modify the Book class
        //in this case you could create your own comparator to achieve the sorting


        for (Book b : books) {
            System.out.println(b);
        }
    }
}