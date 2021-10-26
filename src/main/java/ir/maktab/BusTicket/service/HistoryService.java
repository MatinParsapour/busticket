package ir.maktab.BusTicket.service;

import ir.maktab.BusTicket.entities.History;

public interface HistoryService {

    void addHistory(History history);

    String createTravelNum();
}
