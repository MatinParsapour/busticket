package ir.maktab.BusTicket.service.impl;

import ir.maktab.BusTicket.entities.Ticket;
import ir.maktab.BusTicket.repository.TicketRepository;
import ir.maktab.BusTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAllByOrderByDepartureDateAsc();
    }
}
