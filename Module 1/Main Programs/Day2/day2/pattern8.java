package day2;

public class pattern8 {

	public static void main(String[] args) {
			
			for(int i=4; i>0; i--) {
				int num = i;
				while (4-num!=0) {
					System.out.print(" ");
					num++;
				}
				for (int j=i; j>1; j--) {
					System.out.print(1);
					System.out.print(0);

				}
				System.out.print(1);
				System.out.println(" ");

	}

}
}
