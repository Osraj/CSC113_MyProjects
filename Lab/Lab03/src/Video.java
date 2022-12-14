// [KSU]_[CSC 113]_Lab03_Osamah Sarraj, 443101217

public class Video {
    private int id;
    private String title;
    private int duration;
    private String category;


    public Video(int id, String title, int duration, String category){
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.category = category;
    }//Video

    public int getDuration(){
        return duration;
    }

    public String getCategory(){
        return category;
    }

    public boolean equals(Video obj){
        return id == obj.id;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", category='" + category + '\'' +
                "} ";
    }
}
