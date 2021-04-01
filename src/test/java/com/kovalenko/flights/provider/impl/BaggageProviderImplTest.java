package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.provider.BaggageProvider;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BaggageProviderImplTest {

    private final BaggageProvider baggageProvider = new BaggageProviderImpl();

    @Test
    void provideBaggageShouldReturnListOfBaggage() {
        assertThat( baggageProvider.provideBaggage()).isNotEmpty();
    }
}