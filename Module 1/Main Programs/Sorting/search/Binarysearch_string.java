package search; 
  
public class Binarysearch_string {  
   public static void main(String args[])  
   {  
      int arr[] = {1, 2, 45, 69, 89};
      int item = 87;
      int l=0, h=arr.length-1;
      int mid = (l+h)/2;
      
      while (l<=h) {
    	  if (arr[mid]==item) {
    		  System.out.println("Item (" + item +") found at " + mid);
    		  break;
    	  }
    	  else if (arr[mid] < item) {
    		  l=mid+1;
    	  }
    	  else {
    		  h=mid-1;
    	  }
    	  mid = (l+h)/2;
    	 
      }
      if(l>h) {
		  System.out.print("Item not found");
	  }
   }
}