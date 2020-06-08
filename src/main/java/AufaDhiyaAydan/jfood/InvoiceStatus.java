package AufaDhiyaAydan.jfood;
/**
 * Write a description of class InvoiceStatus here.
 *
 * @author  Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
public enum InvoiceStatus
{
   ONGOING ("Ongoing"),
    FINISHED ("Finished"),
    CANCELLED ("Cancelled");
        
    private String statusInvoice;
    
    InvoiceStatus (String statusInvoice)
    {
        this.statusInvoice=statusInvoice;
    }
    
    public String statusInvoice()
    {
        return statusInvoice;
    }

}