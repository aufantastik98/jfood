import java.util.*;
/**
 * Write a description of class Food here.
 *
 * @author Aufa Dhiya Aydan
 * @version
 */
public abstract class Invoice
{
    private int id;
    private ArrayList<Food> food;
    private Calendar date;
    protected int totalPrice;
    private Customer customer;
    private InvoiceStatus invoiceStatus;

    public Invoice(int id, ArrayList<Food> food, Customer customer)
    {
        Calendar calendar = Calendar.getInstance();

        this.id = id;
        this.food = food;
        this.customer = customer;
        this.date = new GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        this.invoiceStatus = InvoiceStatus.ONGOING;
    }

    public int getId(){
        return id;
    }


    public ArrayList<Food> getFoods() {
        return food;
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
        this.food = food;
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
