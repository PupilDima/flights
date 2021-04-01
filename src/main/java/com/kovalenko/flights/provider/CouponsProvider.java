package com.kovalenko.flights.provider;

import com.kovalenko.flights.entity.Coupon;

import java.util.List;

public interface CouponsProvider {
    List<Coupon> provideCoupons();
}
