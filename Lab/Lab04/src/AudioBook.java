public class AudioBook extends Book {
    private int duration;
    private String narrator;

    public AudioBook(String title, String author, int duration, String narrator){
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.narrator = narrator;
    }

    public int getDuration(){
        return duration;
    }

    public String getNarrator(){
        return narrator;
    }

}
