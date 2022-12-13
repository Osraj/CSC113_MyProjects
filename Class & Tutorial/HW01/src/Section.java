public class Section {
    public String courseName;
    public int size;
    public Student[] studentList;
    public int numStu;

    public Section(String name, int size) {
        courseName = name;
        this.size = size;
        studentList = new Student[size];
        numStu = 0;
    }

    public boolean isFull(){
        if (numStu==size)
            return true;
        return false;
    }

    public boolean addStudent(Student s){
        if (isFull()){
            System.out.println("Section is Full!!");
            return false;
        }
        studentList[numStu++] = s;
        return true;
    }

    public int search(int id){
        for(int i=0; i<numStu; i++)
            if(studentList[i].id == id)
                return i;
        return -1;
    }

    public void removeStudent(int id){
        int index = search(id);
        if(index == -1)
            System.out.println("This student is not in this section");
        else{
            studentList[index] = studentList[numStu-1];
            numStu--;
        }
    }

    public int countMoreThan(double g){
        int counter = 0;
        for(int i=0; i<numStu; i++)
            if(studentList[i].gpa > g)
                counter++;
        return counter;
    }

    public Student maxStudent(){
        Student maxStu = studentList[0];
        for(int i=1; i<numStu; i++) {
            if (studentList[i].gpa > maxStu.gpa)
                maxStu = studentList[i];
        }
        return maxStu;
    }

    public void display(){
        System.out.println("Section Name: " + courseName);
        System.out.println("Section Size: " + size);
        System.out.println("Students Info: ");
        for(int i=0; i<numStu; i++)
            studentList[i].dispaly();
    }

    public double avgSection(){
        double total = 0;
        for(int i=0; i<numStu; i++)
            total += studentList[i].gpa;
        double avg = total/numStu;
        return avg;
    }

    public void secondMaxStudent(){
        if(numStu == 0)
            System.out.println("No student in this section");
        else if(numStu == 1)
            System.out.println("There is only one student in this section");
        else if(numStu == 2){
            if (studentList[0].gpa == studentList[1].gpa)
                System.out.println("There are only two student in this section and both of them have the same gpa " + studentList[0].gpa);
            else if (studentList[0].gpa > studentList[1].gpa)
                System.out.println("The second highest gpa is " + studentList[1]);
            else
                System.out.println("The second highest gpa is " + studentList[0]);
        }
        else{
            Student firstStu;
            Student secondStu;

            if(studentList[0].gpa > studentList[1].gpa){
                firstStu = studentList[0];
                secondStu = studentList[1];
            }
            else{
                firstStu = studentList[1];
                secondStu = studentList[0];
            }
            for(int i=2; i<numStu; i++){
                if(studentList[i].gpa>firstStu.gpa)
                    firstStu = studentList[i];
                else if (studentList[i].gpa<firstStu.gpa && studentList[i].gpa>secondStu.gpa)
                    secondStu = studentList[i];
            }
            System.out.println("These are the info of the Second highest Student in this section");
            secondStu.dispaly();
        }
    }

    public void displayInReverse(){
        System.out.println("Section Name: " + courseName);
        System.out.println("Section Size: " + size);
        System.out.println("Students Info: ");
        for(int i=numStu; i>=0; i--)
            studentList[i].dispaly();
    }

    public int addStudent(Student[] list2){
        int counterOfAddedStu = 0;
        for(int i=0; i<list2.length; i++){
            for(int j=0; j<numStu; j++){
                if (list2[i].name.equalsIgnoreCase(studentList[j].name)
                && list2[i].id == studentList[j].id
                && list2[i].gpa == studentList[j].gpa){
                    this.addStudent(list2[i]);
                    counterOfAddedStu++;
                }
            }
        }
        return counterOfAddedStu;
    }



}
