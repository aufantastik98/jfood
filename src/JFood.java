import java.util.Calendar;
import java.util.GregorianCalendar;

public class JFood
{
    public JFood()
    {
        
    }
    
    public static void main(String[] args) {
  
    Location location2 = new Location ("Jakarta", "Jawa", "Ibu Kota");
    //Seller seller1 = new Seller (2, "Zafran", "zafran@gmail.com", "085803324064",location2);
   // Promo promo2 = new Promo (1, "123", 5000, 20000, true);
    //Food food1 = new Food (1,"Nasi Ayam", seller1, 15000, FoodCategory.RICE);
    //Food food2 = new Food (2,"Nasi Goreng", seller1, 45000, FoodCategory.RICE);
        DatabasePromo.addPromo(new Promo(1, "BIMOKEREN", 5000, 20000, true));

        DatabaseSeller.addSeller(new Seller(1, "Aufa ", "aufa.dhiya@ui.ac.id", "081908921959", location2));
        DatabaseCustomer.addCustomer(new Customer(1, "Ailsa", "ailsa.syaffa@ui.ac.id", "Ailsa1998", 1999, 5, 3));
        DatabaseCustomer.addCustomer(new Customer(2, "Ahya", "ahya.amaniy@ui.ac.id", "Ahya2001", 2001, 6, 27));
        DatabaseCustomer.addCustomer(new Customer(3, "Anissa", "annisa@ui.ac.id", "Annisa2001", 2001, 5, 7));
        System.out.println(DatabaseCustomer.getCustomerDatabase());

        DatabaseFood.addFood(new Food(1, "Chicken", DatabaseSeller.getSellerById(1), 20000, FoodCategory.RICE));
        DatabaseFood.addFood(new Food(2, "Bebek", DatabaseSeller.getSellerById(1), 18000, FoodCategory.RICE));
        DatabaseFood.addFood(new Food(3, "Ikan", DatabaseSeller.getSellerById(1), 19200, FoodCategory.RICE));
        System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.RICE));

        // Calendar call = new  GregorianCalendar(2020,3,19);
         
    //Customer customer1 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98");
    //Customer customer2 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98",new GregorianCalendar(2020, 1, 2));
    //Customer customer3 = new Customer (1, "Aufa", "aufa@gmail.com", "Aufa98");
    
   // customer1.setEmail("aufa.aydan@gmail.com");
   // customer1.setPassword("Aufa98");
    
    //CashInvoice  invoice4 = new  CashInvoice(4, food1, customer2, InvoiceStatus.FINISHED, 1000);
    //CashlessInvoice  invoice5 = new  CashlessInvoice(5, food2, customer2, InvoiceStatus.FINISHED, promo2);
       
     //  invoice4.setTotalPrice();
    //   System.out.println(invoice4.toString());
      // System.out.println(invoice5.toString());
    
    
}
      
}

