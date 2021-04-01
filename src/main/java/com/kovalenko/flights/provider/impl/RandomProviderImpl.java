package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.provider.RandomProvider;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomProviderImpl implements RandomProvider {

    @Override
    public int provideRandomNum(int bound) {
        return new Random().nextInt(bound);
    }
}
