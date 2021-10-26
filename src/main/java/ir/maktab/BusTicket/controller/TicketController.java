package ir.maktab.BusTicket.controller;


import ir.maktab.BusTicket.entities.History;
import ir.maktab.BusTicket.entities.Ticket;
import ir.maktab.BusTicket.service.TicketService;
import ir.maktab.BusTicket.util.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/buy-tickets")
    public String buyTicket(String id, Model model){
        if(Security.getCustomer() == null){
            return "redirect:/form";
        }else{
            Optional<Ticket> ticket = ticketService.getTicket(Long.parseLong(id));
            Security.setTicket(ticket.get());
            model.addAttribute("history",new History());
            return "CustomerInformation";
        }
    }

    @GetMapping("/search-ticket")
    public String searchTickets(Ticket ticket,Model model){
        List<Ticket> tickets = ticketService.getSearchedTickets(ticket.getOrigin(),ticket.getDestination(),ticket.getDepartureDate());
        model.addAttribute("tickets",tickets);
        return "searchedTickets";
    }
}
