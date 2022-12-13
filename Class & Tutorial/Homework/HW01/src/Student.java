public class Student {
    public String name;
    public int id;
    public double gpa;

    public Student(){
        name = "No_Name";
        id = 0;
        gpa = 0.0;
    }

    public Student(String n, int id, double gpa){
        name = n;
        this.id = id;
        this.gpa = gpa;
    }

    public void dispaly(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student GPA: " + gpa);
    }
}
