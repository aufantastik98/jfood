/**
 * Write a description of class DatabaseFood here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
 *//**
 * Write a description of class DatabaseFood here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
/**
 * Write a description of class DatabaseFood here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
 */
// Ini merupakan class buat seller 
public class Seller
{
    // instance variables - replace the example below with your own
    private int id;
    private String name, email, phoneNumber;
    
    private Location location;
    
    /** 
     *constructor ini digunakan untuk inputan id, name, email, dan password dari customer dimana nilai ini tidak dapat dikembalikan
     *@param id merupakan variabel id dari Seller yang bertype int
     *@param name merupakan variabel nama dari Seller yang bertype string
     *@param email merupakan email dari Seller yang bertype string
     *@param phoneNumber merupakan phoneNumber dari Seller yang bertype string
     *@param location merupakan tanggal masuk Seller yang variablenya merujuk pada classnya
     */
    public Seller (int id, String name, String email, String phoneNumber, Location location)
    {
     this.id=id;
     this.name=name;
     this.email=email;
     this.phoneNumber=phoneNumber;
     this.location=location;
    }
    
    public int getId ()
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
    
    public String getEmail ()
    {
        /* @return email, fungsi ini merupakan fungsi mengembalikan variable email
         * *
         * *
         */
        return (email);
    }
    
    public String getPhoneNumber ()
    {
        /* @return phoneNumber, fungsi ini merupakan fungsi mengembalikan variable phoneNumber
         * *
         * *
         */
        return (phoneNumber);
    }
    
    public Location getLocation ()
    {
        /* @return location, fungsi ini merupakan fungsi mengembalikan variable location
         * *
         * *
         */
        return location;
    }
    
    public void setId (int id)
    {
        this.id=id;
    }
    
    public void setName (String name)
    {
        this.name=name;
    }
    
    public void setEmail (String email)
    {
        this.email=email;
    }
    
    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
    public void setLocation (Location location)
    {
        this.location=location;
    }
    
    public String toString ()
    {
        return
        "===Seller==="+"\n"+
        "Id :"+id+"\n"+
        "Name :"+name+"\n"+
        "PhoneNumber :"+phoneNumber+"\n"+
        "Location :"+ location+"\n"
        ;
    }
    
    
    
    

   
}
