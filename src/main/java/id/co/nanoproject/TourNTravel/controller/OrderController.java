package id.co.nanoproject.TourNTravel.controller;

import id.co.nanoproject.TourNTravel.entity.OrderReq;
import id.co.nanoproject.TourNTravel.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("")
    public ResponseEntity<Object> orderPaket(@RequestBody OrderReq req){
        return new ResponseEntity<>(
                orderService.orderPaket(req),
                HttpStatus.OK);
    }
}
