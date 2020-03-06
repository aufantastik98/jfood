
public class JFood
{
    
    public static void main(String[] args) {
       
    Location location1 = new Location ("Bandung", "Jawa Barat", "Dingin");
   
    Seller seller1 = new Seller (11, "Aufa", "aufa@gmail.com", "081908921959", location1);
    
    Customer customer = new Customer (12, "Aufa", "aufa@gmail.com", "12345","12 Oktober 1998");
   
    Food food = new Food(12345, 19000, "Apel", FoodCategory.COFFEE, seller1);
     
    Invoice invoice = new Invoice(1, food.getID(), "23 Desember 2010", customer, food.getPrice() , InvoiceStatus.ONGOING);  
    
    invoice.printData();
     
    
}
      
}

