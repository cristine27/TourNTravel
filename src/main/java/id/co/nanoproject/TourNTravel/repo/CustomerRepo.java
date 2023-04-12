package id.co.nanoproject.TourNTravel.repo;

import id.co.nanoproject.TourNTravel.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
