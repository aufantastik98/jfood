package AufaDhiyaAydan.jfood.controller;
import AufaDhiyaAydan.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", allowedHeaders = "")
@RestController
public class InvoiceController
{

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice()
    {
        ArrayList<Invoice> invoice = DatabaseInvoice.getInvoiceDatabase();
        return invoice;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id)
    {
        Invoice invoice= null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "invoice/customer/{customerId}", method = RequestMethod.GET)
    public ArrayList<Invoice> getInvoiceByCustomer(@PathVariable int customerId)
    {
        ArrayList<Invoice> invoice= DatabaseInvoice.getInvoiceByCustomer(customerId);
        return invoice;
    }


    @RequestMapping(value = "invoice/invoiceStatus/{id}", method = RequestMethod.PUT)
    public Invoice changeInvoiceStatus(@PathVariable int id,
                                       @RequestParam(value = "status") InvoiceStatus status) throws InvoiceNotFoundException
    {
        Invoice invoice = null;
        DatabaseInvoice.changeInvoiceStatus(id,status);
        try{
            invoice = DatabaseInvoice.getInvoiceById(id);
            //return invoice;
        }catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }
        return invoice;

    }

    @RequestMapping(value = "invoice/{id}", method = RequestMethod.DELETE)
    public Boolean removeInvoice(@PathVariable int id)
    {
        try{
            if(DatabaseInvoice.removeInvoice(id))
            {
                return true;
            }
        } catch (InvoiceNotFoundException e){
            System.out.println(e.getMessage());
            //return null;
        }
        return false;
    }

    @RequestMapping(value = "invoice/createCashInvoice", method = RequestMethod.POST)
    public Invoice addCashInvoice( @RequestParam(value="foodIdList") ArrayList<Integer> foodIdList,
                                   @RequestParam(value="customerId") int customerId,
                                   @RequestParam(value="deliveryFee", defaultValue = "0") int deliveryFee)
    {
        ArrayList<Food> foodList = new ArrayList<>();
        for (int food : foodIdList) {
            try {
                foodList.add(DatabaseFood.getFoodById(food));
            } catch (FoodNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            Invoice invoice = new CashInvoice(DatabaseInvoice.getLastId()+1, foodList, DatabaseCustomer.getCustomerById(customerId), deliveryFee);
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalPrice();
            return invoice;
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "invoice/createCashlessInvoice", method = RequestMethod.POST)
    public Invoice addCashlessInvoice( @RequestParam(value="foodIdList") ArrayList<Integer> foodIdList,
                                       @RequestParam(value="customerId") int customerId,
                                       @RequestParam(value="promoCode", defaultValue = " ") String promoCode)
    {
        ArrayList<Food> foodList = new ArrayList<>();
        for (int food : foodIdList) {
            try {
                foodList.add(DatabaseFood.getFoodById(food));
            } catch (FoodNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Invoice invoice = new CashlessInvoice(DatabaseInvoice.getLastId() + 1, foodList, DatabaseCustomer.getCustomerById(customerId), DatabasePromo.getPromoByCode(promoCode));
            DatabaseInvoice.addInvoice(invoice);
            invoice.setTotalPrice();
            return invoice;
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (OngoingInvoiceAlreadyExistsException e){
            System.out.println(e.getMessage());
            return null;
        }
    }


}