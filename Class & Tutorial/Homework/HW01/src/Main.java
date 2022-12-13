public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Ahmed", 1, 4);
        Student s2 = new Student("Osamah", 2, 5);
        Student s3 = new Student("Mohammed", 3, 4.5);

        s1.dispaly();
        s2.dispaly();

        Section sec1 = new Section("CSC113", 20);
        Section sec2 = new Section("CSC111", 30);

        sec1.addStudent(s1);
        sec1.addStudent(s2);
        sec1.addStudent(s3);

        sec2.addStudent(s1);
        sec2.addStudent(s2);

        sec1.search(3);

        sec1.removeStudent(2);

        sec1.countMoreThan(2);

        sec1.maxStudent();










    }
}