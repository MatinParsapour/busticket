package ir.maktab.BusTicket.repository;

import ir.maktab.BusTicket.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Long> {

    List<Ticket> findAllByOrderByDepartureDateAsc();

    List<Ticket> findAllByOriginAndDestinationAndDepartureDateOrderByDepartureDateAsc(String origin,String destination,String departureDate);
}
