public class Section {

    public String courseName;
    public Student[] list;
    public int size;
    public int nb;
     
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
        return nb == size;
    }

    public boolean isEmpty() {
        return nb == 0;
    }

    public boolean addStudentComp(Student s) {
        if (isFull()) {
            System.out.println("Section is Full");
            return false;
        } else {
             if(s instanceof MedicalStudent)
                 list[nb] = new MedicalStudent((MedicalStudent) s);
             else if (s instanceof ScienceStudent )
                 list[nb] = new ScienceStudent((ScienceStudent) s);
                
             else
                 list[nb] = new Student(s);
            nb++;
            return true;

        }

    }

    public boolean addStudentAgg(Student s) {
        if (isFull()) {
            System.out.println("Section is Full");
            return false;
        } else {
            list[nb] = s;
            nb++;
            return true;

        }

    }

    public int search(int id) {
        int index = -1;
        for (int i = 0; i < nb; i++) {
            if (list[i].id == id) {
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
            list[index] = list[nb - 1];
            nb--;

        }
    }

    public int countMoreThan(double g) {

        int count = 0;
        for (int i = 0; i < nb; i++) {
            if (list[i].gpa > g) {
                count++;
            }
        }
        return count;

    }

    public Student maxStudent() {
        Student max = list[0];
        for (int i = 1; i < nb; i++) {
            if (list[i].gpa > max.gpa) {
                max = list[i];
            }

        }

        return max;

    }

    public void display() {
        System.out.println("Section name:" + courseName);
        System.out.println("Size: " + size);
        System.out.println("nb: " + nb);
        System.out.println("Students info: ");
        for (int i = 0; i < nb; i++) {
            list[i].dispaly();
        }

    }

}
