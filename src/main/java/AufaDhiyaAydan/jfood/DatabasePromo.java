package AufaDhiyaAydan.jfood;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Write a description of class DatabasePromo here.
 *
 * @author Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
public class DatabasePromo
{
    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public DatabasePromo()
    {
    }

    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistsException{
    boolean samePromoCode = false;
        for (Promo buff: PROMO_DATABASE) {
            if (promo.getCode().equals(buff.getCode())) {
                samePromoCode = true;
                break;
            }
        }
        if (!samePromoCode) {
            PROMO_DATABASE.add(promo);
            lastId = promo.getId();
            return true;
        }
        throw new PromoCodeAlreadyExistsException(promo);
    }

    public boolean removePromo (int id) throws PromoNotFoundException{
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
    }

    public static boolean activatePromo(int id) {
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getId() == id) {
                promo.setActive(true);
                return true;
            }
        }
        return false;
    }

    public static boolean deactivatePromo(int id) {
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getId() == id) {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }

    public static Promo getPromoByCode(String code) {
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getCode().equals(code)) {
                return promo;
            }
        }
        return null;
    }

    public static Promo getPromoById(int id) throws PromoNotFoundException{
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getId() == id) {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);
    }
    public static ArrayList<Promo> getPromoDatabase() {
        return PROMO_DATABASE;
    }
    public static int getLastId() {
        return lastId;
    }
}