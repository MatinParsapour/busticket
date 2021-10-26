package ir.maktab.BusTicket.service;

import ir.maktab.BusTicket.entities.Customer;
import ir.maktab.BusTicket.entities.History;

import java.util.List;
import java.util.Optional;

public interface HistoryService {

    void addHistory(History history);

    String createTravelNum();

    List<History> getAllCustomerHistory(Customer customer);

    Optional<History> getCustomerHistory(long id);

    void deleteHistory(History history);
}
