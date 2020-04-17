package AufaDhiyaAydan.jfood;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class JFood {

    public static void main(String[] args) {
        Location location1 = new Location("Jakarta", "DKI Jakarta", "Ibu Kota");
        Location location2 = new Location("Bandung", "Jawa Barat", "Dingin");
        Location location3 = new Location("Aceh", "Nangro Aceh", "Tsunami");

        Seller seller1 = new Seller(DatabaseSeller.getLastId() + 1, "Aufa", "Aufa@ui.ac.id", "018391829831", location1);
        Seller seller2 = new Seller(DatabaseSeller.getLastId() + 1, "Ailsa", "Ailsa@ui.ac.id", "08983981931", location2);
        Seller seller3 = new Seller(DatabaseSeller.getLastId() + 1, "Ahya", "Ahya@ui.ac.id", "0891829312", location3);

        DatabaseSeller.addSeller(seller1);
        DatabaseSeller.addSeller(seller2);
        DatabaseSeller.addSeller(seller3);

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Mie", seller1, 22000, FoodCategory.BAKERY));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Ayam", seller1, 35000, FoodCategory.BAKERY));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Bakso", seller1, 43000, FoodCategory.BAKERY));

        SpringApplication.run(JFood.class, args);
    }

}