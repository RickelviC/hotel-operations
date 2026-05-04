package com.pluralsight;

public class Room {
    private String numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(String numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;

    }

    public String getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }
}
