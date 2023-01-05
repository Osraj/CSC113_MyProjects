// Osamah Solaiman Sarraj, 443101217, Lab07_22-23_2nd-Trimester

import java.util.Scanner;
public class ArrayRecursor {

    public static int fill(int[] arr){
        return fill(arr, 0);
    }

    private static int fill(int[] arr, int start){
        if(start == arr.length)
            return 0;

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter number " + (start+1) + ": " );
        int num = kb.nextInt();

        if(num == -1)
            return 0;

        arr[start] = num;
        return 1 + fill(arr, start+1);
    }

    public static int count(int[] arr){
        return count(arr, 0);
    }

    private static int count(int[] arr, int start){
        if (start == arr.length || arr[start] == -1)
            return 0;

        return 1 + count(arr, start+1);
    }

    public static int sum(int[] arr){
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int start){
        if(start == arr.length || arr[start] == -1)
            return 0;

        return arr[start] + sum(arr, start+1);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        printArray(arr, 0);
        System.out.println("]");
    }

    private static void printArray(int[] arr, int start){
        System.out.print(arr[start]);

        if(start+1 != arr.length && arr[start+1] != -1){
            System.out.print(", ");
            printArray(arr, start+1);
        }
    }

    public static void printReverse(int[] arr){
        System.out.print("[");
        printReverse(arr, 0);
        System.out.println("]");
    }

    private static void printReverse(int[] arr, int start){
        if(start+1 != arr.length && arr[start+1] != -1){
            printReverse(arr, start+1);
            System.out.print(", ");
        }
        System.out.print(arr[start]);
    }

}//class
