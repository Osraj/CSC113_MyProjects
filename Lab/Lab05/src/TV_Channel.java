public abstract class TV_Channel implements Viewable{
    private int views;
    private boolean live;
    protected  TV_Program arProg[];
    protected int nbProg;

    public TV_Channel(int views, boolean live){
        super();
        this.views = views;
        this.live = live;
        arProg = new TV_Program[20];
        nbProg = 0;
    }

    public int getViews(){
        return views;
    }

    public boolean isLive(){
        return live;
    }

    public abstract double calculateRating();

    @Override
    public void display(){
        System.out.println("Views: " + views);
        System.out.println("Live: " + live);
        for(int i=0; i < nbProg; i++)
            arProg[i].display();
        System.out.println("Number of Programs: " + nbProg);
    }
}
