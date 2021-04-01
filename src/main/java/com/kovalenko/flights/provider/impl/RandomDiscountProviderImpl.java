package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.provider.RandomDiscountProvider;
import com.kovalenko.flights.provider.RandomProvider;
import org.springframework.stereotype.Component;

@Component
public class RandomDiscountProviderImpl implements RandomDiscountProvider {

    private final RandomProvider randomProvider;

    public RandomDiscountProviderImpl(RandomProvider randomProvider) {
        this.randomProvider = randomProvider;
    }

    @Override
    public double provideRandomDiscount() {

        double[] discounts = {0.1d, 0.5d, 0.6d};
        int randomDiscountIndex = randomProvider.provideRandomNum(3);

        return discounts[randomDiscountIndex];
    }
}
