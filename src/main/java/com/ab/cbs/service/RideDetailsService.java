package com.ab.cbs.service;

import com.ab.cbs.dto.ChooseRideDTO;
import com.ab.cbs.dto.FindRideDTO;
import com.ab.cbs.entity.DriverDetails;
import com.ab.cbs.repository.DriverDetailsRepository;
import com.ab.cbs.repository.UserDetailsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class RideDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(RideDetailsService.class);

    @Autowired
    DriverDetailsRepository driverDetailsRepository;

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public List<DriverDetails> findRide(FindRideDTO findRideDTO) {
        List<DriverDetails> driverDetailsList = driverDetailsRepository.getAllDriverDetails();
        List<DriverDetails> driverDetailsList1 = new ArrayList<>();
        for (DriverDetails driverDetails : driverDetailsList) {
            if (!ObjectUtils.isEmpty(driverDetails)
                    && (Math.abs(findRideDTO.getSource().getLongitude() - driverDetails.getCurrentLocation().getLongitude()) <= 5
                    || Math.abs(findRideDTO.getSource().getLatitude() - driverDetails.getCurrentLocation().getLatitude()) <= 5)) {
                driverDetailsList1.add(driverDetails);
            }
        }
        return driverDetailsList1;
    }

    public DriverDetails chooseRide(ChooseRideDTO chooseRideDTO) {
        List<DriverDetails> driverDetailsList = driverDetailsRepository.getAllDriverDetails();

        for (DriverDetails driverDetails : driverDetailsList) {
            if (driverDetails.getName().equalsIgnoreCase(chooseRideDTO.getDriverName())) {
                return driverDetails;
            }
        }
        return null;
    }
}
