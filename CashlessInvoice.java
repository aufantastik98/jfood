import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus)
    {
        super(id, food, customer, invoiceStatus);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashlessInvoice(int id, Food food, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, customer, invoiceStatus);
        this.promo = promo;
        
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo()
    {
        return promo;
    }
    
    public void setPromo (Promo promo)
    {
        this.promo = promo;
    }
    
    public void setTotalPrice()
    {
        if (getPromo()!= null &&promo.getActive() == true && getFood().getPrice()>promo.getMinPrice()){
            super.totalPrice = getFood().getPrice() - promo.getDiscount();
        }
        else{
            super.totalPrice = getFood().getPrice();
        }
    }
    
  public String toString()
   
    {
        SimpleDateFormat format1 = new SimpleDateFormat("dd MMMM yyyy");
        String date1 = format1.format(getDate().getTime());
        String print;
        if (getPromo() == null || promo.getActive() == false ||getFood().getPrice()<promo.getMinPrice()){
             
            print  = "=====INVOICE====="+
                   "\nID = "+getId()+
                   "\nFood = "+getFood().getName()+
                   "\nDate = "+date1+
                   "\nCostumer = "+getCustomer().getName()+
                   "\nTotal price = "+totalPrice+
                   "\nStatus: "+ getInvoiceStatus()+
                   "\nPayment Type = "+PAYMENT_TYPE+"\n";
        }else{    
             print  = "=====INVOICE====="+
                   "\nID = "+getId()+
                   "\nFood = "+getFood().getName()+
                   "\nDate = "+date1+
                   "\nCostumer = "+getCustomer().getName()+
                   "\nPromo = "+promo.getCode()+
                   "\nTotal price = "+totalPrice+
                   "\nStatus = "+getInvoiceStatus()+
                   "\nPayment Type = "+PAYMENT_TYPE;
        }

        return print;
    }
    
    
}
