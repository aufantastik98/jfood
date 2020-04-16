package AufaDhiyaAydan.jfood;
import java.util.*;
import java.text.SimpleDateFormat;
import  java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;
/**
 * Write a description of class Food here.
 *
 * @author Aufa Dhiya Aydan
 * @version
 */
public abstract class Invoice
{
    private int id;
    private ArrayList<Food> foods;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

    public Invoice(int id,ArrayList<Food> foods, Customer customer)
    {
        this.id=id;
        this.foods=foods;
        this.date= new GregorianCalendar();
        this.customer=customer;
        this.invoiceStatus=InvoiceStatus.ONGOING;
    }

    public int getId(){
        return id;
    }


    public ArrayList<Food> getFoods() {
        return foods;
    }


    public Calendar getDate(){
        return date;
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public Customer getCustomer(){
        return customer;
    }

    public abstract PaymentType getPaymentType();

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setId(int id){
        this.id = id;
    }


    public void setFood (ArrayList<Food> food) {
        this.foods = foods;
    }

    public void setDate(Calendar date){
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }

    public abstract void setTotalPrice();

    public abstract String toString();

}
