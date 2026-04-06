package com.hotelreservation.service;

import com.hotelreservation.model.Customer;
import com.hotelreservation.model.Room;
import com.hotelreservation.model.Reservation;

public class HotelService {
    private DataStore db;
    private int resCounter;

    public HotelService() {
        this.db = new DataStore();
        this.resCounter = 1;
    }

    public void createAccount(String id, String name, String email, String phone) {
        Customer c = new Customer(id, name, email, phone);
        db.customers.add(c);
        System.out.println("Account created successfully for " + name);
    }

    private Customer findCustomer(String id) {
        for (int i = 0; i < db.customers.size(); i++) {
            Customer c = db.customers.get(i);
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public void addRoom(String roomNum, String type, double price) {
        Room r = new Room(roomNum, type, true, price);
        db.rooms.add(r);
        System.out.println("Room " + roomNum + " added successfully.");
    }

    public void viewAllRooms() {
        System.out.println("=== Hotel Rooms ===");
        if (db.rooms.size() == 0) {
            System.out.println("No rooms available in the hotel.");
            return;
        }

        for (int i = 0; i < db.rooms.size(); i++) {
            System.out.println(db.rooms.get(i).toString());
        }
    }

    public void bookRoom(String customerId, String roomNum, int nights) {
        Customer c = findCustomer(customerId);
        if (c == null) {
            System.out.println("Error: Customer not found. Make sure to create an account first.");
            return;
        }

        Room roomToBook = null;
        for (int i = 0; i < db.rooms.size(); i++) {
            Room r = db.rooms.get(i);
            if (r.getRoomNumber().equals(roomNum)) {
                roomToBook = r;
                break;
            }
        }

        if (roomToBook == null) {
            System.out.println("Error: Room " + roomNum + " doesn't exist.");
            return;
        }

        if (roomToBook.isAvailable() == false) {
            System.out.println("Error: Sorry, room " + roomNum + " is already booked.");
            return;
        }

        roomToBook.setAvailable(false);
        
        String resId = "RES" + resCounter;
        resCounter++;
        
        Reservation newRes = new Reservation(resId, c, roomToBook, nights);
        db.reservations.add(newRes);
        
        System.out.println("Success! Room booked.");
        System.out.println("Your Reservation ID is: " + resId);
    }

    public void viewReservations() {
        System.out.println("=== All Reservations ===");
        if (db.reservations.size() == 0) {
            System.out.println("No reservations yet.");
        } else {
            for (int i = 0; i < db.reservations.size(); i++) {
                System.out.println(db.reservations.get(i).toString());
                System.out.println("--------------------");
            }
        }
    }
}
