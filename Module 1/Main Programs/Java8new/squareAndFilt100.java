import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class squareAndFilt100 {

	public static void main(String[] args) {
		
		List <Integer>	list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(12);
		list.add(15);
		
		OptionalDouble av = list.stream().mapToInt(i->i*i).filter(n->(n>100)).average();
		System.out.println("The average of Numbers is : "+av);
		}
	}