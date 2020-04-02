import java.util.Calendar;
import java.util.GregorianCalendar;

public class JFood
{
    public JFood()
    {
        
    }
    
    public static void main(String[] args) {
  
    Location location2 = new Location ("Curup", "Bengkulu", "daerah");
    Seller seller1 = new Seller (2, "Zafran", "zafran@gmail.com", "085803324064",location2);
    Promo promo2 = new Promo (1, "123", 5000, 20000, true); 
    Food food1 = new Food (1,"Nasi Ayam", seller1, 15000, FoodCategory.RICE);
    Food food2 = new Food (2,"Nasi Goreng", seller1, 45000, FoodCategory.RICE);
      
        
    Calendar call = new  GregorianCalendar(2020,3,19);    
         
    Customer customer1 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98");  
    Customer customer2 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98",new GregorianCalendar(2020, 1, 2));  
    Customer customer3 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98");  
    
    customer1.setEmail("aufa.aydan@gmail.com");
    customer1.setPassword("Aufa98");
    
    CashInvoice  invoice4 = new  CashInvoice(4, food1, customer2, InvoiceStatus.FINISHED, 1000);
    CashlessInvoice  invoice5 = new  CashlessInvoice(5, food2, customer2, InvoiceStatus.FINISHED, promo2);
       
       invoice4.setTotalPrice();
       invoice5.setTotalPrice();
       System.out.println(invoice4.toString());
       System.out.println(invoice5.toString());
    
    
}
      
}

