package com.kovalenko.flights.provider.impl;

import com.kovalenko.flights.entity.Coupon;
import com.kovalenko.flights.provider.CouponsProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CouponsProviderImpl implements CouponsProvider {

    @Override
    public List<Coupon> provideCoupons() {
        return List.of(new Coupon(1, "ticket_discount1"),
                new Coupon(2, "ticket_discount2"),
                new Coupon(3, "ticket_discount3"));
    }
}
