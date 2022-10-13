package matrix;

public class FrequencyofOddAndEven {

	public static void main(String[] args) {

		
		int row1, col1;
		int odd = 0,even = 0;
		
		int a[][]={
				{1,3,4},
				{2,4,3},
				{3,4,5}
				};    	
		
		row1 = a.length;
		col1 = a[0].length;
		
		
			for (int i = 0; i < row1 ; i++) {
				for (int j = 0; j < col1 ; j++) {
					
					//even
					if (a[i][j] %2 ==0) {
						even++;
					}
					else {
						odd++;
					}
				}
			
			}
			System.out.println("Frequency of odd numbers : " + odd);
			
			System.out.println("\nFrequency of even numbers : " + even);

		}
	
	}


