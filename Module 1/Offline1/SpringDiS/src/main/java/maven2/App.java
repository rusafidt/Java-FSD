package maven2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("person.xml");
    	System.out.println("Hello Guyss. !!");
    	
    	person c = context.getBean("person", person.class);
    	c.display();
    }
}
