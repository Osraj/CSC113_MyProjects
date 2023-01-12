// Osamah Sarraj, 443101217, Lab09

public class Test {
    public static void main(String[] args) {
        PartTimeEmp e1 = new PartTimeEmp("Ahmad", 111, 6, 150);
        PartTimeEmp e2 = new PartTimeEmp("Omar", 222, 10, 200);
        PartTimeEmp e3 = new PartTimeEmp("Khalid", 333, 9, 150);
        FullTimeEmp e4 = new FullTimeEmp("Mohammed", 444, 5000);
        FullTimeEmp e5 = new FullTimeEmp("Ali", 555, 10000);
        try {
            Company c = new Company("KSU", 4);
            try {
                c.addEmployee(e1);
                System.out.println("Added 1 employee");
                c.addEmployee(e2);
                System.out.println("Added 2 employees");
                c.addEmployee(e3);
                System.out.println("Added 3 employees");
                c.addEmployee(e4);
                System.out.println("Added 4 employees");
                c.addEmployee(e5);
                System.out.println("Added 5 employees");
            } catch (IllegalStateException e) {
                System.out.println(e);
            }
            c.displayAll();
            try {
                c.deleteEmployee("Abdulrahman");
                System.out.println("Deleted successfully");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("Yearly pay of mohammed: " + c.getYearlyPay("Mohammed"));
            try {
                System.out.println("Average pay for part time employees: " +
                        c.calAvgPayForPartTime());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        }
        System.out.println("Bye");
    }
}