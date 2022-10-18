import java.util.Scanner;

public class arraysum{

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a=new int[10];
        int s=0;
        System.out.print("Enter the no.of elements : ");
        int n=sc.nextInt();
	System.out.println();
        
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element " + (i+1) +" : ");
            a[i]=sc.nextInt();
        }
	
	System.out.println();
        for(int i=0;i<n;i++)
        {
            s+=a[i];
            System.out.print(s + " ");
        }
    }



}