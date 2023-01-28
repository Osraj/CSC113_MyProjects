public class Check extends Donation{
    private String bankName;

    public Check(double amount, String location, String donorName, String bankName){
        super(amount, location, donorName);
        this.bankName = bankName;
    }

    public String getBankName(){
        return bankName;
    }
}
