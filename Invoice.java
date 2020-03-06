
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
    private PaymentType paymentType;
    private InvoiceStatus status;
    
    /** 
     *constructor ini digunakan untuk inputan id, idFood, totalPrice, date, dan customer dari invoice dimana nilai ini tidak dapat dikembalikan
     *@param id merupakan variabel id dari invoice yang bertype int
     *@param idFood merupakan variabel idFood dari invoice yang bertype int
     *@param totalPrice merupakan totalPrice dari invoice yang bertype int
     *@param date merupakan date dari invoice yang bertype string
     *@param cutomer merupakan customer dari invoice yang class tersebut merujuk pada class tersebut
     */
    public Invoice (int id, int idFood, String date, Customer customer,int totalPrice, InvoiceStatus status) 
    {
        this.id=id;
        this.idFood=idFood;
        this.totalPrice=totalPrice;
        this.date=date;
        this.customer=customer;
        this.status=status;
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
    
    public PaymentType getPaymentType()
    {
        return paymentType;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return null;
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
    
    public void setPaymentType (PaymentType paymentType)
    {
        this.paymentType=paymentType;
    }
    
    public void setInvoiceStatus (InvoiceStatus status)
    {
        this.status=status;
    }
    
    public void printData()
    {
       System.out.println("======INVOICE=====");
        System.out.println("ID:" +id);
        System.out.println("FOOD ID:" +idFood);
        System.out.println("Date:" +date);
        System.out.println("Customer:" +customer.getName());
        System.out.println("Total Price:" +totalPrice);
        System.out.println("Status:" +status);
           }
        
        
        
    
    

}
