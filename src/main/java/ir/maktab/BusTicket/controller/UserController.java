package ir.maktab.BusTicket.controller;

import ir.maktab.BusTicket.entities.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/form")
    public String signUpOrLogIn(Model model){
        model.addAttribute("customer",new Customer());
        return "Form";
    }

}
