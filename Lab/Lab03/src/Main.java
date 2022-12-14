public class Main {
    public static void main(String[] args) {
        Channel c1 = new Channel("KSU", 10);
        Playlist p1 = new Playlist("CCIS", true, 15);

        p1.addVideo(new Video (1, "CCIS_Seminar", 350, "Education" ));
        p1.addVideo(new Video (2, "CCIS_Football", 200, "Sports"));
        p1.addVideo(new Video (3, "CCIS_Public_Lecture", 300, "Education"));

        p1.removeVideo(new Video (3,"CCIS_Public_Lecture", 300, "Education"));

        c1.addPlaylist(p1);

        Playlist p2 = new Playlist("Business", false, 10);

        p2.addVideo(new Video (1, "Business_Tennis_Tournament", 800, "Sports"));
        p2.addVideo(new Video (2, "Business_Comedy_Club", 400, "Comedy"));
        p2.addVideo(new Video (3, "Business_Seminar", 200, "Education"));

        c1.addPlaylist(p2);

        Playlist p3 = new Playlist("Engineering", true, 20);

        p3.addVideo(new Video (1, "ENG_Field_Work", 300, "Others"));
        p3.addVideo(new Video (2, "ENG_Gaming_Competition", 700, "Entertainment"));

        c1.addPlaylist(p3);
        c1.sortPlaylists();
        c1.flipShared(p2);

        Playlist temp = c1.getPlaylist("Entertainment");

        System.out.println("Channel Info:");
        System.out.println(c1.toString());
        System.out.println("----------------------------------------------------");
        System.out.println("Playlist with the most ENTERTAINMENT videos is:");
        System.out.println(temp);
    }
}