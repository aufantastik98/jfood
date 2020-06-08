package AufaDhiyaAydan.jfood;
/**
 * Write a description of class PaymentType here.
 *
 * @author Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
public enum PaymentType
{
    CASHLESS ("Cashless"),
    CASH ("Cash");
    
    private String TypePayment;
    
    PaymentType (String TypePayment)
    {
        this.TypePayment=TypePayment;
    }
    
    public String TypePayment()
    {
        return TypePayment;
    }

}
