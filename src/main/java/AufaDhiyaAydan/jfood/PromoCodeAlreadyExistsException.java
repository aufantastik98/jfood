package AufaDhiyaAydan.jfood;
public class PromoCodeAlreadyExistsException extends Exception{
    private Promo promo_error;

    PromoCodeAlreadyExistsException(Promo promo_input){
        super("Promo Code: ");
        promo_error = promo_input;
    }

    public String getMessage(){
        return super.getMessage() + promo_error.getCode() + " already exist.";
    }
}