public class ScienceStudent extends Student{
public int  mathHours;
    
    public ScienceStudent(){
        
    }
    public ScienceStudent (ScienceStudent s){
        super(s);
        mathHours = s.mathHours;
    }
    
}
