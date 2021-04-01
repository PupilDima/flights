package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.provider.DestinationProvider;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DestinationProviderImplTest {

    private final DestinationProvider destinationProvider  = new DestinationProviderImpl();

    @Test
    void provideDestinationsShouldProvideListOfDestinations() {
        assertThat(destinationProvider.provideDestinations()).isNotEmpty();
    }
}