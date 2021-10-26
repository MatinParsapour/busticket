package ir.maktab.BusTicket.util;

import ir.maktab.BusTicket.entities.Customer;
import ir.maktab.BusTicket.entities.Ticket;

import java.util.Optional;

public class Security {

    private static Customer customer;
    private static Ticket ticket;

    public static Ticket getTicket() {
        return ticket;
    }

    public static void setTicket(Ticket ticket) {
        Security.ticket = ticket;
    }

    public static Customer getCustomer() {
        return customer;
    }

    public static void setCustomer(Customer customer) {
        Security.customer = customer;
    }
}
