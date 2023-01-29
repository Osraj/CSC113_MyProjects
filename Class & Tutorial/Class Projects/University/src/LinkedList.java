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
   
   public Student removeAtLast(){
       if(isEmpty())
           return null;
       if(head.next == null)
           removeAtFirst();
       
       Node current = head;
       Node prev = null;
       while(current.next != null){
           prev = current;
           current = current.next;
       }
       prev.next = null;
 
       return current.data;
   }
   
   public Student removeTarget(String n){
       if(isEmpty())
           return null;
       if(head.data.name.equalsIgnoreCase(n))
           return removeAtFirst();
       
       Node curr= head;
       Node prev = null;
       while(curr != null && !curr.data.name.equalsIgnoreCase(n)){
           prev = curr;
           curr = curr.next;
       }
       if(curr == null ){
           System.out.println("EOL");
           return null;
       }
       else{
       prev.next = curr.next;
       return curr.data;
       }
       

   }
   
   public LinkedList removeALLTarget(String n){
       Student s;
       LinkedList result = new LinkedList();
       do{
          s = removeTarget(n);
          if(s != null)
          result.addAtEnd(s);
       }while( s!= null);
         
       return result;
   }
   
   public void display(){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.data.name+"->");
           temp = temp.next;
       }
       System.out.println("");
   }
  
   
   
   
      public LinkedList getStudentsAboveTwo(){
         LinkedList result = new LinkedList();
          Node temp = head; 
          while(temp != null)
          {
              if(temp.data.gpa > 2)
               result.addAtEnd(temp.data);
              temp = temp.next;
          }
       return null;
   }
      
      
}
