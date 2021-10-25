package ir.maktab.BusTicket.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = History.TABLE_NAME)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class History extends BaseEntity<Long>{
    public static final String TABLE_NAME = "history_table";
    private static final String TICKET_ID =  "ticket_id";
    private static final String NAME =  "name";
    private static final String GENDER =  "gender";
    private static final String ORIGIN =  "origin";
    private static final String DESTINATION =  "destination";
    private static final String DEPARTURE_DATE =  "departure_date";
    private static final String DEPARTURE_TIME =  "departure_time";
    private static final String TRAVEL_NUM =  "travel_num";


    @Column(name = TICKET_ID)
    private String ticketId;

    @Column(name = NAME)
    private String name;

    @Column(name = GENDER)
    private String gender;

    @Column(name = ORIGIN)
    private String origin;

    @Column(name = DESTINATION)
    private String destination;

    @Column(name = DEPARTURE_DATE)
    private String departureDate;

    @Column(name = DEPARTURE_TIME)
    private String departureTime;

    @Column(name = TRAVEL_NUM)
    private String travelNum;
}
