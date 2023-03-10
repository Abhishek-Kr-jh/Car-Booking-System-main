package com.ab.cbs.entity;

import com.ab.cbs.dto.Pair;

public class DriverDetails extends UserDetails {

    private String vehileName;
    private String vehileNumber;
    private Pair currentLocation;

    public DriverDetails(String userName, Integer age, Character gender, String vehileName, String vehileNumber, Pair currentLocation) {
        super(userName, age, gender);
        this.vehileName = vehileName;
        this.vehileNumber = vehileNumber;
        this.currentLocation = currentLocation;
    }

    public DriverDetails() {}

//    public String getDriverName() {
//        return getUserName();
//    }

    public String getVehileName() {
        return vehileName;
    }

    public void setVehileName(String vehileName) {
        this.vehileName = vehileName;
    }

    public String getVehileNumber() {
        return vehileNumber;
    }

    public void setVehileNumber(String vehileNumber) {
        this.vehileNumber = vehileNumber;
    }

    public Pair getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Pair currentLocation) {
        this.currentLocation = currentLocation;
    }

}
