
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
    private int id;
    protected int totalPrice;
    private Food food;
    private String date;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    private PaymentType paymentType;
    
    
    /** 
     *constructor ini digunakan untuk inputan id, idFood, totalPrice, date, dan customer dari invoice dimana nilai ini tidak dapat dikembalikan
     *@param id merupakan variabel id dari invoice yang bertype int
     *@param idFood merupakan variabel idFood dari invoice yang bertype int
     *@param totalPrice merupakan totalPrice dari invoice yang bertype int
     *@param date merupakan date dari invoice yang bertype string
     *@param cutomer merupakan customer dari invoice yang class tersebut merujuk pada class tersebut
     */
    public Invoice (int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus) 
    {
        this.id=id;
        this.food=food;
        this.date=date;
        this.customer=customer;
        this.invoiceStatus=invoiceStatus;
    }
    
    public int getId ()
    { 
        /* @return id, fungsi ini merupakan fungsi mengembalikan variable id
         * *
         * *
         */
        return (id);
    }
    
    public Food getFood ()
    {
        return (food);
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
    
    public void setFood (Food food)
    {
        this.food=food;
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
    
    public void setInvoiceStatus (InvoiceStatus invoiceStatus)
    {
        this.invoiceStatus=invoiceStatus;
    }
    
    public void printData()
    {
           }
     
}
