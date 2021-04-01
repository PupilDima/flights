package com.kovalenko.flights.entity;

import com.kovalenko.flights.provider.BaggageProvider;
import com.kovalenko.flights.provider.CouponsProvider;
import com.kovalenko.flights.provider.DestinationProvider;
import com.kovalenko.flights.provider.TicketProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HardcodedDataCapacitor {

    private List<Baggage> baggage;
    private List<Coupon> coupons;
    private List<Destination> destinations;
    private List<Ticket> tickets;

    public HardcodedDataCapacitor(BaggageProvider baggageProvider, CouponsProvider couponsProvider,
                                  DestinationProvider destinationProvider, TicketProvider ticketProvider) {

        baggage = baggageProvider.provideBaggage();
        coupons = couponsProvider.provideCoupons();
        destinations = destinationProvider.provideDestinations();
        tickets = ticketProvider.provideTickets(destinations, baggage);
    }

    public List<Baggage> getBaggage() {
        return baggage;
    }

    public void setBaggage(List<Baggage> baggage) {
        this.baggage = baggage;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "HardcodedDataCapacitor{" +
                "baggage=" + baggage +
                ", coupons=" + coupons +
                ", destinations=" + destinations +
                ", tickets=" + tickets +
                '}';
    }
}
