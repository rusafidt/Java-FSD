package hello;

import java.util.Collections;
import java.util.LinkedList;


public class foreach1 {

	
   public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<Integer>();  //List
        l.add(1);
        l.add(2);
        l.add(3);
        Collections.reverse(l);
         
        l.forEach(i->System.out.println(i));
    }

}
