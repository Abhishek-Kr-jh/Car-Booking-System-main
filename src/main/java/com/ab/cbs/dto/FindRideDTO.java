package com.ab.cbs.dto;

public class FindRideDTO {
    private String userName;
    private Pair source;
    private Pair destination;

    public FindRideDTO(String userName, Pair source, Pair destination) {
        this.userName = userName;
        this.source = source;
        this.destination = destination;
    }

    public FindRideDTO() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Pair getSource() {
        return source;
    }

    public void setSource(Pair source) {
        this.source = source;
    }

    public Pair getDestination() {
        return destination;
    }

    public void setDestination(Pair destination) {
        this.destination = destination;
    }
}
