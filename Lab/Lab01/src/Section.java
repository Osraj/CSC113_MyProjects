public class Section {
    private Student arrStu[];
    private int nbStu;

    public Section(int size){
        arrStu = new Student[size];
        nbStu = 0;
    }

    public boolean addStudent(Student st){
        if(nbStu == arrStu.length)
            return false;
        arrStu[nbStu++] = st;
        return true;
    }

    public int searchStu(int id){
        for(int i=0; i<nbStu; i++)
            if (arrStu[i].getStudentId() == id)
                return i;
        return -1;
    }

    public boolean deleteStu(int id){
        int index = searchStu(id);
        if(index == -1)
            return false;
        arrStu[index] = arrStu[nbStu-1];
        arrStu[nbStu-1] = null;
        nbStu--;
        return true;
    }

    public void displayAll(){
        for(int i=0; i<nbStu; i++)
            arrStu[i].display();
    }

    public void display(int index){
        if(index>=0 && index<nbStu)
            arrStu[index].display();
        System.out.println("Invalid index");
    }

    public void display(String name){
        for(int i=0; i<nbStu; i++)
            if(arrStu[i].getStudentName().equalsIgnoreCase(name))
                arrStu[i].display();
    }

    public void displaySameAs(Student st){
        for(int i=0; i<nbStu; i++){
            //if(arrStu[i].equals(st))
            if(arrStu[i].getStudentName().equalsIgnoreCase(st.getStudentName())
            && arrStu[i].getStudentAge() == st.getStudentAge()
            && arrStu[i].getStudentGender().equalsIgnoreCase(st.getStudentGender()))
                arrStu[i].display();
        }
    }

    public Student searchFirst(String name){
        for(int i=0; i<nbStu; i++){
            if(arrStu[i].getStudentName().equalsIgnoreCase(name))
                return arrStu[i];
        }
        return null;
    }

    public Student searchLast(String name){
        for(int i=nbStu-1; i>=0; i--){
            if(arrStu[i].getStudentName().equalsIgnoreCase(name))
                return arrStu[i];
        }
        return null;
    }

    public Student[] getStudents(int age){
        // for finding the correct size before making the tempList
        int size = 0;
        for(int i=0; i<nbStu; i++)
            if(arrStu[i].getStudentAge() < age)
                size++;

        // using the size we found to make the tempList
        Student[] tempList = new Student[size];
        int counter=0;
        for(int i=0; i<nbStu; i++){
            if(arrStu[i].getStudentAge() < age)
                tempList[counter++] = arrStu[i];
        }
        return tempList;
    }

}
