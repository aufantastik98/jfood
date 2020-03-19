import java.util.*;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
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
    private Calendar joinDate;
   
    
    /** 
     *constructor ini digunakan untuk inputan id, name, email, dan password dari customer dimana nilai ini tidak dapat dikembalikan
     *@param id merupakan variabel id dari customernya yang bertype int
     *@param name merupakan variabel nama dari customer yang bertype string
     *@param email merupakan email dari customer yang bertype string
     *@param password merupakan password dari customer yang bertype string
     *@param joinDate merupakan tanggal masuk customer yang bertype string
     */
    public Customer(int id, String name, String email, String password, Calendar joinDate) 
    {
        
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.joinDate=joinDate;
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth) 
    {
        
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.joinDate=new GregorianCalendar(year, month, dayOfMonth);
            }
    
    public Customer(int id, String name, String email, String password) 
    {
        
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
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
    
   public Calendar getJoinDate () 
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
        String pattern = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                         "[a-zA-Z0-9_+&*-]+)*@"+
                         "(?:[a-zA-Z0-9-]+\\.)+[a-z"+
                         "A-Z]{2,7}$";
               Pattern p = Pattern.compile(pattern);
               Matcher m = p.matcher(email);
               if (m.find()) {
                   System.out.println("Email : " + m.group());
                   this.email = email;
                }
                else {
                    System.out.println("Email : NULL");
                    this.email = "NULL";
                }
            }
            
    public void setPassword (String password) 
    {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
               Pattern p = Pattern.compile(pattern);
               Matcher m = p.matcher(password);
               if (m.find()) {
                   System.out.println("Password : " + m.group());
                   this.password = password;
                }
                else {
                    System.out.println("Password : NULL");
                    this.password = "NULL";
                }
            }        
    
       
    public void setJoinDate (Calendar joinDate) 
    {
        this.joinDate=joinDate;
    }
    
    
    public void setJoinDate (int year, int month, int dayOfMonth) 
    {
        this.joinDate=new GregorianCalendar(year, month-1, dayOfMonth);
    }
    
    public String toString()
    {
        String stirng = "";
        if(joinDate!=null) {
         Date date = joinDate.getTime();
         SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
         String date1 = format1.format(date);
         string = "===Customer==="+"\n"+
        "Id :"+id+"\n"+
        "Name :"+name+"\n"+
        "Email :"+email+"\n"+
        "Password :"+password+"\n"+
        "Join Date :"+joinDate+"\n"
        ;
    }
    else
    {
        stirng =
        "===Customer==="+"\n"+
        "Id :"+id+"\n"+
        "Name :"+name+"\n"+
        "Email :"+email+"\n"+
        "Password :"+password+"\n"
        ;
    }
    System.out.println(string);
    return string;
}

}
