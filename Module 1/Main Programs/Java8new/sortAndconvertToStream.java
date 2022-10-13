import java.util.Arrays;

public class sortAndconvertToStream {

	public static void main(String[] args) {

		 int arr[] = { 99, 55, 203, 99, 4, 91 };
	        Arrays.parallelSort(arr);
	        
	         
	        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
	        
	}

}
