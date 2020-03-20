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
    
    CashInvoice cashinvoice = new cashinvoice (1, food, customer1, invoiceStatus);
    CashlessInvoice cashlessinvoice = new cashlessinvoice (1, food, customer1, invoiceStatus);
    
    System.out.println(cashinvoice.toString());
    System.out.println(cashlessinvoice.toString());
    
    
}
      
}

