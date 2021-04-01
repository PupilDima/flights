package com.kovalenko.flights.entity;

import java.util.Objects;

public class Baggage {

    private int baggageId;
    private double weight;

    public Baggage() {
    }

    public Baggage(int baggageId, double weight) {
        this.baggageId = baggageId;
        this.weight = weight;
    }

    public int getBaggageId() {
        return baggageId;
    }

    public void setBaggageId(int baggageId) {
        this.baggageId = baggageId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Baggage baggage = (Baggage) o;

        return baggageId == baggage.baggageId &&
                Double.compare(baggage.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(baggageId, weight);
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "baggageId=" + baggageId +
                ", weight=" + weight +
                '}';
    }
}
