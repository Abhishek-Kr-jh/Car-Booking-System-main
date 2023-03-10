package com.ab.cbs.controller;

import com.ab.cbs.entity.DriverDetails;
import com.ab.cbs.service.DriverDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DriverDetailsController {

    private static final Logger logger = LoggerFactory.getLogger(DriverDetailsController.class);

    @Autowired
    DriverDetailsService driverDetailsService;

    @PostMapping("/saveDriverDetails")
    public ResponseEntity<String> saveDriverDetails(@RequestBody DriverDetails driverDetails) {
        try {
            driverDetailsService.saveDriverDetails(driverDetails);
            return new ResponseEntity<>("Driver saved successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error while saving Driver ", e);
            return new ResponseEntity<>("facing issue while saving driver", HttpStatus.EXPECTATION_FAILED);
        }

    }

    @GetMapping("/findByDriverName/{name}")
    public DriverDetails findByDriverName(@PathVariable String name) {
        return driverDetailsService.findByDriverName(name);
    }

    @GetMapping("/getAllDriverDetails")
    public ResponseEntity<List<DriverDetails>> getAllDriverDetails() {
        return new ResponseEntity<>(driverDetailsService.getAllDriverDetails(), HttpStatus.OK);
    }
}
