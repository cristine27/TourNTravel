package id.co.nanoproject.TourNTravel.service;

import id.co.nanoproject.TourNTravel.entity.OrderResp;
import id.co.nanoproject.TourNTravel.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    public OrderRepo repo;

    public OrderResp orderPaket(String nama, String paket){

    }
}
