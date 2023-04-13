package id.co.nanoproject.TourNTravel.controller;

import id.co.nanoproject.TourNTravel.model.Customer;
import id.co.nanoproject.TourNTravel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cust")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/all")
    public @ResponseBody List<Customer> allCust(){
        return service.findAll();
    }
    @GetMapping("/add")
    public @ResponseBody Customer addNewCustomer(@RequestBody Customer customer){
        return service.addCustomer(customer);
    }
    @GetMapping("/update")
    public @ResponseBody Customer updateCustomer(@RequestBody Customer customer){
        return service.update(customer);
    }
    @GetMapping("/delete")
    public String deleteCust(@RequestParam("id") int id){
        service.deleteByid(id);
        return "redirect:/cust/all";
    }
}
