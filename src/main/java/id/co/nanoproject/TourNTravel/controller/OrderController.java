package id.co.nanoproject.TourNTravel.controller;

import id.co.nanoproject.TourNTravel.entity.OrderReq;
import id.co.nanoproject.TourNTravel.repo.OrderRepo;
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
    @Autowired
    private OrderRepo orderRepo;

    @PostMapping("")
    public ResponseEntity<Object> orderPaket(@RequestBody OrderReq req) {
        return new ResponseEntity<>(
                orderService.orderPaket(req),
                HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity<Object> getOrderById(@PathVariable("id") int id) {
        return new ResponseEntity<>(
                orderService.findById(id),
                HttpStatus.OK
        );
    }
}
