
/**
 * Write a description of class Customer here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
 */


// Ini merupakan class buat customer 

public class Customer
{
    // instance variables - replace the example below with your own
    private int id; 
    private String name;
    private String email;
    private String password;
    private String joinDate;
    
    /** 
     *constructor ini digunakan untuk inputan id, name, email, dan password dari customer dimana nilai ini tidak dapat dikembalikan
     *@param id merupakan variabel id dari customernya yang bertype int
     *@param name merupakan variabel nama dari customer yang bertype string
     *@param email merupakan email dari customer yang bertype string
     *@param password merupakan password dari customer yang bertype string
     *@param joinDate merupakan tanggal masuk customer yang bertype string
     */
    public Customer(int id, String name, String email, String password, String joinDate) 
    {
        
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.joinDate=joinDate;
    }
    
    public int getID() 
    {
        /* @return id, fungsi ini merupakan fungsi mengembalikan variable id
         * *
         * *
         */
        return (id);
    } 
    
    public String getName()
    {
        /* @return name, fungsi ini merupakan fungsi mengembalikan variable name
         * *
         * *
         */
        return (name);
    }
    
    public String getEmail()
    {
        /* @return email, fungsi ini merupakan fungsi mengembalikan variable email
         * *
         * *
         */
        return (email);
    }
    
    public String getPassword() 
    {
        /* @return password, fungsi ini merupakan fungsi mengembalikan variable password
         * *
         * *
         */
        return (password);
    }
    
    public String getJoinDate () 
    {
        /* @return joinDate, fungsi ini merupakan fungsi mengembalikan variable joinDate
         * *
         * *
         */
        return (joinDate);
    }
    
    public void setid (int id) 
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
    
    public void setPassword (String password) 
    {
        this.password=password;
    }
    
    public void setJoinDate (String joinDate) 
    {
        this.joinDate=joinDate;
    }
    
    public void printData()
    {
        System.out.println(name);
    }
    
    
}
