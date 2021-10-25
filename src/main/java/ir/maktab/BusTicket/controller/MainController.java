package ir.maktab.BusTicket.controller;


import ir.maktab.BusTicket.entities.Ticket;
import ir.maktab.BusTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/")
    public String main(Model model){
        List<Ticket> tickets = ticketService.getAllTickets();
        model.addAttribute("tickets",tickets);
        return "Home";
    }
}
