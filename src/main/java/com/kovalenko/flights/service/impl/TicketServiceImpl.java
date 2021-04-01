package com.kovalenko.flights.service.impl;

import com.kovalenko.flights.entity.HardcodedDataCapacitor;
import com.kovalenko.flights.entity.Ticket;
import com.kovalenko.flights.entity.TicketStatus;
import com.kovalenko.flights.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final HardcodedDataCapacitor hardcodedDataCapacitor;

    public TicketServiceImpl(HardcodedDataCapacitor hardcodedDataCapacitor) {
        this.hardcodedDataCapacitor = hardcodedDataCapacitor;
    }

    @Override
    public boolean isTicketVacant(int ticketId) {
        Ticket vacantTicket = hardcodedDataCapacitor.getTickets().stream()
                .filter(ticket -> ticket.getId() == ticketId  && ticket.getTicketStatus() == TicketStatus.VACANT)
                .findAny()
                .orElse(null);

        return vacantTicket != null;
    }

    @Override
    public boolean checkBaggage(int destinationId, int baggageId) {
        Ticket vacantTicket = hardcodedDataCapacitor.getTickets().stream()
                .filter(ticket -> ticket.getDestination().getDestinationId() == destinationId &&
                        ticket.getBaggage().getBaggageId() == baggageId)
                .findAny()
                .orElse(null);

        return vacantTicket != null;
    }
}
