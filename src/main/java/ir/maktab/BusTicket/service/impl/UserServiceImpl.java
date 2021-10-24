package ir.maktab.BusTicket.service.impl;

import ir.maktab.BusTicket.entities.Customer;
import ir.maktab.BusTicket.entities.User;
import ir.maktab.BusTicket.repository.UserRepository;
import ir.maktab.BusTicket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
}
