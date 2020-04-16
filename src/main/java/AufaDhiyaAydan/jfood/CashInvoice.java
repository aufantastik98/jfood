package AufaDhiyaAydan.jfood;
import java.util.regex.*;
import java.util.*;

public class CashInvoice extends Invoice
{

    private PaymentType PAYMENT_TYPE = PaymentType.CASH;
    private int deliveryFee;


    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id,foods,customer);
        setTotalPrice();
    }

    public CashInvoice(int id, ArrayList<Food> foods,  Customer customer, int deliveryFee)
    {
        super(id,foods,customer);
        this.deliveryFee=deliveryFee;
        setTotalPrice();
    }

    public PaymentType getPaymentType(){
        return null;
    }

    public int getDeliveryFee(){
        return deliveryFee;
    }

    public void setDeliveryFee (int deliveryFee){
        this.deliveryFee = deliveryFee;
    }

    public void setTotalPrice(){
        int totalFoodPrice =0;
        for(int i=0;i<getFoods().size();i++){
            totalFoodPrice = totalFoodPrice+ getFoods().get(i).getPrice() ;
        }

        if( deliveryFee != -1  ){
            super.totalPrice = totalFoodPrice + deliveryFee;

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

        a= a+"\nCustomer :" + super.getCustomer().getName();
        if(deliveryFee != 0){
            a = a+"\nDelivery Fee :"+ deliveryFee;
        }
        a = a+ "\nTotal price :" + getTotalPrice()+
                "\nStatus :" + super.getInvoiceStatus() +
                "\nPayment Type :" + PAYMENT_TYPE;

        return a;
    }
}
