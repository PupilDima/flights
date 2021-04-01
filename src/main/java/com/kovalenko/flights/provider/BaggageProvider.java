package com.kovalenko.flights.provider;

import com.kovalenko.flights.entity.Baggage;

import java.util.List;

public interface BaggageProvider {
    List<Baggage> provideBaggage();
}
