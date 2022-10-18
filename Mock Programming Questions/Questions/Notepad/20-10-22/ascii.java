import java.util.Scanner;

public class ascii {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digits :");
        int A =sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
	int D=sc.nextInt();

	System.out.println(A + " - " + (char)A);
	System.out.println(B + " - " + (char)B);
	System.out.println(C + " - " + (char)C);
	System.out.println(D + " - " + (char)D);

    }

}