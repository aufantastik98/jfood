package AufaDhiyaAydan.jfood;
public class EmailAlreadyExistsException extends Exception{
    private Customer customer_error;

    EmailAlreadyExistsException(Customer customer_input){
        super("Customer Emaail: ");
        customer_error = customer_input;
    }

    public String getMessage(){
        return super.getMessage() + customer_error.getEmail() + " already exist";
    }
}
