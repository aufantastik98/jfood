package AufaDhiyaAydan.jfood;
import java.util.regex.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;

/**
 * Write a description of class Customer here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
 */


public class Customer
{

    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

      public Customer(int id, String name, String email, String password,
                    Calendar joinDate )
    {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;

        setEmail(email);
        setPassword(password);

    }

    public Customer(int id, String name, String email, String password,
                    int year, int month, int dayOfMonth)
    {
        this.id = id;
        this.name = name;

        setJoinDate (year, month, dayOfMonth);
        setEmail(email);
        setPassword(password);
    }

    public Customer(int id, String name, String email, String password
    )
    {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);

        LocalDateTime now = LocalDateTime.now();
        setJoinDate(now.getYear(),now.getMonthValue(),now.getDayOfMonth());


    }

    public int getId (){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;

    }

    public String getPassword(){
        return password;
    }

    public Calendar getJoinDate(){
        return joinDate;
    }

    public void setId (int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        if (Pattern.matches("^[a-zA-Z0-9_+&*-][a-zA-Z0-9_+&*-.]+"+
                "(?:@)[a-zA-Z0-9][a-zA-Z0-9-.]+$",email)){
            this.email = email;
        }
        else{
            this.email = null;
        }

    }

    public void setPassword(String password){
        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$",password )){
            this.password = password;
        }
        else{
            this.password = null;
        }

    }

    public void setJoinDate (Calendar joinDate){
        this.joinDate = joinDate;
    }

    public void setJoinDate (int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year,month,dayOfMonth);
    }

    public String toString(){
        String tempDate = null;

        if(joinDate != null){

            tempDate = joinDate.get(Calendar.DAY_OF_MONTH) + "-" + joinDate.get(Calendar.MONTH) + "-"+ joinDate.get(Calendar.YEAR) ;
        }

        return "===============\nId = " +id+"\nNama = " +name+"\nEmail = "+ email
                + "\nPassword = " + password + "\nJoin Date = " +tempDate+"\n" ;
    }
}