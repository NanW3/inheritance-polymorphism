public class Novel extends Book{ //this class has everything(attributes + methods) that Book class hass
    private String genre;  //Novel has all the book attributes and this attribute too.

    public Novel(String t, String a, int n, String g){
        super(t,a,n); //call the Book constructor
        this.genre = g;
    }

    public Novel() {
       // super();   this line is optional. if you have this line, this line must be the first line. default to find the super class empty constructor.
        //if there is no empty constructor in Book class, will get errors. 
        this.genre = "";
    }

    public String getGenre() {
        return this.genre;
    }

    @Override
    public String getTitle() {
        return super.getTitle() + "a novel";
    }
    

    @Override //helps check for errors
    public boolean isLong() {
        //return true if the book is already long or the book is a Horror
        return super.isLong() || (this.genre.equals("Horror"));
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length() -1) + " And is a novel with " + this.genre + ".";
    }




}

class NovelDriver {
    public static void main (String[] args) {
        Novel mynovel = new Novel("Emma","Austen",401,"Romance");
        Novel mynovel2 = new Novel();

        System.out.println(mynovel.getNumpages());
        System.out.println(mynovel.isLong()); //isLong for novel
        //System.out.println((Book)mynovel.isLong());//isLong for book

        Book book1 = new Book("Websters", "Committee",700);
        System.out.println(book1.isLong()); //isLong for book

        System.out.println(mynovel);
    }
}