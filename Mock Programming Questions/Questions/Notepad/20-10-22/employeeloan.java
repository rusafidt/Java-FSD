import java.util.Scanner;

abstract class Employee
{
    protected int employeeid;
    public int getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    protected String employeeName;
    protected double salary;
    
    public abstract void calculateSalary();
    
    public Employee(int employeeid,String employeeName)
    {
        this.employeeid=employeeid;
        this.employeeName=employeeName;
        
    }
}

class  PermenantEmployee extends Employee {
	
    private double basicPay;

   public double getBasicPay() {
        return basicPay;
    }
   public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
   
    public PermenantEmployee(int employeeid,String employeeName,double basicPay)
    {
        super(employeeid,employeeName);
        this.basicPay=basicPay;
    }
    public void calculateSalary()
    {
        salary=basicPay-(basicPay*0.12);
    }
    
}
class TemporaryEmployee extends Employee
{
    private int hoursWorked;
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public int getHourlyWages() {
        return hourlyWages;
    }
    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }
    private int hourlyWages;
    public TemporaryEmployee(int employeeid,String employeeName,int hoursWorked,int hourlyWages)
    {
        super(employeeid,employeeName);
        this.hoursWorked=hoursWorked;
        this.hourlyWages=hourlyWages;
    }
    public void calculateSalary()
    {
        salary= hoursWorked*hourlyWages;
    }
}



class Loan
{
    public double calculateLoanAmount(Employee employeeObj)  {
       return (10*(employeeObj.salary))/100;
    }
    
}


public class employeeloan {

   public static void main(String[] args) {
        Loan l=new Loan();
        
       Scanner sc=new Scanner(System.in);
        System.out.println("\n1.Permenent employee");
        System.out.println("2.Temporary employee");
        System.out.print("Enter Choice : ");
        int c=sc.nextInt();
        
        switch(c)
        {
        case 1:    System.out.print("\nEnter Employee Id : ");
        int id=sc.nextInt();
        System.out.print("Enter Employee name : ");
        String name=sc.next();
        System.out.print("Enter Basic pay : ");
        double b=sc.nextDouble();
        PermenantEmployee p=new PermenantEmployee(id,name,b);
        p.calculateSalary();
         System.out.println(l.calculateLoanAmount(p));
        break;
        
        case 2:    System.out.print("\nEnter Employee Id : ");
        int id1=sc.nextInt();
        System.out.print("Enter Employee name : ");
        String name1=sc.next();
        System.out.print("Enter hours worked : ");
        int h=sc.nextInt();
        System.out.print("Enter hourly wages : ");
        int h1=sc.nextInt();
        TemporaryEmployee p1=new TemporaryEmployee(id1,name1,h,h1);
        p1.calculateSalary();
        System.out.println(l.calculateLoanAmount(p1));
        break;
        default: System.out.println("Invalid");
        
        }
    }



}