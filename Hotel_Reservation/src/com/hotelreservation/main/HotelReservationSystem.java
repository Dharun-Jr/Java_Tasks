package com.hotelreservation.main;

import com.hotelreservation.model.Guest;
import com.hotelreservation.model.Reservation;
import com.hotelreservation.model.Room;
import com.hotelreservation.service.ReservationService;
import com.hotelreservation.factory.RoomFactory;
import com.hotelreservation.exception.RoomNotAvailableException;
import java.util.Date;

public class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System\n");

        ReservationService service = new ReservationService();

        // Create some rooms
        Room singleRoom = RoomFactory.createRoom("Single", 100.0);
        Room doubleRoom = RoomFactory.createRoom("Double", 150.0);
        
        service.addRoom(singleRoom);
        service.addRoom(doubleRoom);

        Guest guest1 = new Guest("G1", "Alice", "alice@example.com");

        try {
            System.out.println("Attempting to reserve room: " + singleRoom.getRoomId());
            Reservation res = service.makeReservation(guest1, singleRoom.getRoomId(), new Date(), new Date());
            System.out.println("Reservation successful! ID: " + res.getReservationId());
        } catch (RoomNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
