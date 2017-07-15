public class Textbook extends Book{
    private String subject;

    public Textbook(String t, String a, int n, String s) {
        super(t,a,n);
        this.subject = s;
    }

    public Textbook(){
        super();
        this.subject = "Unknown";
    }

    @Override
    public String getTitle() {
        return super.getTitle() + "a textbook.";
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1) + " and its subject is " + this.subject;
    }

    //overload
    public void setTitle() {
        String newstring = this.getTitle() + "(" + this.subject +")"; 
        super.setTitle(newstring);
    }
}

class TextbookDriver {
    public static void main(String[] args) {
        Textbook mytextbook = new Textbook("cs","turring",1324,"computer science");
        mytextbook.setTitle();
        System.out.println(mytextbook);
    }
}