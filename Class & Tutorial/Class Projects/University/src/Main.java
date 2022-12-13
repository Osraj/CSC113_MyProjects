public class Main {
    public static void main(String[] args) {
        Student m1 = new MedicalStudent("A", 1, 1, 1);
        ScienceStudent s1 =  new ScienceStudent();
        Section sec1 = new Section("CSC113", 20);
        sec1.addStudentComp(m1);
        sec1.addStudentComp(s1);
    }
}