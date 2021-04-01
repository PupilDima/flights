package com.kovalenko.flights.entity;

import java.util.Objects;

public class Destination {

    private int  destinationId;
    private String location;

    public Destination() {
    }

    public Destination(int destinationId, String location) {
        this.destinationId = destinationId;
        this.location = location;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Destination that = (Destination) o;

        return destinationId == that.destinationId &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationId, location);
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destinationId=" + destinationId +
                ", location='" + location + '\'' +
                '}';
    }
}
