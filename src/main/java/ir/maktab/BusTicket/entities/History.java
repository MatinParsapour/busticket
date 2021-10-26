package ir.maktab.BusTicket.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = History.TABLE_NAME)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class History extends BaseEntity<Long>{
    public static final String TABLE_NAME = "history_table";
    private static final String TICKET =  "ticket";
    private static final String NAME =  "name";
    private static final String GENDER =  "gender";
    private static final String CUSTOMER =  "customer";
    private static final String TRAVEL_NUM =  "travel_num";



    @OneToOne
    private Ticket ticketId;

    @OneToOne
    private Customer customer;

    @Column(name = NAME)
    private String name;

    @Column(name = GENDER)
    private String gender;

    @Column(name = TRAVEL_NUM)
    private String travelNum;
}
