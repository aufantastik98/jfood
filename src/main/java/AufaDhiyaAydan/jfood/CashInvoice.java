package AufaDhiyaAydan.jfood;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class CashInvoice here.
 *
 * @author Aufa Dhiya Aydan
 */

public class CashInvoice extends Invoice
{
    private static PaymentType PAYMENT_TYPE = PaymentType.CASH;
    private int deliveryFee;

       public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super (id, foods, customer);
    }


    public CashInvoice(int id, ArrayList<Food> foods, Customer customer,int deliveryFee)
    {
        super (id, foods, customer);
        this.deliveryFee = deliveryFee;
    }

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    public int getDeliveryFee()
    {
        return deliveryFee;
    }

    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee = deliveryFee;
    }

    public void setTotalPrice()
    {
        int foodPrice=0;
        for(int i = 0; i < super.getFoods().size(); i++){
            foodPrice+=super.getFoods().get(i).getPrice();
        }
        if(deliveryFee>0)
        {
            super.totalPrice=foodPrice+deliveryFee;
        }
        else super.totalPrice=foodPrice;
    }


    public String toString() {
        String food = " ";
        for (int i = 0; i < getFoods().size(); i++){
            food = food + getFoods().get(i).getName() + " ";
        }

        String b = "======INVOICE======\n" +
                "FOOD :" + food;
        if(super.getDate() != null){
            b = b+ "\nDate :" + super.getDate().get(Calendar.DAY_OF_MONTH) + "-" + super.getDate().get(Calendar.MONTH) + "-"+ super.getDate().get(Calendar.YEAR) ;

        }
        b = b+"\nCustomer :" + super.getCustomer().getName();
        if(deliveryFee != 0){
            b = b+"\nDelivery Fee :"+ deliveryFee;
        }
        b = b+ "\nTotal price :" + getTotalPrice()+
                "\nStatus :" + super.getInvoiceStatus() +
                "\nPayment Type :" + PAYMENT_TYPE;
        return b;
    }


}