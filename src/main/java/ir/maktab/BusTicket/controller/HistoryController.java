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
            return "redirect:/";
        }
    }


}
