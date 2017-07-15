public class ISBN { // if you don't put public  it is okay because public is default
/* an isbn number is made up for four three digit parts separated by -  */    
    private int part1;
    private int part2;
    private int part3;
    private int part4;

    public ISBN () {
        this.part1 = (int)(Math.random() * 889) + 111;     //[111,999]  889 is the # possibility
        this.part2 = (int)(Math.random() * 889) + 111;
        this.part3 = (int)(Math.random() * 889) + 111;
        this.part4 = (int)(Math.random() * 889) + 111;
    }

    public String toString() {
        return this.part1 + "-" + this.part2 + "-" + this.part3 + "-" + this.part4;
    }

}