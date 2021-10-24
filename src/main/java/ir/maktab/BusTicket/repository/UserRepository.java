package ir.maktab.BusTicket.repository;

import ir.maktab.BusTicket.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
