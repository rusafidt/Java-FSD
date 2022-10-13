package matrix;

public class CheckTwoMatricesAreEqual {

	public static void main(String[] args) {

		
		int row1, col1, row2, col2;
		
		int a[][]={
				{1,3,4},
				{2,4,3},
				{3,4,5}
				};    
		int b[][]={
				{1,3,4},
				{2,4,3},
				{3,4,5}
				}; 
		
		
		row1 = a.length;
		col1 = a[0].length;
		
		row2 = b.length;
		col2 = b[0].length;
		
		boolean flag = true ;
		
		//checking if dimension is equal
		if (row1 != row2 || col1!=col2) {
			System.out.println("Matrice Dimensions are not equal");
		}
		
		//checking elements in matrix are equal
		else {
			for (int i=0; i<row1 ; i++) {
				for (int j=0; j<col1 ; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
		}
		if (flag) {
			System.out.println("Matrices are equal");
		}
		else {
			System.out.println("Matrices are not equal");
		}
	}

}
