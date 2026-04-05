package com.hotelreservation.repository;

import com.hotelreservation.model.Room;
import java.util.HashMap;
import java.util.Map;

public class RoomRepository {
    private Map<String, Room> roomsInfo = new HashMap<>();

    public void addRoom(Room room) {
        roomsInfo.put(room.getRoomId(), room);
    }

    public Room getRoom(String id) {
        return roomsInfo.get(id);
    }
}
