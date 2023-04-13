package id.co.nanoproject.TourNTravel.controller;

import id.co.nanoproject.TourNTravel.model.Paket;
import id.co.nanoproject.TourNTravel.service.PaketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("paket")
public class PaketController {

    @Autowired
    private PaketService paketService;

    @GetMapping("")
    public ResponseEntity<List<Paket>> getAllPaket(){
        return new ResponseEntity<>(paketService.getAllPaket(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/id")
    public ResponseEntity<Object> getHargaById(@RequestParam("id") int paket_id){
        return new ResponseEntity<>(paketService.findHargaById(paket_id), HttpStatus.OK);
    }

}
