package ir.maktab.BusTicket.controller;

import ir.maktab.BusTicket.entities.Customer;
import ir.maktab.BusTicket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add-customer")
    public String addCustomer(@Valid Customer customer, BindingResult result, Model model){
        if(result.hasErrors()){
            return "Form";
        }
        customerService.addCustomer(customer);
        model.addAttribute("customer",customer);
        return "Home";
    }

    @PostMapping("/validate-customer")
    public String checkCustomer(Customer customer,Model model){
        Customer customer1 = customerService.getCustomer(customer);
        if(customer1 == null){
            return "Form";
        }else{
            model.addAttribute("customer",customer);
            return "Home";
        }
    }
}
