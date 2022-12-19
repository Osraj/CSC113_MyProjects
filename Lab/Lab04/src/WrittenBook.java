public class WrittenBook extends Book{
    private int nPages;

    public WrittenBook(String title, String author, int nPages){
        super(title, author);
        this.nPages = nPages;
    }

    public int getnPages(){
        return nPages;
    }
}
