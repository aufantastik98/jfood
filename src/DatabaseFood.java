import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * Write a description of class Food here.
 *
 * @author Aufa Dhiya Aydan
 * @version
 */
public class DatabaseFood
{
    private static  ArrayList<Food> FOOD_DATABASE = new ArrayList<Food>();
    private static   int lastId=0;



    public static  ArrayList<Food> getFoodDatabase (){

        return FOOD_DATABASE;
    }
    public  static int getLastId(){
        return lastId;
    }



    public static   boolean addFood(Food food){
        FOOD_DATABASE.add(food);
        lastId= food.getId()+1;
        return true;
    }
    public static  boolean removeFood(int id){

        boolean checker = false;
        for(int i=0;i<FOOD_DATABASE.size();i++){
            if(FOOD_DATABASE.get(i).getId() == id){
                checker = true;
                FOOD_DATABASE.remove(i);
                return true;

            }

        }

        return false;
    }

    public  static  Food getFoodById(int id){

        boolean checker = false;
        for(int i=0;i<FOOD_DATABASE.size();i++){
            if(FOOD_DATABASE.get(i).getId() == id){
                checker = true;
                return FOOD_DATABASE.get(i);

            }

        }

        return null;
    }

    public  static  ArrayList<Food> getFoodBySeller(int sellerId){

        boolean checker = false;
        ArrayList<Food> temp  = new ArrayList<Food>();
        for(int i=0;i<FOOD_DATABASE.size();i++){
            if(FOOD_DATABASE.get(i).getSeller().getId() == sellerId){
                temp.add(FOOD_DATABASE.get(i));
                checker = true;
            }

        }

        return null;

    }

    public  static  ArrayList<Food> getFoodByCategory(FoodCategory foodCategory){

        boolean checker = false;
        ArrayList<Food> temp  = new ArrayList<Food>();
        for(int i=0;i<FOOD_DATABASE.size();i++){
            if(FOOD_DATABASE.get(i).getCategory() == foodCategory){

                temp.add(FOOD_DATABASE.get(i));

            }

        }
        return(temp);
    }

}