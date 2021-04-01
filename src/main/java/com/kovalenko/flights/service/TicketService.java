package com.kovalenko.flights.service;

import org.springframework.stereotype.Service;

@Service
public interface TicketService {

    boolean isTicketVacant(int ticketId);

    boolean checkBaggage(int destinationId, int baggageId);
}
