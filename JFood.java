
public class JFood
{
    
    public static void main(String[] args) {
       
    Location location1 = new Location ("Bandung", "Jawa Barat", "Dingin");
   
    Seller seller1 = new Seller (11, "Aufa", "aufa@gmail.com", "081908921959", location1);
   
    Food food = new Food(12345, 19000, "Apel", FoodCategory.COFFEE, seller1);
     
    
    food.printData();
     
     
     
     
    
}
      
}

