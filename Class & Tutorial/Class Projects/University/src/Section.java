import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Section {

    private String courseName;
    private Student[] list;
    private int size;
    private int nb;

    public Section(String n, int s) {
        courseName = n;
        size = s;
        nb = 0;
        list = new Student[size];
        //     for(int i=0; i < size; i++)
        //          list[i] = new Student();
    }

    public Section(Section s) {
        courseName = s.courseName;
        size = s.size;
        list = new Student[size];
        for (int i = 0; i < s.nb; i++) {
            addStudentAgg(s.list[i]);

        }

    }

    public boolean isFull() {
        return getNb() == getSize();
    }

    public boolean isEmpty() {
        return getNb() == 0;
    }

    public boolean addStudentComp(Student s) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("CANT ADD:" + s.name);

            // System.out.println("Section is Full");
            //return false;
        } else {
            if (s instanceof MedicalStudent) {
                getList()[getNb()] = new MedicalStudent((MedicalStudent) s);
            } else if (s instanceof ScienceStudent) {
                getList()[getNb()] = new ScienceStudent((ScienceStudent) s);
            }

            //else
            //  list[nb] = new Student(s);
            setNb(getNb() + 1);
            return true;

        }

    }

    public boolean addStudentAgg(Student s) {
        if (isFull()) {
            System.out.println("Section is Full");
            return false;
        } else {
            getList()[getNb()] = s;
            setNb(getNb() + 1);
            return true;

        }

    }

    public int search(int id) {
        int index = -1;
        for (int i = 0; i < getNb(); i++) {
            if (getList()[i].id == id) {
                index = i;
            }
        }
        return index;
    }

    public void removeStudent(int id) {

        int index = search(id);
        if (index == -1) {
            System.out.println("Student is not found!");
        } else {
            getList()[index] = getList()[getNb() - 1];
            setNb(getNb() - 1);

        }
    }

    public int countMoreThan(double g) {

        int count = 0;
        for (int i = 0; i < getNb(); i++) {
            if (getList()[i].gpa > g) {
                count++;
            }
        }
        return count;

    }

    public void display() {
        System.out.println("Section name:" + getCourseName());
        System.out.println("Size: " + getSize());
        System.out.println("nb: " + getNb());
        System.out.println("Students info: ");
        for (int i = 0; i < getNb(); i++) {
            getList()[i].display();
        }

    }

    public void displayReverse() {
        for (int i = getNb() - 1; i >= 0; i--) {
            getList()[i].display();
        };

    }

    public Student SecondMax() {
        Student max = maxStudent();

        Student secondMax = new MedicalStudent("", -1, -1, -1);

        for (int i = 0; i < getNb(); i++) {
            if (getList()[i].gpa > secondMax.gpa && getList()[i].gpa != max.gpa) {
                secondMax = getList()[i];
            }
        }
        return null;

    }

    public double avgSection() {
        double sum = 0;
        for (int i = 0; i < getNb(); i++) {
            sum += getList()[i].gpa;
        }
        return sum / getNb();
    }

    public double avgMed() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < getNb(); i++) {
            if (getList()[i] instanceof MedicalStudent) {
                sum += getList()[i].gpa;
                count++;
            }
        }
        return sum / count;

    }

    public Student maxStudent() {
        Student max = getList()[0];
        for (int i = 0; i < getNb(); i++) {
            if (getList()[i].gpa > max.gpa) {
                max = getList()[i];
            }
        }

        return max;
    }

    public MedicalStudent maxMedWithGPA() {
        MedicalStudent max = new MedicalStudent("NoName", -1, -1, -1);
        for (int i = 0; i < getNb(); i++) {
            if (getList()[i] instanceof MedicalStudent) {
                if (getList()[i].gpa > max.gpa) {
                    max = (MedicalStudent) getList()[i];
                }
            }
        }
        return max;
    }

    public MedicalStudent maxMedWithLab() {

        MedicalStudent max = null;
        for (int i = 0; i < getNb(); i++) {
            if (getList()[i] instanceof MedicalStudent) {
                MedicalStudent temp = (MedicalStudent) getList()[i];
                if (max == null || temp.labHours > max.labHours) {
                    max = (MedicalStudent) getList()[i];
                }
            }
        }
        return max;
    }

    public int countMedicalGrad() {
        int count = 0;
        for (int i = 0; i < getNb(); i++) {
            if (getList()[i] instanceof MedicalStudent) {
                if (getList()[i].canGraduate()) {
                    count++;
                }
            }

        }
        return count;
    }

    public void SplitAbove(Student a[], Student b[], double target) {

    }

    public void SplitByMajor(MedicalStudent a[], ScienceStudent b[]) {
        int countM = 0;
        int countS = 0;
        for (int i = 0; i < getNb(); i++) {
            if (getList()[i] instanceof MedicalStudent) {
                a[countM++] = (MedicalStudent) getList()[i];
            } else {
                b[countS++] = (ScienceStudent) getList()[i];
            }

        }
    }

    public boolean isLarger(Section s) {
        if (this.getNb() > s.getNb()) {
            return true;
        }

        return false;
    }

    public Student maxBetween(Section s) {
        Student m1 = this.maxStudent();
        Student m2 = s.maxStudent();
        if (m1.gpa > m2.gpa) {
            return m1;
        } else {
            return m2;
        }
    }

    public void writeToFile(String path, double targetGPA) throws FileNotFoundException, IOException {
        File f = new File(path);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
       for(int i=0; i < getNb(); i++)
           if(getList()[i].gpa >targetGPA )
               oos.writeObject(getList()[i]);
        
        // oos.writeObject(list);
        oos.close();
        fos.close();
        
        
    }
    
    public void readFromFile(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        File f = new File(path);
        FileInputStream fis= new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
      try{
        while(true){
        Student s = (Student) ois.readObject();
            s.display();
            addStudentComp(s);
      }
      }
      catch(EOFException e){
          System.out.println("EOF. Reading is DONE!");
      }
        ois.close();
        fis.close();
        
        
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the list
     */
    public Student[] getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(Student[] list) {
        this.list = list;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the nb
     */
    public int getNb() {
        return nb;
    }

    /**
     * @param nb the nb to set
     */
    public void setNb(int nb) {
        this.nb = nb;
    }

}
