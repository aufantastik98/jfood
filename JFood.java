
public class JFood
{
    
    public static void main(String[] args) {
       
    Location location1 = new Location ("Bandung", "Jawa Barat", "Dingin");
   
    Seller seller1 = new Seller (11, "Aufa", "aufa@gmail.com", "081908921959", location1);
    
    Customer customer = new Customer (12, "Aufa", "aufa@gmail.com", "12345","12 Oktober 1998");
   
    Food food = new Food(12345, 19000, "Apel", FoodCategory.COFFEE, seller1);
     
    CashInvoice cashinvoice = new CashInvoice (4, food, "3/3/202", customer, InvoiceStatus.FINISHED ); 
    CashInvoice cashinvoice1 = new CashInvoice (5, food, "3/3/202", customer, InvoiceStatus.FINISHED, 10); 
          
    cashinvoice.printData();
    cashinvoice1.printData(); 
    
}
      
}

