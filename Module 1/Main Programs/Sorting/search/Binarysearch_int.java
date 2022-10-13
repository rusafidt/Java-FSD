package search; 
  
public class Binarysearch_int {  
   public static void main(String args[])  
   {  
      String arr[] = {"a", "b", "c", "d", "r"};
      String item = "f";
      int l=0, h=arr.length-1;
      int mid = (l+h)/2;
      
      while (l<=h) {
    	  if (arr[mid]==item) {
    		  System.out.println("Item (" + item +") found at " + mid);
    		  break;
    	  }
    	  else if (item.compareTo(arr[mid])<0) {
    		  h=mid-1;
    	  }
    	  else {
    		  l=mid+1;
    	  }
    	  mid = (l+h)/2;
    	 
      }
      if(l>h) {
		  System.out.print("Item not found");
	  }
   }
}