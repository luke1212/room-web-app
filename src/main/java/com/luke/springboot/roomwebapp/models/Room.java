package com.luke.springboot.roomwebapp.models;

public class Room {
    private long id;
    private String roomName;
    private String roomNumber;
    private String bedInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    public Room(long id, String roomName, String roomNumber, String bedInfo) {
        this.id = id;
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.bedInfo = bedInfo;
    }

    public Room() {
    }

}
