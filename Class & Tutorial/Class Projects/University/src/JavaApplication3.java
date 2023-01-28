import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication3 {

    public static void main(String args[]) {
        try{ 
            a();
        }
        catch(Exception e){
            System.out.println("ArithmeticException in main()");
            e.printStackTrace();
        }
    }

    public static void a() throws Exception {
    
           b();
        
    } 

    public static void b() throws Exception   {
        
           try{
               c(10,-1);
           }
           catch(ArithmeticException e){
            System.out.println("ArithmeticException in B:" + e.getMessage());
               
           }
          
    
    }

    public static void c(int x, int y) throws Exception    {
      int z=-1;
        try {
            if(y < 0)
                throw new  Exception("cant divide  by - number");
            z = x / y;
            System.out.println("z: " + z);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }  
        
        System.out.println("End of c()");

    }
      
      
    public static void printArr(int a[], int start, int end) {
        if (start == end) {
            return;
        } else {
            System.out.println(a[start]);
            printArr(a, start + 1, end);

        }

    }

    public static int sumArr(int a[], int start, int end) {
        if (start == end - 1) {
            return a[start];
        }
        return a[start] + sumArr(a, start + 1, end);

    }

    public static int search(int a[], int start, int end, int target) {
        if (start == end) {
            return 0;
        }
        if (a[start] == target) {
            return 1 + search(a, start + 1, end, target);
        } else {
            return 0 + search(a, start + 1, end, target);
        }

    }

    public static boolean isSorted(int a[], int start, int end) {
        if (start == end - 1) {
            return true;
        }
        return a[start] < a[start + 1] && isSorted(a, start + 1, end);

    }

    public static int sum(int n, int m) {
        if (m == 1) {
            return n;
        } else {
            return n * sum(n, m - 1);
        }

    }

    public static void A(int x) {
        if (x == 0) {

        } else {
            System.out.println(x);
            B(x - 1);
            System.out.println(" I am A()");
        }
    }

    public static void B(int x) {
        if (x == 0) {
            return;
        } else {
            System.out.println(x);
            C(x - 1);
            System.out.println(" I am B()");
        }
    }

    public static void C(int x) {
        if (x == 0) {
            return;
        } else {
            System.out.println(x);
            System.out.println(" I am C()");
        }
    }
}
