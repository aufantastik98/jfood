import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{

    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int lastId=0;

    public DatabaseCustomer(){

    }
    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static boolean addCustomer(Customer customer)
    {
        // put your code here
        boolean checker = false;
        for(int i=0;i<CUSTOMER_DATABASE.size();i++){
            if(CUSTOMER_DATABASE.get(i).getEmail()== customer.getEmail()){


                checker = true;
                break;

            }

        }
        if(checker == false){
            CUSTOMER_DATABASE.add(customer);
            lastId = customer.getId();
            return true;
        }
        else{
            return false;
        }



    }
    public static int getLastId(){

        return lastId;
    }
    public static boolean removeCustomer(Customer customer)
    {

        for(int i=0;i<CUSTOMER_DATABASE.size();i++){
            if(CUSTOMER_DATABASE.get(i).getId() == customer.getId()){


                CUSTOMER_DATABASE.remove(i);
                return true;

            }

        }

        return false;



    }
    public static Customer getCustomerById(int id)
    {
        boolean checker = false;
        for(int i=0;i<CUSTOMER_DATABASE.size();i++){
            if(CUSTOMER_DATABASE.get(i).getId() == id){
                checker = true;
                return CUSTOMER_DATABASE.get(i);

            }

        }

        return null;

    }
}

