
/**
 * Write a description of class InvoiceStatus here.
 *
 * @author  Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
public enum InvoiceStatus
{
    // instance variables - replace the example below with your own
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