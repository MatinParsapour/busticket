package ir.maktab.BusTicket.service.impl;


import ir.maktab.BusTicket.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceImpl {

    @Autowired
    private HistoryRepository historyRepository;
}
