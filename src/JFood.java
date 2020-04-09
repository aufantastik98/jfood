import javax.xml.crypto.Data;
import java.util.*;

public class JFood {
    public Seller mySeller;
    public Location myLoc;
    public Invoice myInvoice;
    public DatabaseFood myDbFood;
    public Customer myCustomer;
    public Food myFood;
    public JFood()
    {

    }
    public static void main(String[] args) throws EmailAlreadyExistsException, PromoCodeAlreadyExistsException, SellerNotFoundException, CustomerNotFoundException, PromoNotFoundException {

        Location location1 = new Location("Jakarta", "Jawa", "Ibu Kota");
        Seller seller1 = new Seller(2, "Zafran", "zafran@gmail.com", "085803324064", location1);
        Promo promo2 = new Promo(1, "123", 5000, 20000, true);
        ArrayList<Food> food1 = new ArrayList<Food>();
        food1.add(DatabaseFood.getFoodDatabase().get(0));
        food1.add(DatabaseFood.getFoodDatabase().get(2));
        food1.add(DatabaseFood.getFoodDatabase().get(2));

        ArrayList<Food> food2 = new ArrayList<Food>();
        food2.add(DatabaseFood.getFoodDatabase().get(1));


       // DatabaseInvoice.addInvoice( new CashInvoice(DatabaseInvoice.getLastId()+1,food1,DatabaseCustomer.getCustomerById(1),100000));
       // System.out.println("total price cash: "+DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).getTotalPrice());

        //DatabaseInvoice.addInvoice( new CashlessInvoice(DatabaseInvoice.getLastId()+1,food2,DatabaseCustomer.getCustomerById(1),DatabasePromo.getPromoByCode("GRABHORE")));
        // System.out.println("total price cashless: "+DatabaseInvoice.getInvoiceByCustomer(1).get(DatabaseInvoice.getInvoiceByCustomer(1).size()-1).getTotalPrice());

        try {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "AUFANTASTIK", 12000, 30000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "AUFANTASTIK", 22000, 40000, true));
        } catch (PromoCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

       // for (int i = 0; i < DatabasePromo.getPromoDatabase().size(); i++) {

       //     System.out.println(DatabasePromo.getPromoDatabase().get(i).toString()); }

       // for (Promo promo : DatabasePromo.getPromoDatabase()) {
         //   System.out.println(promo);

        try {
        Location location1;
        DatabaseSeller.addSeller(new Seller(1, "Aufa ", "aufa.dhiya@ui.ac.id", "081908921959", location1));
        } catch (SellerNotFoundException e) {
        System.out.println(e.getMessage());
    }

        try {
            DatabaseCustomer.addCustomer(new Customer(1, "Ailsa", "ailsa.syaffa@ui.ac.id", "Ailsa1998", 1999, 5, 3));
            DatabaseCustomer.addCustomer(new Customer(2, "Ahya", "ahya.amaniy@ui.ac.id", "Ahya2001", 2001, 6, 27));
            DatabaseCustomer.addCustomer(new Customer(3, "Anissa", "annisa@ui.ac.id", "Annisa2001", 2001, 5, 7));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

    //    for (int i = 1; i < DatabaseCustomer.getCustomerDatabase().size() + 1; i++) {

            //    System.out.println(DatabaseCustomer.getCustomerById(i).toString()); }

         try {
             DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Chicken", DatabaseSeller.getSellerById(1), 20000, FoodCategory.RICE));
             DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 2, "Bebek", DatabaseSeller.getSellerById(1), 18000, FoodCategory.RICE));
             DatabaseFood.addFood(new Food(3, "Ikan", DatabaseSeller.getSellerById(1), 19200, FoodCategory.RICE));
         } catch (SellerNotFoundException e) {
             System.out.println(e.getMessage());
         }
            //  for ( int i=0 ; i<DatabaseFood.getFoodByCategory(FoodCategory.COFFEE).size(); i++){

            //     System.out.println(DatabaseFood.getFoodByCategory(FoodCategory.COFFEE).get(i).toString()); }
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
        } }




