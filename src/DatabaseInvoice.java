import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static int getLastId() {
        return lastId;
    }

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static Invoice getInvoiceById(int idx){
        Food food = INVOICE_DATABASE.get(idx);

        if (food != null) {
            return null;
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId) {
        ArrayList<Invoice> ret = new ArrayList<>();
        for (Invoice invoice: INVOICE_DATABASE) {
            if (invoice.getCustomer().getId() == customerId) {
                ret.add(invoice);
            }
        }
        return ret;
    }

    public static boolean addInvoice(Invoice invoice) {
              if (INVOICE_DATABASE.add(invoice)
        {
            INVOICE_DATABASE.indexOf(invoice);
            return true;
            }
            return false;
            }

    public static  boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        for(Invoice temp : INVOICE_DATABASE)
        {
            if(temp.getId() == id)
            {
                if(temp.getInvoiceStatus() == InvoiceStatus.Ongoing)
                {
                    temp.setInvoiceStatus(InvoiceStatus.Finished);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) {
        Invoice invoice = INVOICE_DATABASE.get(id);
        if (invoice != null) {
            INVOICE_DATABASE.remove(invoice);
            return true;
        }
        return false;
    }






}
