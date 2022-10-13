import java.util.ArrayList;
import java.util.List;

public class sumList {

	public static void main (String[] args) {
		 
		List <Integer>	list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(12);
		list.add(15);
		int sum = list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println("The sum of Numbers is : "+sum);
}
}
