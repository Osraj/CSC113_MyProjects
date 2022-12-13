public class Student {
    private String studentName;
    private int studentId;
    private int studentAge;
    private String studentGender;

    public Student(String n, int id, int age, String gen){
        studentName = n;
        studentId = id;
        studentAge = age;
        studentGender = gen;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentAge(){
        return studentAge;
    }

    public String getStudentGender(){
        return studentGender;
    }

    public void display(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Gender: " + studentGender);
    }
}// class end
