import java.util.Random;

public class RandNos_ForEach {

	public static void main(String[] args) {
		
		Random r = new Random();
		r.ints().limit(5).forEach(System.out::println); //limit set to 5 to print random numbers
	}

}
