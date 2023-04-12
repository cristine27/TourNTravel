package id.co.nanoproject.TourNTravel.service;

import id.co.nanoproject.TourNTravel.model.Paket;
import id.co.nanoproject.TourNTravel.repo.PaketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaketService {

    @Autowired
    PaketRepo repo;

    public Paket addNewPaket(Paket paket){
        return repo.save(paket);
    }

    public String findHargaById(int id){
        return repo.findHargaById(int id);
    }
}