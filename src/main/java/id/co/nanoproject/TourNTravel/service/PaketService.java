package id.co.nanoproject.TourNTravel.service;

import id.co.nanoproject.TourNTravel.model.Paket;
import id.co.nanoproject.TourNTravel.repo.PaketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaketService {

    @Autowired
    PaketRepo repo;

    public List<Paket> getAllPaket(){
        return repo.findAll();
    }
    public Paket addNewPaket(Paket paket){
        return repo.save(paket);
    }

    public String findHargaById(int id){
        return repo.findHargaById(id);
    }
}
