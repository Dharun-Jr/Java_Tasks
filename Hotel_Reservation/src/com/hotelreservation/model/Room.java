package com.hotelreservation.model;

public class Room {
    private String roomNumber;
    private String type;
    private boolean available;
    private double price;

    public Room(String roomNumber, String type, boolean available, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.available = available;
        this.price = price;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String status = "";
        if (available) {
            status = "Available";
        } else {
            status = "Booked";
        }
        
        return "Room num: " + roomNumber + ", Type: " + type + 
               ", Price: $" + price + ", Status: " + status;
    }
}
