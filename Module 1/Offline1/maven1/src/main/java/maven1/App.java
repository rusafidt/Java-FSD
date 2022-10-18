package maven1;

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
    		    new ClassPathXmlApplicationContext("applicationContext.xml");
    	System.out.println("Hello Guyss. !!");
    	
    	car c = context.getBean("car", car.class);
    	c.speed();
    	c.price();
    	
    	car c1 = context.getBean("car1", car.class);
    	c1.speed();
    	c1.price();
    }
}
