import java.io.*;
public class CharityAssociation implements IOInterface {
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
                    try{
                        sum += arrDonation[i].getAmount();
                        count++;
                    } catch(Exception e){
                        System.out.println(e);
                    }
                }
            }
        }
        if(count == 0)
            return 0;
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

    public void saveToFile(String fileName, String donor) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(int i = 0; i < nbDonation; i++){
            if (arrDonation[i] instanceof Cash){
                Cash c = (Cash) arrDonation[i];
                if(c.getDonorName().equals(donor))
                    oos.writeObject(c);
            }
        }
        oos.close();
        fos.close();
    } // end of saveToFile

    // This method is just for testing the loadFromFile method
    public void saveAll(String filename) throws IOException{
        File f = new File(filename);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(int i = 0; i < nbDonation; i++)
            oos.writeObject(arrDonation[i]);
        oos.close();
        fos.close();
    }


    public void loadFromFile(String fileName, Check[] arrCheck) throws IOException{
        File f = new File(fileName);
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        int line = 0;
        try{
            while(true){
                try{
                    Object d = ois.readObject();
                    if(d instanceof Check)
                        arrCheck[line++] = (Check) d;
                } catch (ClassNotFoundException e){
                    System.out.println("Class not found");
                }
            }
        } catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            System.out.println("IO Exception");
        } finally {
            ois.close();
            fis.close();
        }
    } // end of loadFromFile

} // end of class CharityAssociation
