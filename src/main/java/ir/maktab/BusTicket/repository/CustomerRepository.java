package ir.maktab.BusTicket.repository;

import ir.maktab.BusTicket.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByUserNameAndPassword(String username,String password);
}
