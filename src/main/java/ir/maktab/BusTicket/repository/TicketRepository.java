package ir.maktab.BusTicket.repository;

import ir.maktab.BusTicket.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
