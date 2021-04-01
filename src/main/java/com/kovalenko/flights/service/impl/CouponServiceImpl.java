package com.kovalenko.flights.service.impl;

import com.kovalenko.flights.entity.HardcodedDataCapacitor;
import com.kovalenko.flights.provider.RandomDiscountProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl {
    private static final Logger LOG = LogManager.getLogger(CouponServiceImpl.class);

    private final RandomDiscountProvider randomDiscountProvider;
    private final HardcodedDataCapacitor hardcodedDataCapacitor;

    public CouponServiceImpl(RandomDiscountProvider randomDiscountProvider, HardcodedDataCapacitor hardcodedDataCapacitor) {
        this.randomDiscountProvider = randomDiscountProvider;
        this.hardcodedDataCapacitor = hardcodedDataCapacitor;
    }

    double processDiscount(int couponId, double ticketPrice) {
        hardcodedDataCapacitor.getCoupons().stream().filter(couponItem ->
                couponItem.getCouponId() == couponId)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Wrong coupon id: %d!", couponId)));

        LOG.error(String.format("Wrong coupon id: %d!", couponId));


        return ticketPrice * randomDiscountProvider.provideRandomDiscount();
    }
}
