package AufaDhiyaAydan.jfood;
public class InvoiceNotFoundException extends Exception {
    private int invoice_error;

    InvoiceNotFoundException(int invoice_input){
        super("Invoice ID: ");
        invoice_error=invoice_input;
    }
    public String getMessage(){
        return super.getMessage()+invoice_error+" Not Found";
    }
}

