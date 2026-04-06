package com.hotelreservation.model;

public class Reservation {
    private String reservationId;
    private Customer customer;
    private Room room;
    private int numberOfNights;

    public Reservation(String reservationId, Customer customer, Room room, int numberOfNights) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    @Override
    public String toString() {
        double totalCost = room.getPrice() * numberOfNights;
        
        return "Reservation ID: " + reservationId + "\n" +
               "  Customer Name: " + customer.getName() + "\n" +
               "  Room Booked: " + room.getRoomNumber() + "\n" +
               "  Nights: " + numberOfNights + "\n" +
               "  Total Cost: $" + totalCost;
    }
}
