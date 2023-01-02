// Osamah Solaiman Sarraj, 443101217, Lab07_22-23_2nd-Trimester

import java.util.Scanner;
public class ArrayRecursor {

    public static int fill(int[] arr, int start){
        if(start == arr.length)
            return 0;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter number " + start+1 + ": " );
        int num = kb.nextInt();

        if(num == -1)
            return 0;

        arr[start] = num;
        return 1 + fill(arr, start+1);
    }

    public static int count(int[] arr, int start){
        if (start == arr.length)
            return 0;

        if(arr[start] == -1)
            return 0;

        return 1 + count(arr, start+1);
    }


//    public static int sum(int[] arr, int start){}
//    public static void printArray(int[] arr, int start){}
//    public static void printReverse(int[] arr, int start){}

}//class
