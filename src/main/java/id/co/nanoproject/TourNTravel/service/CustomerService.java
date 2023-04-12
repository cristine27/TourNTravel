package id.co.nanoproject.TourNTravel.service;

import id.co.nanoproject.TourNTravel.model.Customer;
import id.co.nanoproject.TourNTravel.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService{

    @Autowired
    CustomerRepo repo;

    public void addCustomer(Customer customer){
        repo.save(customer);
    }

    public void update(Customer customer){
        repo.save(customer);
    }
}
