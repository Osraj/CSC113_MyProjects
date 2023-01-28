public class Donation {
    private double amount;
    private String location;
    private String donorName;

    public Donation(double amount, String location, String donorName){
        this.amount = amount;
        this.location = location;
        this.donorName = donorName;
    }

    public String getDonorName(){
        return donorName;
    }

    public String getLocation(){
        return location;
    }

    public double getAmount(){
        return amount;
    }

    public void display(){
        System.out.println("Donor Name: " + donorName);
        System.out.println("Amount: " + amount);
        System.out.println("Location: " + location);
    }
}
