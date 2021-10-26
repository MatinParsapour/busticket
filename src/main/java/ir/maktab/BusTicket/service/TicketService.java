package ir.maktab.BusTicket.service;

import ir.maktab.BusTicket.entities.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    List<Ticket> getAllTickets();

    Optional<Ticket> getTicket(long id);
}
