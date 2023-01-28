public class Node {
    public Student data;
    public Node next;
    
    public Node(Student s){
        data = s;
        next = null;
    }

    /**
     * @return the data
     */
    public Student getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Student data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
}
