import java.io.Serializable;

 
public abstract class Student implements Tawalna , Absher, Serializable{

    protected String name;
    protected int id;
    protected double gpa;
    protected int nb_shots = 3;
    
    
    public Student next;
    
    
    public Student() {
        //System.out.println("Student()");
        name = "NoName";
        id = 0;
        gpa = 0;
    }

    public Student(String n, int i, double g) {
     //   System.out.println("Student(n,i,g)");

        name = n;
        id = i;
        gpa = g;
    }

    public Student(Student s) {
        name = s.name;
        id = s.id;
        gpa = s.gpa;

    }

  
    public void display() {
        
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
    }
 
     
   
    public final boolean canGraduate(){
        return gpa >= 2.75;
    }
    
  public abstract double graduationGift();
  

  public void displayShots(){
      System.out.println("Nb Shots:" + nb_shots);
  }
  
  public boolean isImmune(){
      return nb_shots == 3;
  }
  
  public void displayName() {
      System.out.println("Absher Name:"+ name);
  }
  
  
}
