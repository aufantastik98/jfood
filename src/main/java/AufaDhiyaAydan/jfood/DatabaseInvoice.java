package AufaDhiyaAydan.jfood;
import java.util.ArrayList;
import java.util.ArrayList;

public class DatabaseInvoice {

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public DatabaseInvoice() {

    }

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) {
        for (Invoice invoice: INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getInvoiceByCustomer(int customerId) {
        boolean checker = false;
        ArrayList<Invoice> temp = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getCustomer().getId() == customerId) {
                temp.add(INVOICE_DATABASE.get(i));
                checker = true;

            }

        }
        if (checker) {
            return temp;
        }
        return temp;

    }


    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{

        for (Invoice temp: INVOICE_DATABASE) {
            if (temp.getCustomer().getId() == invoice.getCustomer().getId()
                    && temp.getInvoiceStatus().equals(InvoiceStatus.ONGOING)) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }

        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;

    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        for (Invoice invoice: INVOICE_DATABASE) {
            if (invoice.getId() == id && invoice.getInvoiceStatus().equals(InvoiceStatus.ONGOING)){
                invoice.setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoce(int id) throws InvoiceNotFoundException{
        for (Invoice invoice: INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
