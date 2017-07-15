public class Book{
   private String title; //attributes(available for everything in the class, global) all the attributes should be private, but all the method of this class is public
   private String author;  //every single attributes need getters and setters.
   private int numpages;
   private ISBN isbn;

   
   public Book(String title, String author, int numpages){//constructor 
       this.title = title;   //this--> tallking about for this particular object, not a global variable
       this.author = author;
       this.numpages = numpages;
       this.isbn = new ISBN();
       //String title2 = title; //only available in this method
   }

   public Book(){//constructor
       this.title = "";
       this.author = "";
       this.numpages = 0;
   }

   //getters 
   public String getTitle(){
    return this.title;
   }

   public String getAuthor(){
    return this.author;
   }

   public int getNumpages(){
    return this.numpages;
   }

   public ISBN getISBN () {
     return this.isbn;
   }
   
   //setters
   public void setTitle(String t) {
      this.title = t;
   }

   public void setAuthor(String a) {
      this.title = a;
   }

   public void setNumpages(int n){
    this.numpages = n;
   }

   public void setISBN () {
    this.isbn = new ISBN();
   }

   //other methods
   public boolean isLong(){
       return this.numpages > 400;
   }

   public int getTitleLength(){
       return this.title.length();  //strings need parathesis
   }
 
   @Override
   public boolean equals(Object o) {
    if (o instanceof Book) {
      return (this.title.equals(((Book)o).getTitle()) && this.author.equals(((Book)o).getAuthor()));
    }
    return false;
   }

   @Override
   public int hashCode() {
    int result = 17;
    result = result * 31 + this.title.hashCode();
    result = result * 31 + this.author.hashCode();
    result = result * 31 + this.numpages;
    System.out.println(result);
    return result;
   }

   public String toString(){  //return a string that tells about the object's attributes
     return String.format("%s : %s was written by %s and has %d pages.",this.isbn, this.title,this.author,this.numpages);
   }


}


//compile the whole file using "javac Book.java" then it creates Book.class & BookTester.class
//"java Book"  runntime error cuz it doesn't contain main method
//"java BookTester"  works fine
class BookTester{
    public static void main(String[] args) {
        Book book1 = new Book("Moby Dick","Melville",922); //call the constructor  book1 is an object of the Book class
        
        Book book2 = new Book("Emma","Austen",241);

        Book book3 = new Book();

        Book book4;
        book4 = book3;

        Book[] books = new Book[5];//declare the array, allotcate the memory
        books[0] = new Book("Moby Dick","Melville",922);
        books[1] = new Book();
        books[2] = new Book();

        // for(Book b : books){
        //   System.out.println(b);   //find the toString method and print that out.
        // }

        System.out.println(book1.isLong()); //true

        System.out.println(book2.isLong()); //false

        System.out.println(book2.getTitleLength());//4

        System.out.println(book1); //find the toString method, print out that string


        //System.out.println(book1.numpages);//numpages is private! you can not access it. you need getters and setters
        System.out.println(book1.getNumpages()); // call the public methods instead
    }
    
    


}