public class LinkedList {

    public Node head;
    
 public LinkedList(){
     head = null;
 }   
 
 public boolean isEmpty(){
     return head == null;
 }
 
   public void addAtFirst(Student s){
       Node  n = new Node(s);
       if(isEmpty())
           head = n;
       else {
           n.next = head;
            head = n; 
       } 
       
   } 
   
   public void addAtEnd(Student s ){
       Node n = new Node(s);
       if(isEmpty())
           addAtFirst(s);
       else {
           Node temp = head;
           while(temp.next != null){
               temp = temp.next;
           }
           temp.next = n;

       }
  
   }
   
   public Student removeAtFirst(){
       if(isEmpty())
           return null;
       Node temp = head;
       head = head.next;
       return temp.data;
   }
   
   public void display(){
       Node temp = head;
       while(temp != null){
           System.out.println(temp.data.name);
           temp = temp.next;
       }
   }
    
}
