package com.ab.cbs.repository;

import com.ab.cbs.entity.DriverDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DriverDetailsRepository {

    List<DriverDetails> driverDetailsList = new ArrayList<>();

    public List<DriverDetails> getAllDriverDetails() {
        return this.driverDetailsList;
    }

    public void saveDriverDetails(DriverDetails driverDetails) {
       this.driverDetailsList.add(driverDetails);
    }

    public DriverDetails findDriverDetailsByName(String name) {
        for (DriverDetails driverDetails : driverDetailsList) {
            if (driverDetails.getName().equalsIgnoreCase(name))
                return driverDetails;
        }

       return null;
    }


}
