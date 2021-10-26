package ir.maktab.BusTicket.service.impl;


import ir.maktab.BusTicket.entities.Customer;
import ir.maktab.BusTicket.entities.History;
import ir.maktab.BusTicket.repository.HistoryRepository;
import ir.maktab.BusTicket.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public void addHistory(History history){
        historyRepository.save(history);
    }

    @Override
    public String createTravelNum() {
        String travelNum = "";
        Random random = new Random();
        for(int i = 0 ; i<6;i++){
            travelNum+=random.nextInt(9);
        }
        return travelNum;
    }

    @Override
    public List<History> getAllCustomerHistory(Customer customer) {
        return historyRepository.findByCustomer(customer);
    }

    @Override
    public Optional<History> getCustomerHistory(long id) {
        return historyRepository.findById(id);
    }

    @Override
    public void deleteHistory(History history) {
        historyRepository.delete(history);
    }
}
