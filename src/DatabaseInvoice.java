import java.util.ArrayList;
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
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

    public static Invoice GetInvoiceById(int id) {
        boolean checker = false;
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getId() == id) {
                checker = true;
                return INVOICE_DATABASE.get(i);

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


    public static boolean addInvoice(Invoice invoice) {
        boolean checker = false;

        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getCustomer().getId() == invoice.getCustomer().getId()) {

                if (INVOICE_DATABASE.get(i).getInvoiceStatus() == InvoiceStatus.ONGOING) {
                    checker = true;
                    break;

                }

            }

        }
        if (checker == false) {
            INVOICE_DATABASE.add(invoice);
            lastId = invoice.getId();
            return true;
        }

        return false;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {


        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.get(i).setInvoiceStatus(invoiceStatus);

                return true;

            }

        }
        return false;

    }

    public static boolean removeInvoice(int id) {
        boolean checker = false;
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (INVOICE_DATABASE.get(i).getId() == id) {
                checker = true;
                INVOICE_DATABASE.remove(i);
                return true;

            }

        }

        return false;
    }
}