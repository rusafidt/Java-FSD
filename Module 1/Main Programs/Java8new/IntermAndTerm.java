import java.util.Arrays;

public class IntermAndTerm {

	public static void main(String[] args) {
		
		System.out.println("Intermediate Operation wont execute");
		Arrays.stream(new int[] {0,1}).map(i -> {
			System.out.println(i);
			return i;  //no terminal operation so wont execute
		});
		

		System.out.println("Intermediate Operation wont execute");
		Arrays.stream(new int[] {0,1}).map(i -> {
			System.out.println(i);
			return i;  //no terminal operation so wont execute
		}).sum();
	}

}
