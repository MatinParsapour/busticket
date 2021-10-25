package ir.maktab.BusTicket.repository;

import ir.maktab.BusTicket.entities.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History,Long> {
}
