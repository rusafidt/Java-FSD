package hello;

interface Manic
	{
	    public void pro();
	}
public class lambda1 {

	   public static void main(String[] args) {
	        int a=5;
	        Manic m=()->
	        {
	        System.out.println("hello"+a);    
	        };
	        m.pro();
	   }
}