package ir.maktab.BusTicket.service.impl;

import ir.maktab.BusTicket.entities.Customer;
import ir.maktab.BusTicket.repository.CustomerRepository;
import ir.maktab.BusTicket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(Customer customer) {
        return customerRepository.findByUserNameAndPassword(customer.getUserName(),customer.getPassword());
    }

    @Override
    public Customer signedUpCustomer(String username) {
        return customerRepository.findByUserName(username);
    }
}
