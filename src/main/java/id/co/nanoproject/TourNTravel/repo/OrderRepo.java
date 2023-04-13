package id.co.nanoproject.TourNTravel.repo;

import id.co.nanoproject.TourNTravel.model.OrderTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderTransaction, Integer> {
}
