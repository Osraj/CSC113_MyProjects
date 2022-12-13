public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ahmed", 1, 21, "male");
        Student s2 = new Student("Osamah", 2, 22, "male");
        Student s3 = new Student("Mohammed", 3, 23, "male");

        Section sec1 = new Section(3);
        sec1.addStudent(s1);
        sec1.addStudent(s2);
        sec1.addStudent(s3);

        Section sec2 = new Section(2);
        sec2.addStudent(s1);
        sec2.addStudent(s2);

        s1.display();
        sec1.searchStu(1);
        //sec1.displayAll();



    }
}