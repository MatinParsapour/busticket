package ir.maktab.BusTicket.service;

import ir.maktab.BusTicket.entities.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomer(Customer customer);

    Customer signedUpCustomer(String username);
}
