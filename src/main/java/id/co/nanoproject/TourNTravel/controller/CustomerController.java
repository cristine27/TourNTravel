package id.co.nanoproject.TourNTravel.controller;

import id.co.nanoproject.TourNTravel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
public class CustomerController {

    @Autowired
    CustomerService service;
}
