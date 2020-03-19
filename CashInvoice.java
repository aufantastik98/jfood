
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

    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus)
    {
        super (id, food, date, customer, invoiceStatus);
    }

    public CashInvoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus, int deliveryFee)
    {
        super (id, food, date, customer, invoiceStatus);
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
    
    public void printData()
    {
       System.out.println("=========INVOICE==========="); 
       System.out.println("ID:" + getId());
       System.out.println("Food:" + getFood().getName());
       System.out.println("Date:" + getDate());
       System.out.println("Customer:" + getCustomer().getName());
       if(deliveryFee== 0){
        }else { System.out.println("Delivery Fee : " + deliveryFee);}
       System.out.println("Total Price:" + totalPrice);
       System.out.println("Status:" + getInvoiceStatus());
       System.out.println("Payment Type:" + PAYMENT_TYPE);
    }
    public void printData1()
    {
       System.out.println("=========INVOICE==========="); 
       System.out.println("ID:" + getId());
       System.out.println("Food:" + getFood().getName());
       System.out.println("Date:" + getDate());
       System.out.println("Customer:" + getCustomer().getName());
       if(deliveryFee== 0){
        }else { System.out.println("Delivery Fee : " + deliveryFee);}
       System.out.println("Total Price:" + totalPrice);
       System.out.println("Status:" + getInvoiceStatus());
       System.out.println("Payment Type:" + PAYMENT_TYPE);
    }
}

