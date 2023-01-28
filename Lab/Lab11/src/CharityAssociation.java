public class CharityAssociation{
    private String name;
    private Donation[] arrDonation;
    private int nbDonation;

    public CharityAssociation(String name, int size){
        this.name = name;
        arrDonation = new Donation[size];
        nbDonation = 0;
    }

    public boolean addDonation(Donation d){
        if(nbDonation == arrDonation.length)
            return false;

        if(d instanceof Cash){
            arrDonation[nbDonation++] = new Cash ((Cash) d);
        }
        else if(d instanceof Check){
            arrDonation[nbDonation++] = new Check ((Check) d);
        }
        return true;
    }

    public double avgCashDonation(String currency){
        double sum = 0;
        int count = 0;
        for(int i = 0; i < nbDonation; i++){
            if(arrDonation[i] instanceof Cash){
                Cash c = (Cash) arrDonation[i];
                if(c.getCurrency().equals(currency)){
                    sum += c.getAmount();
                    count++;
                }
            }
        }
        return sum / count;
    }

    public Check getCheck(String bankName){
        for(int i = 0; i < nbDonation; i++){
            if(arrDonation[i] instanceof Check){
                Check c = (Check) arrDonation[i];
                if(c.getBankName().equals(bankName))
                    return c;
            }
        }
        return null;
    }

}
