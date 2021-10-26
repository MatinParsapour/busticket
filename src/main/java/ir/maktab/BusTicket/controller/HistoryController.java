package ir.maktab.BusTicket.controller;


import ir.maktab.BusTicket.entities.Customer;
import ir.maktab.BusTicket.entities.History;
import ir.maktab.BusTicket.entities.Ticket;
import ir.maktab.BusTicket.service.HistoryService;
import ir.maktab.BusTicket.util.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/buy-ticket")
    public String buyTicket(History history,Model model){
        history.setCustomer(Security.getCustomer());
        history.setTicketId(Security.getTicket());
        history.setTravelNum(historyService.createTravelNum());
        historyService.addHistory(history);
        model.addAttribute("customerIs",history);
        return "TicketBought";
    }

    @GetMapping("/history")
    public String seeHistory(Model model){
        if(Security.getCustomer() == null){
            model.addAttribute("customer",new Customer());
            return "redirect:/form";
        }else{
            List<History> historyList = historyService.getAllCustomerHistory(Security.getCustomer());
            model.addAttribute("historyList",historyList);
            return "History";
        }
    }

    @PostMapping("/find-history")
    public String findHistory(String id, Model model){
        Optional<History> history = historyService.getCustomerHistory(Long.parseLong(id));
        Security.setHistory(history.get());
        model.addAttribute("history",history);
        return "SeeHistory";
    }

    @PostMapping("/cancel-ticket")
    public String cancelTicket(String id){
        Optional<History> history = historyService.getCustomerHistory(Long.parseLong(id));
        historyService.deleteHistory(history.get());
        return "redirect:/";
    }
}
