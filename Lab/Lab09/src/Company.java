// Osamah Sarraj, 443101217, Lab09

public class Company {
    private String name;
    private Employee[] arrEmployee;
    private int nbEmployee;

    public Company(String name, int size) throws NegativeArraySizeException{
        if (size<0)
            throw new NegativeArraySizeException("Size is negative");
        this.name = name;
        arrEmployee = new Employee[size];
        nbEmployee = 0;
    }

    public void displayAll(){
        System.out.println("Company Name: " + name);

        for(int i=0; i<nbEmployee; i++)
            arrEmployee[i].display();
    }

    public void addEmployee(Employee e){
        if(nbEmployee == arrEmployee.length)
            throw new IllegalStateException("Array is Full");

        if(e instanceof PartTimeEmp)
            arrEmployee[nbEmployee++] = new PartTimeEmp( (PartTimeEmp) e);

        if(e instanceof FullTimeEmp)
            arrEmployee[nbEmployee++] = new FullTimeEmp( (FullTimeEmp) e);
    }

    public int searchName(String name){
        for(int i = 0; i<nbEmployee; i++){
            if(arrEmployee[i].getName().equals(name))
                return i;
        }
        return -1;
    }

    public void deleteEmployee(String name) throws IndexOutOfBoundsException{
        int index = searchName(name);
        if(index == -1)
            throw new IndexOutOfBoundsException("Employee was not found");

        arrEmployee[index] = arrEmployee[nbEmployee];
        arrEmployee[nbEmployee--] = null;
    }

    public double getYearlyPay(String name){
        int index = searchName(name);
        if(index == -1)
            return 0;
        return arrEmployee[index].calculatePay() * 12;
    }

    public double calAvgPayForPartTime() throws ArithmeticException{
        int count = 0;
        double sum = 0;
        for(int i=0; i<nbEmployee; i++){
            if(arrEmployee[i] instanceof PartTimeEmp){
                count++;
                sum+= arrEmployee[i].calculatePay();
            }
        }
        if(count == 0)
            throw new ArithmeticException("There are no PartTime Employee");

        return (sum/count);
    }
}
