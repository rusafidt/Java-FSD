 import java.util.*;


public class loginmodule {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter your ID : ");
    String c=sc.nextLine();

    if(c.charAt(0)=='G' &&c.charAt(1)=='B'&&c.charAt(2)=='L')  {
    	System.out.println("\nLogin success");
    }

    else {
    System.out.println("\nIncorrect ID");
    }

    }
    }