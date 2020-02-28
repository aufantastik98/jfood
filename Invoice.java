
/**
 * Write a description of class Invoice here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
 */

// Ini merupakan class buat invoice
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id, idFood, totalPrice;
    private String date;
    private Customer customer;
    
    /** 
     *constructor ini digunakan untuk inputan id, idFood, totalPrice, date, dan customer dari invoice dimana nilai ini tidak dapat dikembalikan
     *@param id merupakan variabel id dari invoice yang bertype int
     *@param idFood merupakan variabel idFood dari invoice yang bertype int
     *@param totalPrice merupakan totalPrice dari invoice yang bertype int
     *@param date merupakan date dari invoice yang bertype string
     *@param cutomer merupakan customer dari invoice yang class tersebut merujuk pada class tersebut
     */
    public Invoice (int id, int idFood, int totalPrice, String date, Customer customer) 
    {
        this.id=id;
        this.idFood=idFood;
        this.totalPrice=totalPrice;
        this.date=date;
        this.customer=customer;
    }
    
    public int getId ()
    { 
        /* @return id, fungsi ini merupakan fungsi mengembalikan variable id
         * *
         * *
         */
        return (id);
    }
    
    public int getIdFood ()
    {
        /* @return idFood, fungsi ini merupakan fungsi mengembalikan variable idFood
         * *
         * *
         */
        return (idFood);
    }
    
    public String getDate ()
    {
        /* @return date, fungsi ini merupakan fungsi mengembalikan variable date
         * *
         * *
         */
        return (date);
    }
    
    public int getTotalPrice ()
    {
        /* @return totalPrice, fungsi ini merupakan fungsi mengembalikan variable totalPrice
         * *
         * *
         */
        return (totalPrice);
    }
    
    public Customer getCustomer()
    {
        /* @return customer, fungsi ini merupakan fungsi mengembalikan variable customer
         * *
         * *
         */
        return (customer);
    }
    
    public void setId (int id)
    { 
        this.id=id;
    }
    
    public void setIdFood (int idFood)
    {
        this.idFood=idFood;
    }
    
    public void setdate (String date)
    {
        this.date=date;
    }
    
    public void setTotalPrice (int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
    public void setCusomer (Customer customer)
    {
        this.customer=customer;
    }
    
    public void printData()
    {
        System.out.println(totalPrice);
    }
        
        
        
    
    

}
