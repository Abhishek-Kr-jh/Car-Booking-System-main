package com.ab.cbs.service;

import com.ab.cbs.entity.DriverDetails;
import com.ab.cbs.repository.DriverDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DriverDetailsService {

    @Autowired
    DriverDetailsRepository driverDetailsRepository;


    public static String getLocationValue(String location) {
        Map<String, String> locationMap = new HashMap<>();
        locationMap.put(("ECIL"), ("(10,1)"));
        locationMap.put(("Kompally"), ("(10,2)"));
        locationMap.put(("Kutadpally"), ("(10,3)"));
        locationMap.put(("Madhapur"), ("(10,4)"));
        locationMap.put(("Kondapur"), ("(10,5)"));
        locationMap.put(("Gachibowli"), ("(10,6)"));

        return locationMap.get(location);
    }


    public DriverDetails saveDriverDetails(DriverDetails driverDetails) {
        driverDetailsRepository.saveDriverDetails(driverDetails);
        return driverDetails;
    }

    public DriverDetails findByDriverName(String name) {
        return driverDetailsRepository.findDriverDetailsByName(name);
    }

    public List<DriverDetails> getAllDriverDetails() {
        return driverDetailsRepository.getAllDriverDetails();
    }
}
