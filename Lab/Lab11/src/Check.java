public class Check extends Donation{
    private String bankName;

    public Check(double amount, String location, String donorName, String bankName){
        super(amount, location, donorName);
        this.bankName = bankName;
    }

    public Check(Check c){
        super(c.getAmount(), c.getLocation(), c.getDonorName());
        this.bankName = c.bankName;
    }

    public String getBankName(){
        return bankName;
    }
}
