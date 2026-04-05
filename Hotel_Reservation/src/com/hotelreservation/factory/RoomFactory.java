package com.hotelreservation.factory;

import com.hotelreservation.model.Room;
import com.hotelreservation.util.IDGenerator;

public class RoomFactory {
    public static Room createRoom(String type, double price) {
        return new Room(IDGenerator.generateID(), type, price);
    }
}
