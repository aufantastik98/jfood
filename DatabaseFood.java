
/**
 * Write a description of class DatabaseFood here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
 */
// Ini merupakan class buat DatabaseFood
public class DatabaseFood
{
    // instance variables - replace the example below with your own
    private static String[] listFood;
      
   /** 
     *constructor ini digunakan untuk inputan listFood dari DatabaseFood dimana nilai ini tidak dapat dikembalikan
     *@param listFood merupakan variabel listFood dari DatabaseFood yang bertype String
     */ 
   
    public static boolean addFood (Food food)
    {
     /* @return true, ini merupakan aksesor yang digunakan untuk methode exit
         * *
         * *
         */   
       return true; 
    }
    
    public static boolean removeFood (Food food)
    {
        /* @return true, ini merupakan aksesor yang digunakan untuk methode exit
         * *
         * *
         */
        return true;
    }
    
    public static Food getFood ()
    {
        return null;
    }
    
    public static String[] getlistFood ()
    {
        /* @return listFood, ini merupakan fungsi mengembalikan variable listFood
         * *
         * *
         */
        return listFood;
    }
  
}
