package com.ab.cbs.dto;

public class ChooseRideDTO {

    private String userName;
    private String driverName;

    public ChooseRideDTO(String userName, String driverName) {
        this.userName = userName;
        this.driverName = driverName;
    }

    public ChooseRideDTO() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
