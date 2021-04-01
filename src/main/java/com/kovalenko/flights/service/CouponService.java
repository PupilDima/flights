package com.kovalenko.flights.service;

public interface CouponService {

    double processDiscount(int couponId, double ticketPrice);
}
