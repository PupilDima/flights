package com.kovalenko.flights.controller;

import com.kovalenko.flights.service.CouponService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/coupons")
public class CouponController {

    private final CouponService couponService;

    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @GetMapping("/process-discount/{couponId}/{ticketPrice}")
    String processDiscount(@PathVariable int couponId, @PathVariable double ticketPrice) {
        return String.valueOf(couponService.processDiscount(couponId, ticketPrice));
    }
}
