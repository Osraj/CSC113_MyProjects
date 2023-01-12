// Osamah Sarraj, 443101217, Lab09

public class FullTimeEmp extends Employee{
    private int salary;

    public FullTimeEmp(String name, int id, int salary){
        super(name, id);
        this.salary = salary;
    }

    public FullTimeEmp(FullTimeEmp f){
        super(f.getName(), f.getId());
        salary = f.salary;
    }

    public void display(){
        super.display();
        System.out.println(", Salary: " + salary);
    }

    public double calculatePay(){
        return salary*(1-0.09);
    }

    public int getSalary(){
        return salary;
    }
}
