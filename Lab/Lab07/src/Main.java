import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++)
            arr[i] = -1;
        int choice;

        // The Menu
        do {
            System.out.println("----------------------------------");
            System.out.println("1) Fill a new array.");
            System.out.println("2) Count elements.");
            System.out.println("3) Count sum of elements.");
            System.out.println("4) Print the array.");
            System.out.println("5) Print the array in reverse.");
            System.out.println("6) Quit.");
            System.out.println("----------------------------------");
            System.out.print("Enter a choice: ");
            choice = input.nextInt();

            // Using the User Input Choose what Method to run
            switch(choice) {
                case 1:
                    for(int i = 0; i < arr.length; i++)
                        arr[i] = -1;
                    int x = ArrayRecursor.fill(arr);
                    System.out.println("You entered " + x + " numbers.");
                    break;
                case 2:
                    System.out.println("Number of elements is: " + ArrayRecursor.count(arr));
                    break;
                case 3:
                    System.out.println("The sum of elements is: " + ArrayRecursor.sum(arr));
                    break;
                case 4:
                    ArrayRecursor.printArray(arr);
                    break;
                case 5:
                    ArrayRecursor.printReverse(arr);
                    break;
                case 6:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }while(choice != 6);
    }

}
