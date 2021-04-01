package com.kovalenko.flights.service.impl;

import com.kovalenko.flights.entity.Coupon;
import com.kovalenko.flights.entity.HardcodedDataCapacitor;
import com.kovalenko.flights.provider.RandomDiscountProvider;
import com.kovalenko.flights.service.CouponService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {

    private static final Logger LOG = LogManager.getLogger(CouponServiceImpl.class);

    private final RandomDiscountProvider randomDiscountProvider;
    private final HardcodedDataCapacitor hardcodedDataCapacitor;

    public CouponServiceImpl(RandomDiscountProvider randomDiscountProvider, HardcodedDataCapacitor hardcodedDataCapacitor) {
        this.randomDiscountProvider = randomDiscountProvider;
        this.hardcodedDataCapacitor = hardcodedDataCapacitor;
    }

    @Override
    public double processDiscount(int couponId, double ticketPrice) {
        Coupon coupon = hardcodedDataCapacitor.getCoupons().stream()
                .filter(couponItem -> couponItem.getCouponId() == couponId)
                .findAny().orElse(null);

        if(coupon == null) {
            LOG.error(String.format("Wrong coupon id %d: !", couponId));
            throw new IllegalArgumentException(String.format("Wrong coupon id %d: !", couponId));
        }

        return ticketPrice * randomDiscountProvider.provideRandomDiscount();
    }
}
