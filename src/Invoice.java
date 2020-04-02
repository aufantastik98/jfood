import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
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
    private ArrayList<Food> foods;
    private Calendar date;
    private Customer customer;
    private InvoiceStatus invoiceStatus;
    private PaymentType paymentType;
    

    public Invoice (int id, ArrayList<Food> foods, Customer customer)
    {
        this.id=id;
        this.foods=foods;
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
    
    public ArrayList<Food> getFoods ()
    {

        return (foods);
    }
    
    public Calendar getDate ()
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
    
    public void setFoods (ArrayList<Food> foods)
    {
        this.foods=foods;
    }
    
    public void setDate (Calendar date)
    {
        this.date=date;
    }
    
    public Calendar setDate (int year, int month, int dayOfMonth)
    {
         return date;
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
