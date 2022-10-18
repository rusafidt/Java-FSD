import java.util.Scanner;


class Division
{
public String divideTwoNumbers(int n1,int n2)
{
     try
        {
            int d=(n1/n2);
            System.out.print("The answer is "+d);
        }
        catch(ArithmeticException e)
        {
            System.out.print("\nDivide by zero is not possible");
        }
     finally
     {
         System.out.println("Thanks for using the application.");
     }
   return null;
}
}
public class dividetwonumbers{

  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Division p=new Division();
        System.out.print("\nEnter first number :");
        int a=sc.nextInt();
        System.out.print("Enter second number :");
        int b=sc.nextInt();
        p.divideTwoNumbers(a, b);
  }

}