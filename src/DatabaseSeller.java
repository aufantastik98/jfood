import java.util.ArrayList;

/**
 * this class is for DatabaseSeller
 *
 * @author Aufa Dhiya Aydan
 * @version
 */
public class DatabaseSeller
{
    // instance variables - replace the example below with your own
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<>();
    private static int lastId = 0;





    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public static boolean addSeller(Seller seller) {

        SELLER_DATABASE.add(seller);
        lastId = SELLER_DATABASE.indexOf(seller);
        return true;
    }

    public static boolean removeSeller(int id) {
        Seller seller = SELLER_DATABASE.get(id);
        if (seller != null) {
            SELLER_DATABASE.remove(seller);
            return true;
        }
        return false;
    }

    public static Seller getSeller(){
        return null;
    }

    public static ArrayList<Seller> getSellerDatabase(){
        return SELLER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Seller getSellerById(int id) {
        Seller seller = SELLER_DATABASE.get(id);
        if (seller != null) {
            return seller;
        } else {
            return null;
        }
    }
}