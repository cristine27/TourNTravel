package id.co.nanoproject.TourNTravel.service;

import id.co.nanoproject.TourNTravel.model.Customer;
import id.co.nanoproject.TourNTravel.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService{

    @Autowired
    CustomerRepo repo;

    public List<Customer> findAll(){
        return repo.findAll();
    }

    public Customer addCustomer(Customer customer){
        return repo.save(customer);
    }

    public Customer update(Customer customer){
        return repo.save(customer);
    }

    public void deleteByid(int id){
        repo.deleteById(id);
    }

    public String findNamaById(int id){
        return repo.findNamaById(id);
    }
}
