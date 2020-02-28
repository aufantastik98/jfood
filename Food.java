
/**
 * Write a description of class Food here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
 */

// Ini merupakan class buat food
public class Food
{
    // instance variables - replace the example below with your own
    private int id, price;
    private String name, category;
    private Seller seller;
    
     /** 
     *constructor ini digunakan untuk inputan id, price, category, dan seller dari food dimana nilai ini tidak dapat dikembalikan
     *@param id merupakan variabel id dari foodnya yang bertype int
     *@param name merupakan variabel nama dari food yang bertype string
     *@param price merupakan price dari food yang bertype string
     *@param category merupakan category dari food yang bertype string
     *@param seller merupakan seller food yang merupakan class yang memanggil seller
     */
    
    public Food (int id, int price, String name, String category, Seller seller)
    {
        this.id=id;
        this.price=price;
        this.name=name;
        this.category=category;
        this.seller=seller;        
    }
    
    public int getID ()
    {
        /* @return id, fungsi ini merupakan fungsi mengembalikan variable id
         * *
         * *
         */
        return (id);
    }
    
    public String getName ()
    { 
        /* @return name, fungsi ini merupakan fungsi mengembalikan variable name
         * *
         * *
         */
        return (name);
    }
    
    public Seller getSeller ()
    {
        /* @return seller, fungsi ini merupakan fungsi mengembalikan variable seller
         * *
         * *
         */
        return (seller);
    }
    
    public int getPrice ()
    {
        /* @return price, fungsi ini merupakan fungsi mengembalikan variable price
         * *
         * *
         */
        return (price);
    }
    
    public String getCategory ()
    {
        /* @return category, fungsi ini merupakan fungsi mengembalikan variable category
         * *
         * *
         */
        return (category);
    }
    
    public void setId (int id)
    {
        this.id=id;
    }
    
    public void setName (String name)
    {
        this.name=name;
    }
    
    public void setSeller(Seller seller)
    {
        this.seller=seller;
    }
    
    public void setPrice (int price)
    {
        this.price=price;
    }
    
    public void setCategory (String category)
    {
        this.category=category;
    }
    
    public void printData ()
    {
    }
    }
