import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static PaymentType PAYMENT_TYPE;
    private int deliveryFee;

    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super (id, food, customer, invoiceStatus);
    }

    public CashInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super (id, food, customer, invoiceStatus);
        this.deliveryFee=deliveryFee;
    }
    
    public int getDeliveryFee ()
    {
       return deliveryFee; 
    }
    
    public void setDeliveryFee (int deliveryFee)
    {
       this.deliveryFee=deliveryFee;
    }
    
        
     public void setTotalPrice ()
    { 
        if (getDeliveryFee()>1)
        {
            super.totalPrice = super.getFood().getPrice() + getDeliveryFee();
        }
        else
        {
            super.totalPrice =super.getFood().getPrice();
        }
    }
    
    public String toString()
    {
        retrun string;
          }
  
}

