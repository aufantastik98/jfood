import java.util.Calendar;
import java.util.GregorianCalendar;

public class JFood
{
    
    public static void main(String[] args) {
  
        
        
    Customer customer1 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98", new GregorianCalendar(2020, 1, 2));  
    Customer customer2 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98",2020, 1, 2);  
    Customer customer3 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98");  
    
    customer1.setEmail("aufa.aydan@gmail.com");
    customer1.setPassword("Aufa98");
    
    System.out.println(customer1.toString());
    System.out.println(customer2.toString());
    System.out.println(customer3.toString());
}
      
}

