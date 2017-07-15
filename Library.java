public class Library {
    private String name;
    private Book[] books;
    private int numbooks;
    private int year;
    private Book popular;


    // constructor does not have return type
    public Library (String n, int year) {
        this.name = n;
        this.numbooks = 0;
        this.books = new Book[100]; //allocating room for 100 books
        this.year = year;
        this.popular = null; //is "" equal to null? no.
    }

    public Library () {
        this.name = "";
        this.numbooks = 0;
        this.books = new Book[100]; //allocating room for 100 books
        this.year = 0; // can not use null here
        this.popular = null;
    }

    //getter
    public int getYear () {
        return this.year;
    }

    public Book getPopular () {
        return this.popular;
    }

    //setter
    public void setYear (int year) {
        this.year = year;
    }


    public void setPopular (Book b) {
        this.popular = b;
    }

    //other methods
    public void addBook (Book b) {
       this.books[this.numbooks] = b;
       this.numbooks++;   //later check if we have enough memory
    }

    public String toString() {
        return this.name + "was established in " + this.year + " and has " + this.numbooks + " books.";
    }
}


class LibraryTester {
    public static void main (String[] args) {
        Library gtlib = new Library("Georgia Tech Library",1903);
        
        Book mybook = new Novel("Emma","Austen",212,"Romance"); //implicity cast a novel to a book (compile time)
        Book otherbook = new Textbook("Intro to Java", "Liang",989,"CS");
        gtlib.addBook(otherbook);
        gtlib.addBook(mybook);


        // System.out.println(gtlib);
        // System.out.println(((Novel)mybook).getGenre());
        // System.out.println(otherbook.getTitle());


        Book[] books = new Book[25];
        books[0] = new Novel("Emma","Austen",212,"Romance");
        books[1] = new Textbook("Intro to Java", "Liang",989,"CS");
        books[2] = new Book();

        for (Book b : books) {
            System.out.println(b);  //at run time, toString() for novels
            System.out.println(((Novel)b).getGenre())
        }

    }
}