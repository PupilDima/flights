package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.entity.Destination;
import com.kovalenko.flights.provider.DestinationProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DestinationProviderImpl implements DestinationProvider {
    @Override
    public List<Destination> provideDestinations() {
        return List.of(new Destination(1, "Kyiv"),
                new Destination(2, "New York"),
                new Destination(3, "Ankara"),
                new Destination(4, "Tokyo"),
                new Destination(5, "Paris"));
    }
}
