package AufaDhiyaAydan.jfood;
import java.lang.reflect.Array;
import java.util.regex.*;
import java.util.*;

public class CashlessInvoice extends Invoice
{
    private PaymentType PAYMENT_TYPE = PaymentType.CASHLESS;
    private Promo promo;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id,foods,customer);
        setTotalPrice();
    }

    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id,foods,customer);
        this.promo=promo;
        setTotalPrice();
    }

    public PaymentType getPaymentType(){
        return null;
    }

    public Promo getPromo(){
        return promo;
    }

    public void setPromo (Promo promo){
        this.promo = promo;
    }

    public void setTotalPrice(){
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
    public String toString(){

        String foodIn= "";
        for(int i=0;i<getFoods().size();i++){
            foodIn = foodIn+ getFoods().get(i).getName() + " ";
        }

        String a = "======INVOICE======\n" +
                "Food :" + foodIn;
        if(super.getDate() != null){
            a = a+ "\nDate :" + super.getDate().get(Calendar.DAY_OF_MONTH) + "-" + super.getDate().get(Calendar.MONTH) + "-"+ super.getDate().get(Calendar.YEAR) ;

        }
        a = a+
                "\nCustomer :" + super.getCustomer().getName();
        if(promo != null){
            a = a+"\nPromo :" + promo.getCode();
        }
        a = a+ "\nTotal price :" + getTotalPrice()+
                "\nStatus :" + super.getInvoiceStatus() +
                "\nPayment Type :" + PAYMENT_TYPE;

        return a;
    }
}
