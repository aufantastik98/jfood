import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class CashlessInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE=PaymentType;
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

    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }

    public Promo getPromo()
    {
        return promo;
    }

    public void setPromo(Promo promo)
    {
        this.promo = promo;
    }

    public void setTotalPrice()
    {
        for (int i = 0; i <= getFoods().size(); i++)
        {
            if (promo != null && getPromo().getActive() == true && getFoods().get(i).getPrice() > getPromo().getMinPrice())
            {
                totalPrice = getFoods().get(i).getPrice() - getPromo().getDiscount();
            }
            else
            {
                totalPrice = getFoods().get(i).getPrice();
            }
        }
    }


    public String toString()
    {
        String string = "";
        for (int i = 0; i <= getFoods().size(); i++) {

            if (promo == null ||
                    promo.getActive() == false ||
                    getFoods().get(i).getPrice() < getPromo().getMinPrice()) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                LocalDateTime now = LocalDateTime.now();
                string =
                        ("================INVOICE================" +
                                "\nID: " + super.getId() +
                                "\nFood: " + super.getFoods().get(i).getName() +
                                "\nDate: " + dtf.format(now) +
                                "\nCustomer: " + super.getCustomer().getName() +
                                "\nTotal Price: " + getFoods().get(i).getPrice() +
                                "\nStatus: " + super.getInvoiceStatus() +
                                "\nPayment Type: " + PAYMENT_TYPE + "\n");
            } else {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                LocalDateTime now = LocalDateTime.now();
                string =
                        ("================INVOICE================" +
                                "\nID: " + super.getId() +
                                "\nFood: " + super.getFoods().get(i).getName() +
                                "\nDate: " + dtf.format(now) +
                                "\nCustomer: " + super.getCustomer().getName() +
                                "\nPromo : " + getPromo().getCode() +
                                "\nTotal Price: " + super.getTotalPrice() +
                                "\nStatus: " + super.getInvoiceStatus() +
                                "\nPayment Type: " + PAYMENT_TYPE + "\n");
            }

        }
        System.out.println(string);
        return string;
    }
}