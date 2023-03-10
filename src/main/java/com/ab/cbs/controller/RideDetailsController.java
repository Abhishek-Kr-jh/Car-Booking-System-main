package com.ab.cbs.controller;

import com.ab.cbs.dto.ChooseRideDTO;
import com.ab.cbs.dto.FindRideDTO;
import com.ab.cbs.entity.DriverDetails;
import com.ab.cbs.service.RideDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RideDetailsController {

    private static final Logger logger = LoggerFactory.getLogger(RideDetailsController.class);

    @Autowired
    RideDetailsService rideDetailsService;

    @PostMapping("/findRide")
    public ResponseEntity<List<DriverDetails>> findRide(@RequestBody FindRideDTO findRideDTO) {
        return new ResponseEntity<>(rideDetailsService.findRide(findRideDTO), HttpStatus.OK);
    }

    @PostMapping("/chooseRide")
    public ResponseEntity<DriverDetails> chooseRide(@RequestBody ChooseRideDTO chooseRideDTO) {
        return new ResponseEntity<>(rideDetailsService.chooseRide(chooseRideDTO), HttpStatus.OK);
    }
}
