import java.util.ArrayList;

public class BookTester {

    public static void main(String[] agrs) {

        int randT = (int)Math.random() * 6 + 4;
        int randN = (int)Math.random() * 5 + 1;

        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < randN; i++) {
            books.add(new Novel());
        }
        for (int j = 0; j < randT; j++) {
            books.add(new Textbook());
        }

        books.add(new Book());
 
        for (Book b : books) {
            if (b instanceof Novel) {
                System.out.println(((Novel)b).getGenre());
            }
        }
        System.out.println(books.get(0).equals(books.get(1)));
    }
}