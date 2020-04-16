package AufaDhiyaAydan.jfood;
/**
 * Write a description of class Location here.
 *
 * @author Aufa Dhiya Aydan
 * @version 28 February 2020
 */
// Ini merupakan class buat Location
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;
    /** 
     *constructor ini digunakan untuk inputan province, description, city  dari location dimana nilai ini tidak dapat dikembalikan
     *@param province merupakan variabel province dari location yang bertype string
     *@param city merupakan variabel city dari location yang bertype string
     *@param description merupakan description dari location yang bertype string
     */    
    
    public Location(String city, String province, String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }

    public String getProvince ()
    {
        /* @return province, fungsi ini merupakan fungsi mengembalikan variable province
         * *
         * *
         */
        return (province);
    }
    
    public String getCity ()
    {
        /* @return city, fungsi ini merupakan fungsi mengembalikan variable city
         * *
         * *
         */
        return (city);
    }
    
    public String getDescription ()
    {
        /* @return description, fungsi ini merupakan fungsi mengembalikan variable decrition
         * *
         * *
         */
        return (description);
    }
    
    public void setProvince (String province)
    {
        this.province=province;
    }
    
    public void setCity (String city)
    {
        this.city=city;
    }
    
    public void setDescription (String description)
    {
    }
    
    public String toString ()
    {
        return
        "===Location==="+"\n"+
        "Province :"+province+"\n"+
        "City :"+city+"\n"+
        "Description :"+description+"\n"
        ;
    }
}
