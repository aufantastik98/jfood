
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
    
    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super (id, food, date, customer, invoiceStatus);
    }

    public CashlessInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, Promo promo)
    {
        super (id, food, date, customer, invoiceStatus);
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
    
    public void printData()
    {
        System.out.println("===========Invoice==========");
        System.out.println("ID = ");
        System.out.println("Food = ");
        System.out.println("Date = ");
        System.out.println("Customer =");
    }
}
