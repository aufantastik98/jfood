package AufaDhiyaAydan.jfood;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CashlessInvoice extends Invoice
{
    private static PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;

    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);

    }

    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id, foods, customer);
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
        int totalFoodPrice =0;
        for(int i=0;i<getFoods().size();i++){
            totalFoodPrice = totalFoodPrice+ getFoods().get(i).getPrice() ;
        }

        if( promo != null){
            if (promo.getActive() == true && totalFoodPrice >promo.getMinPrice()){
                super.totalPrice = (totalFoodPrice - promo.getDiscount() );
            }
            else{
                super.totalPrice = totalFoodPrice;
            }

        }
        else{
            super.totalPrice = totalFoodPrice;
        }
    }

    public String toString()
    {
        String food = " ";
        for(int i = 0; i < getFoods().size(); i++){
            food = food + getFoods().get(i).getName() + " ";
        }
        String b = "======INVOICE======\n" +
                "FOOD :" + food;
        if(super.getDate() != null){
            b = b + "\nDate :" + super.getDate().get(Calendar.DAY_OF_MONTH) + "-" + super.getDate().get(Calendar.MONTH) + "-"+ super.getDate().get(Calendar.YEAR);
        }
        b = b + "\nCustomer :" + super.getCustomer().getName();

        if(promo != null){
            b = b+"\nPromo :" + promo.getCode();
        }
        b = b+ "\nTotal price :" + getTotalPrice()+
                "\nStatus :" + super.getInvoiceStatus() +
                "\nPayment Type :" + PAYMENT_TYPE;
        return b;
    }


}