import java.io.Serializable;
public class Cash extends Donation implements Serializable{
    private String currency;

    public Cash(double amount, String location, String donorName, String currency){
        super(amount, location, donorName);
        this.currency = currency;
    }

    public Cash(Cash c){
        super(c.getAmount(), c.getLocation(), c.getDonorName());
        this.currency = c.currency;
    }

    public String getCurrency(){
        return currency;
    }

    public void display(){
        super.display();
        System.out.println("Currency: " + currency);
    }
}
