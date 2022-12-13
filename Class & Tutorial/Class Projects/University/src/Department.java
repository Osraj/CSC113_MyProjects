public class Department {

    public String depName;
    public Section sections[];
    public int nbSections;

    public Department(String n) {
        depName = n;
        sections = new Section[50];
        nbSections = 0;
    }

    public void addSection(Section s) {
        sections[nbSections++] = new Section(s);
    }

    public void display() {
        for (int i = 0; i < nbSections; i++) {
            sections[i].display();
        }

    }

    public Student[] MaxInEachSection() {
        Student maxList[] = new Student[nbSections];
        for (int i = 0; i < nbSections; i++) {
            maxList[i] = sections[i].maxStudent();

        }
        return maxList;
    }

    public Student MaxInDept() {
        Student maxList[] = MaxInEachSection();
        Student max = maxList[0];
        for (int i = 0; i < nbSections; i++) {
            if (maxList[i].gpa > max.gpa) {
                max = maxList[i];
            }

        }
        return max;
    }

}
