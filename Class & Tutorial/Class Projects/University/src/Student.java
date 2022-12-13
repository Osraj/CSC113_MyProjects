public class Student {

    protected String name;
    protected int id;
    protected double gpa;

    public Student() {
        System.out.println("Student()");
        name = "NoName";
        id = 0;
        gpa = 0;
    }

    public Student(String n, int i, double g) {
        System.out.println("Student(n,i,g)");

        name = n;
        id = i;
        gpa = g;
    }

    public Student(Student s) {
        name = s.name;
        id = s.id;
        gpa = s.gpa;

    }

    public void dispaly() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
    }

}
