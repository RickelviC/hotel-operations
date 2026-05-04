package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if (roomType.equalsIgnoreCase("king")){
            price = 139.00;
        }
        if (roomType.equalsIgnoreCase("double")){
            price = 124.00;
        }
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        if (isWeekend()){
            price *= .10;
        }
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return getPrice() * getPrice();
    }
}
