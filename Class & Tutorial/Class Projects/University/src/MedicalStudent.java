public class MedicalStudent extends Student {

    public int labHours;

    public MedicalStudent() {
    }

    public MedicalStudent(String n, int i, double g, int l) {
        super(n, i, g);

        labHours = l;

    }

    public MedicalStudent(MedicalStudent m) {
        super(m);
        labHours = m.labHours;

    }

    public void display() {
        System.out.println("MedicalStudent");
        super.display();

        System.out.println("Lab:" + labHours);
    }

    public void displayLab() {
        System.out.println("Lab:" + labHours);
    }

    @Override
    public double graduationGift() {
        return gpa * 2000;
    }

    public boolean isImmune() {
        return nb_shots == SHOTS + 1;
    }

}
