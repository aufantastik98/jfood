import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static PaymentType PAYMENT_TYPE;
    private Promo promo;
    
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super (id, food, customer, invoiceStatus);
    }

    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super (id, food, customer, invoiceStatus);
        this.promo=promo;
    }
    
    public PaymentType getPaymentType ()
    {
       return PAYMENT_TYPE; 
    }
    
    public Promo getPromo ()
    {
       return promo; 
    }
    
    public void setPromo (Promo promo)
    { 
        this.promo=promo;
    }
    
     public void setTotalPrice ()
    { 
        if (getPromo().getActive() == true && super.getFood().getPrice() > getPromo().getMinPrice())
        {
            super.totalPrice = super.getFood().getPrice() - getPromo().getMinPrice();
        }
        else
        {
            super.totalPrice =super.getFood().getPrice();
        }
    }
    
    public String toString()
    {
       return NULL;
    }
}
