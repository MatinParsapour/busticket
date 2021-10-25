package ir.maktab.BusTicket.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = Ticket.TABLE_NAME)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseEntity<Long>{

    public static final String TABLE_NAME = "ticket_table";
    private static final String ORIGIN = "origin";
    private static final String DESTINATION = "destination";
    private static final String DEPARTURE_DATE= "departure_date";
    private static final String DEPARTURE_TIME = "departure_time";

    @Column(name = ORIGIN)
    private String origin;
    @Column(name = DESTINATION)
    private String destination;
    @Column(name = DEPARTURE_DATE)
    private String departureDate;
    @Column(name = DEPARTURE_TIME)
    private String departureTime;

}
