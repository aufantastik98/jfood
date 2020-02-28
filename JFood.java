
public class JFood
{
    
    public static void main(String[] args) {
        //Menset location1 dari class Location dimana kita menset juga isi dari object class Location
    Location location1 = new Location ("Bandung", "Jawa Barat", "Dingin");
    //Print variable province dari object location1
    System.out.println(location1.getProvince());
    //Menset seller1 dari class Seller dimana kita menset juga isi dari object class Seller
    Seller seller1 = new Seller (11, "Aufa", "aufa@gmail.com", "081908921959", location1);
    //Print variable name dari object seller1
    System.out.println(seller1.getName());
    seller1.setName ("Wito");
    System.out.println(seller1.getName());
    //Menset customer1 dari class Customer dimana kita menset juga isi dari object class Customer
     Customer customer1 = new Customer (10, "Aufa", "aydan@gmail.com", "aufa", "19 Agustus 2020");
    //Print variable name dari object customer1
     System.out.println(customer1.getName());
    //Menset invoice1 dari class Invoice dimana kita menset juga isi dari object class Invoice
    Invoice invoice1 = new Invoice (12, 13, 19000, "12 Agustus 2020",customer1); 
     //Print variable Id dari object invoice1
     System.out.println(invoice1.getId());
    //Menset food dari class Food dimana kita menset juga isi dari object class Food
    Food food = new Food(12345, 19000, "Apel", "Buah", seller1);
     //Print variable price dari object food
     System.out.println(food.getPrice());
     food.printData();
    
     
     
     
     
    
}
      
}

