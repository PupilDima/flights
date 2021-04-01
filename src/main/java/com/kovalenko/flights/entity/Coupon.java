package com.kovalenko.flights.entity;

import java.util.Objects;

public class Coupon {

    private int couponId;
    private String code;

    public Coupon() {
    }

    public Coupon(int couponId, String code) {
        this.couponId = couponId;
        this.code = code;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Coupon coupon = (Coupon) o;

        return couponId == coupon.couponId &&
                Objects.equals(code, coupon.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, code);
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponId=" + couponId +
                ", code='" + code + '\'' +
                '}';
    }
}
