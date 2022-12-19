public class News extends TV_Channel{
    private int newsSegments;
    private int breakingNews;

    public News(int views, boolean live, int newsSegments, int breakingNews){
        super(views, live);
        this.newsSegments = newsSegments;
        this.breakingNews = breakingNews;
    }

    public int getNewsSegments(){
        return newsSegments;
    }

    public int getBreakingNews(){
        return breakingNews;
    }

    @Override
    public void display(){
        System.out.println("NEWS CHANNEL");
        super.display();
        System.out.println("Number of News Segments: " + newsSegments);
        System.out.println("Number of Breaking News: " + breakingNews);
    }

    public double calculateRating(){
        if( (breakingNews == 0) || (nbProg == 0) )
            return 0;

        double temp = (double) getViews() / breakingNews;
        double total = 0;
        double ave = 0;

        for(int i=0; i<nbProg; i++){
            total += arProg[i].getAudienceRate();
        }
        ave = total / nbProg;


        return ( temp + ave );
    }
}
