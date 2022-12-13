public class MedicalStudent extends Student {

    public int labHours;

    public MedicalStudent() {

    }

    public MedicalStudent(String n, int i, double g, int l) {
        super(n, i, g);

        labHours = l;

    }
   public MedicalStudent(MedicalStudent m){
       super(m);
       labHours = m.labHours;
       
   }

}
