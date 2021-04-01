package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.entity.Baggage;
import com.kovalenko.flights.entity.Destination;
import com.kovalenko.flights.entity.Ticket;
import com.kovalenko.flights.entity.TicketStatus;
import com.kovalenko.flights.provider.TicketProvider;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class TicketProviderImpl implements TicketProvider {

    @Override
    public List<Ticket> provideTickets(List<Destination> destinations, List<Baggage> baggage) {
        return List.of(new Ticket(1, 1111, LocalDateTime.now(),destinations.get(0), baggage.get(0),
                TicketStatus.SOLD),
                new Ticket(2, 1111, LocalDateTime.now(),destinations.get(1), baggage.get(1),
                        TicketStatus.VACANT),
                new Ticket(3, 2221, LocalDateTime.now(),destinations.get(2), baggage.get(2),
                        TicketStatus.SOLD),
                new Ticket(4, 3111, LocalDateTime.now(),destinations.get(3), baggage.get(3),
                        TicketStatus.BOOKED),
                new Ticket(5, 4111, LocalDateTime.now(),destinations.get(4), baggage.get(4),
                        TicketStatus.VACANT));
    }
}
