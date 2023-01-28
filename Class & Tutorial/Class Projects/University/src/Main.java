public class Main {

    public static void main(String[] args) {
        Student s1, s2, s3, s4, s5, next;
        s1 = new MedicalStudent("A", 3, 3, 3);
        s2 = new ScienceStudent("B", 4, 4, 4);
        s3 = new ScienceStudent("C", 5, 5, 5);
        s4 = new MedicalStudent("D", 2, 2, 2);
        s5 = new MedicalStudent("E", 1, 1, 1);
      
        
        LinkedList l = new LinkedList();
       l.addAtFirst(s1);
       Student s = l.removeAtFirst();
         System.out.println("   ------------------ ");

        l.display();
        
        
        
        
        
        
        
        /* Student s1, s2, s3, s4, s5, next;
        s1 = new MedicalStudent("A", 3, 3, 3);
        s2 = new ScienceStudent("B", 4, 4, 4);
        s3 = new ScienceStudent("C", 5, 5, 5);
        s4 = new MedicalStudent("D", 2, 2, 2);
        s5 = new MedicalStudent("E", 1, 1, 1);
        s1.next = s2;
       s2.next = s3;
       s3.next = s4;
       s4.next = s5;
 
       s2 = s3 = s4 = s5 = null;   
        Student temp = s1;
        int size = 0;
       while(temp != null){
            if(temp.id == 2)
                System.out.println(temp.name);
           temp = temp.next;
          
       }
       
        
        */
        
        
        /*String path = "C:\\Users\\Admin\\Desktop\\java\\data";
       File f = new File(path);
        Section sec  = new Section("CSC", 3);
        System.out.println("End");
       Student m1 = new  MedicalStudent("A",3,3,3);
       Student s1 = new ScienceStudent("B",4,4,4);
       Student s2 = new ScienceStudent("C",4,4.5,4);
       
      
       sec.addStudentComp(m1);
       sec.addStudentComp(s1);
       sec.addStudentComp(s2);

        try {
          //  sec.readFromFile(path);
          //  sec.display();
          
        }  catch (Exception ex) {
            System.out.println("IOException");
            ex.printStackTrace();
        }
         */
    }

}
