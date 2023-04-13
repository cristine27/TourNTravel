package id.co.nanoproject.TourNTravel.controller;

import id.co.nanoproject.TourNTravel.entity.OrderResp;
import id.co.nanoproject.TourNTravel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Autowired
    private OrderService service;

    public OrderResp orderPaket(String nama, String paket){
        service.
    }
}
