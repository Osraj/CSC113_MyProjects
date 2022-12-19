public class EBook extends WrittenBook{
    private int size;

    public EBook(String title, String author, int nPages, int size){
        super(title, author, nPages);
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public PrintedBook print(){
        return ( new PrintedBook(title, author, getnPages()) );
    }
}
