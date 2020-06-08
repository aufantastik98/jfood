package AufaDhiyaAydan.jfood;
/**
 * Write a description of class FoodCategory here.
 *
 * @author Aufa Dhiya Aydan
 * @version (a version number or a date)
 */
public enum FoodCategory
{
    BEVERAGES ("Beverages"),
    COFFEE ("Coffee"),
    WESTERN ("Western"),
    SNACKS ("Snacks"),
    RICE ("Rice"),
    NOOLDLES ("Noodles"),
    BAKERY ("Bakery"),
    JAPANESE ("Japenese");
    
    private String categoryFood;
    
    FoodCategory (String categoryFood)
    {
        this.categoryFood=categoryFood;
    }
    
    public String categoryFood()
    {
        return categoryFood;
    }

    
}
