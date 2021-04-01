package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.provider.CouponsProvider;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CouponsProviderImplTest {

    private final CouponsProvider couponsProvider = new CouponsProviderImpl();

    @Test
    void provideCouponsShouldProvideListOfCoupon() {
        assertThat(couponsProvider.provideCoupons()).isNotEmpty();
    }
}