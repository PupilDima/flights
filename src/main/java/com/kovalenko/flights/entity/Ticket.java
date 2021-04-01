package com.kovalenko.flights.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {

    private int id;
    private double price;
    private LocalDateTime arrivalDateTime;
    private Destination destination;
    private Baggage baggage;
    private TicketStatus ticketStatus;

    public Ticket() {
    }

    public Ticket(int id, double price, LocalDateTime arrivalDateTime, Destination destination, Baggage baggage,
                  TicketStatus ticketStatus) {
        this.id = id;
        this.price = price;
        this.arrivalDateTime = arrivalDateTime;
        this.destination = destination;
        this.baggage = baggage;
        this.ticketStatus = ticketStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id &&
                Double.compare(ticket.price, price) == 0 &&
                Objects.equals(arrivalDateTime, ticket.arrivalDateTime) &&
                Objects.equals(baggage, ticket.baggage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, arrivalDateTime, destination, baggage);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price=" + price +
                ", arrivalDateTime=" + arrivalDateTime +
                ", destination=" + destination +
                ", baggage=" + baggage +
                ", ticketStatus=" + ticketStatus +
                '}';
    }
}

