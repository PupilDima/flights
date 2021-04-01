package com.kovalenko.flights.provider;

import com.kovalenko.flights.entity.Destination;

import java.util.List;

public interface DestinationProvider {
    List<Destination> provideDestinations();
}
