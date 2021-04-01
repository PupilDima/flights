package com.kovalenko.flights.controller;

import com.kovalenko.flights.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/vacant-ticket/{ticketId}")
    boolean isTicketVacant(@PathVariable int ticketId) {
        return ticketService.isTicketVacant(ticketId);
    }

    @GetMapping("/check-baggage/{destinationId}/{baggageId}")
    boolean checkBaggage(@PathVariable int destinationId, @PathVariable int baggageId) {
        return ticketService.checkBaggage(destinationId, baggageId);
    }
}
