import java.util.ArrayList;
import java.util.List;

public class noOfStringsGtThan5 {

	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<String>();
         list.add("Saket");
         list.add("Saurav");
         list.add("Softwaretestinghelp");
         list.add("Steve");
         list.add("Sophisticated");
         
         long count = list.stream().filter(str -> str.length() > 5).count();
        
         System.out.println("We have " + count + " strings with length greater than 5");
	}

}
