import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
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
    private Pattern pattern;
    private Matcher mathcer;

    public Customer(int id, String name, String email, String password, Calendar joinDate) 
    {
        
         this.id = id;
        this.name = name;
       String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern emailPattern = Pattern.compile(emailRegex);
            Matcher emailMatcher = emailPattern.matcher(email);
            if(emailMatcher.matches())
            {
                this.email=email;
            }
            else 
            {
                this.email="";
            }
            String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
            Pattern passwordPattern = Pattern.compile(passwordRegex);
            Matcher passwordMatcher = passwordPattern.matcher(password);
            if(passwordMatcher.matches())
            {
                this.password=password;
            }
            else 
            {
                this.password="";
            }
            this.joinDate=joinDate;
    }
    
    public Customer(int id, String name, String email, String password, int year, int month, int dayOfMonth) 
    {
        
        this.id = id;
        this.name = name;
        String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern emailPattern = Pattern.compile(emailRegex);
            Matcher emailMatcher = emailPattern.matcher(email);
            if(emailMatcher.matches())
            {
                this.email=email;
            }
            else 
            {
                this.email="";
            }
            String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
            Pattern passwordPattern = Pattern.compile(passwordRegex);
            Matcher passwordMatcher = passwordPattern.matcher(password);
            if(passwordMatcher.matches())
            {
                this.password=password;
            }
            else 
            {
                this.password="";
            }
            this.joinDate=joinDate;
            }
    
    public Customer(int id, String name, String email, String password) 
    {
        
          this.id = id;
        this.name = name;
        String emailRegex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern emailPattern = Pattern.compile(emailRegex);
            Matcher emailMatcher = emailPattern.matcher(email);
            if(emailMatcher.matches())
            {
                this.email=email;
            }
            else 
            {
                this.email="";
            }
            String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
            Pattern passwordPattern = Pattern.compile(passwordRegex);
            Matcher passwordMatcher = passwordPattern.matcher(password);
            if(passwordMatcher.matches())
            {
                this.password=password;
            }
            else 
            {
                this.password="";
            }
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
          String regex = "^[\\w&*_~]+(?:\\.[\\w&*_~]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
     
            Pattern pattern = Pattern.compile(regex);
     
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches())
            {
                this.email=email;
                System.out.println(email+"Email: ");
            }
            else 
            {
                this.email="";
                System.out.println(email+"NULL");
            }
            }
            
          
    public void setPassword (String password) 
    {
         String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
     
        Pattern pattern = Pattern.compile(regex);
 
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches())
        {
            this.password=password;
            System.out.println(password+"Password: ");
        }
        else 
        {
            this.password="";
            System.out.println(password+"NULL");
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
    
    public String toString(){
        
   
        String string = "";
        if(joinDate!=null)
        {
            Date date = joinDate.getTime();             
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            String date1 = format1.format(date);  
            string = "Customer:\n"+
                   "ID = "+id+"\n"+
                   "Nama = "+name+"\n"+
                   "Email = "+email+"\n"+
                   "Password = "+password+"\n"+
                   "Join Date = "+date1+"\n";
        }
        else
        {
            string = "Customer:\n"+
                   "ID = "+id+"\n"+
                   "Nama = "+name+"\n"+
                   "Email = "+email+"\n"+
                   "Password = "+password+"\n";
        }
        System.out.println(string);
        return string;
    }
    
 
}
