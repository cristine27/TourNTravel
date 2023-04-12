package id.co.nanoproject.TourNTravel.repo;

import id.co.nanoproject.TourNTravel.model.Paket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaketRepo extends JpaRepository<Paket, Integer> {
    String findHargaById(int id);
}
