package matrix;

public class DisplayUpperTriangularMatrix {

	public static void main(String[] args) {

		
		int row1, col1;
		
		int a[][]={
				{1,3,4},
				{2,4,3},
				{3,4,5}
				};    	
		
		row1 = a.length;
		col1 = a[0].length;
		
		if (row1 != col1) {
			System.out.println("Matrix should be a square matrix");
		}
		else {
			System.out.println("Upper Triangular Matrix : ");
			
			for (int i = 0; i < row1 ; i++) {
				for (int j = 0; j < col1 ; j++) {
					if (i > j) {
						System.out.print("0 ");
					}
					else {
						System.out.print(a[i][j] + " ");
					}
				}
				System.out.println();
			}
		}
	}

}
