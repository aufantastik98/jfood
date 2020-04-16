package AufaDhiyaAydan.jfood;
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



    public static boolean addFood(Food food) {
if (FOOD_DATABASE.add(food)) {
            lastId = food.getId();
            return true;
        }
        return false;
    }

    public static boolean removeFood(int id) throws FoodNotFoundException{
        for (Food food: FOOD_DATABASE) {
            if (food.getId() == id) {
                FOOD_DATABASE.remove(food);
                return true;
            }
        }
        throw new FoodNotFoundException(id);
    }

    public static Food getFoodById(int id) throws FoodNotFoundException{
        for (Food food: FOOD_DATABASE) {
            if (food.getId() == id) {
                return food;
            }
        }
        throw new FoodNotFoundException(id);
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