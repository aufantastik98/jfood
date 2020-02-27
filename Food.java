
/**
 * Write a description of class Food here.
 *
 * @author Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
public class Food
{
    // instance variables - replace the example below with your own
    private int id, price;
    private String name, category;
    private Seller seller;
    
    
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
        return (id);
    }
    
    public String getName ()
    {
        return (name);
    }
    
    public Seller getSeller ()
    {
        return (seller);
    }
    
    public int getPrice ()
    {
        return (price);
    }
    
    public String getCategory ()
    {
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
