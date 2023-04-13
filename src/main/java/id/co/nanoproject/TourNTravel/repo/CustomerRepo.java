package id.co.nanoproject.TourNTravel.repo;

import id.co.nanoproject.TourNTravel.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Query("SELECT nama FROM Customer WHERE id = :id")
    String findNamaById(@Param("id") int id);
}
