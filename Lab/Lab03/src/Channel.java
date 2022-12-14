// [KSU]_[CSC 113]_Lab03_Osamah Sarraj, 443101217

public class Channel {
    private String name;
    private Playlist[] playlists;
    private int numPlay;

    public Channel(String name, int size){
        this.name = name;
        playlists = new Playlist[size];
        numPlay = 0;
    }

    private int searchIndex(Playlist p){
        for(int i=0; i<numPlay; i++){
            if(playlists[i].equals(p))
                return i;
        }
        return -1;
    }


    public boolean addPlaylist(Playlist p){
        int index = searchIndex(p);

        if(numPlay==playlists.length || index!=-1) {
            System.out.println("This Playlist is Full");
            return false;
        }

        playlists[numPlay++] = new Playlist(p);
        return true;
    }

    public boolean deletePlaylist(Playlist p){
        int index = searchIndex(p);

        if(index == -1)
            return false;

        // deleting using remove-and-replace method
        playlists[index] = playlists[numPlay-1];
        playlists[numPlay-1] = null;
        numPlay--;
        return true;
    }// deletePlaylist()

    public boolean flipShared(Playlist p){
        int index = searchIndex(p);

        if(index == -1)
            return false;

        playlists[index].setShared(!playlists[index].isShared());
        return true;
    }//flipShared()

    public Playlist getPlaylist(String cat){
        if(numPlay == 0)
            return null;
        Playlist max = playlists[0];

        for(int i=1; i<numPlay; i++){
            if(playlists[i].countVideosOf(cat) > max.countVideosOf(cat))
                max = playlists[i];
        }//for i
        return max;
    }//getPlaylist()

    public void sortPlaylists(){
        for(int i=0; i<numPlay; i++)
            playlists[i].sortOnDuration();
    }//sortPlaylist()

    @Override
    public String toString(){
        String temp = "";
        for(int i=0; i<numPlay; i++){
            if(i>0) {temp += ", ";}
            temp += playlists[i].toString();
        }//for i

        return "Channel [ name= " + name
                + ", numplay= " + numPlay
                + ", playlist= " + temp + " ]";

    }//toString

}//class
