package com.hotelreservation.service;

import com.hotelreservation.model.Customer;
import com.hotelreservation.model.Room;
import com.hotelreservation.model.Reservation;
import java.util.ArrayList;

public class DataStore {
    public ArrayList<Customer> customers = new ArrayList<Customer>();
    public ArrayList<Room> rooms = new ArrayList<Room>();
    public ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public DataStore() {
        Room r1 = new Room("101", "Single", true, 50.0);
        Room r2 = new Room("102", "Double", true, 80.0);
        Room r3 = new Room("201", "Suite", true, 150.0);
        
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
    }
}
