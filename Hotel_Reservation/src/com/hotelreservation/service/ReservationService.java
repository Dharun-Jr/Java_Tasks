package com.hotelreservation.service;

import com.hotelreservation.model.Guest;
import com.hotelreservation.model.Reservation;
import com.hotelreservation.model.Room;
import com.hotelreservation.repository.ReservationRepository;
import com.hotelreservation.repository.RoomRepository;
import com.hotelreservation.exception.RoomNotAvailableException;
import com.hotelreservation.util.IDGenerator;
import java.util.Date;

public class ReservationService {
    private ReservationRepository reservationRepository;
    private RoomRepository roomRepository;

    public ReservationService() {
        this.reservationRepository = new ReservationRepository();
        this.roomRepository = new RoomRepository();
    }

    public void addRoom(Room room) {
        roomRepository.addRoom(room);
    }

    public Reservation makeReservation(Guest guest, String roomId, Date checkIn, Date checkOut) throws RoomNotAvailableException {
        Room room = roomRepository.getRoom(roomId);
        if (room != null && room.isAvailable()) {
            room.setAvailable(false);
            Reservation reservation = new Reservation(IDGenerator.generateID(), guest, room, checkIn, checkOut);
            reservationRepository.addReservation(reservation);
            return reservation;
        } else {
            throw new RoomNotAvailableException("Room " + roomId + " is not available.");
        }
    }
}
