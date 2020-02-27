
/**
 * Write a description of class Invoice here.
 *
 * @author Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id, idFood, totalPrice;
    private String date;
    private Customer customer;
    
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
        return (id);
    }
    
    public int getIdFood ()
    {
        return (idFood);
    }
    
    public String getDate ()
    {
        return (date);
    }
    
    public int getTotalPrice ()
    {
        return (totalPrice);
    }
    
    public Customer getCustomer()
    {
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
    }
        
        
        
    
    

}
