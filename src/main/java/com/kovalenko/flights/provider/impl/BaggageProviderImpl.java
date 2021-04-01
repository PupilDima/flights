package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.entity.Baggage;
import com.kovalenko.flights.provider.BaggageProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BaggageProviderImpl implements BaggageProvider {

    @Override
    public List<Baggage> provideBaggage() {
        return List.of(new Baggage(1, 21.1),
                new Baggage(2, 11.13),
                new Baggage(3, 5.0),
                new Baggage(4, 7.7),
                new Baggage(5, 20.6));
    }
}
