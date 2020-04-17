package AufaDhiyaAydan.jfood.controller;
import AufaDhiyaAydan.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController
public class InvoiceController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice(){
        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable int id){
        Invoice temp;
        try {
            temp =  DatabaseInvoice.getInvoiceById(id);
            return temp;
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping("/customer/{customerId}")
    public ArrayList<Invoice> getInvoiceByCustomerId(@PathVariable int customerId){
        ArrayList<Invoice> temp;
        temp = DatabaseInvoice.getInvoiceByCustomer(customerId);
        return temp;
    }

    @RequestMapping(value = "/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") InvoiceStatus status) {
        Invoice temp;
        if (DatabaseInvoice.changeInvoiceStatus(id, status)){
            try {
                temp = DatabaseInvoice.getInvoiceById(id);
                return temp;
            } catch (InvoiceNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@PathVariable int id) {
        try {
            if (DatabaseInvoice.removeInvoce(id)){
                return true;
            }
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @RequestMapping(value = "/createCashInvoice", method = RequestMethod.POST)
    public Invoice addCashInvoice(@RequestParam(value = "foodIdList") ArrayList<Integer> foodIdList,
                                  @RequestParam(value = "customerId") int customerId,
                                  @RequestParam(value = "deliveryFee") int deliveryFee) throws CustomerNotFoundException {

        ArrayList<Food> foodList = new ArrayList<>();
        Customer customer = null;
        for (Integer temp: foodIdList) {
            try {
                foodList.add(DatabaseFood.getFoodById(temp));
            } catch (FoodNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {
            customer = DatabaseCustomer.getCustomerById(customerId);
        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
        }
        Invoice input = new CashInvoice(DatabaseInvoice.getLastId() + 1, foodList,
                customer,
                deliveryFee);
        input.setTotalPrice();

        try {
            DatabaseInvoice.addInvoice(input);
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }

        Invoice temp;
        try {
            temp = DatabaseInvoice.getInvoiceById(DatabaseInvoice.getLastId());
            return temp;
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @RequestMapping(value = "/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice addCashlessInvoice(@RequestParam(value = "foodIdList") ArrayList<Integer> foodIdList,
                                      @RequestParam(value = "customerId") int customerId,
                                      @RequestParam(value = "promoCode") String promoCode){

        ArrayList<Food> foodList = new ArrayList<>();
        Customer customer = null;
        for (Integer temp: foodIdList) {
            try {
                foodList.add(DatabaseFood.getFoodById(temp));
            } catch (FoodNotFoundException e) {
                e.printStackTrace();
            }
        }

        try {
            customer = DatabaseCustomer.getCustomerById(customerId);
        } catch (CustomerNotFoundException e) {
            e.printStackTrace();
        }
        Invoice input = new CashlessInvoice(DatabaseInvoice.getLastId() + 1, foodList,
                customer,
                DatabasePromo.getPromoByCode(promoCode));
        input.setTotalPrice();

        try {
            DatabaseInvoice.addInvoice(input);
        } catch (OngoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }

        Invoice temp;
        try {
            temp = DatabaseInvoice.getInvoiceById(DatabaseInvoice.getLastId());
            return temp;
        } catch (InvoiceNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}

