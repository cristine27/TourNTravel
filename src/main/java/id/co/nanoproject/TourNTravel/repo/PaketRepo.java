package id.co.nanoproject.TourNTravel.repo;

import id.co.nanoproject.TourNTravel.model.Paket;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaketRepo extends JpaRepository<Paket, Integer> {
    @Query(value = "SELECT harga FROM Paket WHERE id = :id", nativeQuery = true)
    String findHargaById(@Param("id") int id);
}
