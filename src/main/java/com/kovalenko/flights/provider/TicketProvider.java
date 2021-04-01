package com.kovalenko.flights.provider;

import com.kovalenko.flights.entity.Baggage;
import com.kovalenko.flights.entity.Destination;
import com.kovalenko.flights.entity.Ticket;

import java.util.List;

public interface TicketProvider {
    List<Ticket> provideTickets(List<Destination> destinations, List<Baggage> baggage);
}
