import java.io.Serializable;
public class Donation implements Serializable{
    private double amount;
    private String location;
    private String donorName;

    public Donation(double amount, String location, String donorName){
        this.amount = amount;
        this.location = location;
        this.donorName = donorName;
    }

    public Donation(Donation d){
        amount = d.amount;
        location = d.location;
        donorName = d.donorName;
    }

    public String getDonorName(){
        return donorName;
    }

    public String getLocation(){
        return location;
    }

    public double getAmount() throws Exception{
        if(amount < 0)
            throw new Exception("Amount cannot be negative");
        return amount;
    }

    public void display(){
        System.out.println("Donor Name: " + donorName);
        System.out.println("Amount: " + amount);
        System.out.println("Location: " + location);
    }
}
