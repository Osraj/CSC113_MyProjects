public class ScienceStudent extends Student {

    public int mathHours;

    public ScienceStudent() {

    }

    public ScienceStudent(String n, int i, double g, int m) {
        super(n, i, g);
        mathHours = m;

    }

    public ScienceStudent(ScienceStudent s) {
        super(s);
        mathHours = s.mathHours;
        
    }

    public double graduationGift() {
        return gpa * 100;
    }

}
