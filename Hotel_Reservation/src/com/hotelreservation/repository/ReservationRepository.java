package com.hotelreservation.repository;

import com.hotelreservation.model.Reservation;
import java.util.HashMap;
import java.util.Map;

public class ReservationRepository {
    private Map<String, Reservation> reservationsInfo = new HashMap<>();

    public void addReservation(Reservation reservation) {
        reservationsInfo.put(reservation.getReservationId(), reservation);
    }

    public Reservation getReservation(String id) {
        return reservationsInfo.get(id);
    }

    public void removeReservation(String id) {
        reservationsInfo.remove(id);
    }
}
