public class Sports extends TV_Channel{
    private int nbMatches;

    public Sports(int views, boolean live, int nbMatches){
        super(views, live);
        this.nbMatches = nbMatches;
    }

    public int getNbMatches(){
        return nbMatches;
    }

    @Override
    public void display(){
        System.out.println("SPORT CHANNEL");
        super.display();
        System.out.println("Number of matches: " + nbMatches);
    }

    public double calculateRating(){
        return ( (double) getViews() / nbMatches*1.5);
    }
}
