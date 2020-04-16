package AufaDhiyaAydan.jfood;
/**
 * Write a description of class PaymentType here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public enum PaymentType
{
    // instance variables - replace the example below with your own
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
