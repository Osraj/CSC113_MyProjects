public class TV_Program{
    private double audienceRate;

    public TV_Program(double audienceRate){
        super();
        this.audienceRate = audienceRate;
    }

    public double getAudienceRate(){
        return audienceRate;
    }

    public void display(){
        System.out.println("Audience Rate: " + audienceRate);
    }
}
