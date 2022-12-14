// [KSU]_[CSC 113]_Lab03_Osamah Sarraj, 443101217

public class Playlist {
    private String name;
    private boolean shared;
    private Video[] videos;
    private int numVid;

    public Playlist(){
        name = "NoName";
        videos = new Video[0];
    }//Playlist

    public Playlist(String name, boolean shared, int size){
        this.name = name;
        this.shared = shared;
        videos = new Video[size];
        numVid = 0;

        for(int i=0; i<size; i++){
            videos[i] = null;
        }
    }//Playlist


    // Adding the method search to make it easier for myself to run the code
    private int search(Video v){
        for(int i=0; i<numVid; i++){
            if(videos[i].equals(v))
                return i;
        }
        return -1;
    }//search


    public boolean addVideo(Video v){
        if(numVid == videos.length || search(v) != -1)
            return false;

        videos[numVid++] = v;
        return true;
    }//addVideo

    public boolean removeVideo(Video v){
        int index = search(v);
        if(index == -1)
            return false;

        // removing from an array using remove-and-shift
        for(int i=index; i<numVid-1; i++){
            videos[i] = videos[i+1];
        }
        videos[numVid--] = null;

        return true;
    }//removeVideo

    public int countVideosOf(String category){
        int counter = 0;
        for(int i=0; i<numVid; i++){
            if (videos[i].getCategory().equals(category))
                    counter++;
        }
        return counter;
    }

    public void sortOnDuration(){
        if(numVid==1)
            return;

        for(int i=0; i<numVid-1; i++){
            for(int j=0; j<numVid-1; j++){
                if (videos[j].getDuration() > videos[j+1].getDuration()) {
                    Video[] temp = new Video[1];

                    temp[0] = videos[j];
                    videos[j] = videos[j+1];
                    videos[j+1] = temp[0];
                }//if
            }//for j
        }//for i
    }//sortOnDuration()

    public String getName() {
        return name;
    }//getName()

    public boolean isShared(){
        return shared;
    }//isShared()

    public void setShared(boolean shared) {
        this.shared = shared;
    }//setShared()

    public boolean equals(Playlist obj) {
        return this.name.equals(obj.getName());
    }//equals()

    @Override
    public String toString() {
        String temp = "";
        for(int i=0; i<numVid; i++){
            temp += videos[i].toString();

        }//for i

        return "Playlist  [name= " + name + ", shared= " + shared
                + ", numberOfVideos= " + numVid
                + ", videos= " + temp + "]";
    }//toString()

}//class
