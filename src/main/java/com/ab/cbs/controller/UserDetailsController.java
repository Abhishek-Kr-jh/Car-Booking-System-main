package com.ab.cbs.controller;

import com.ab.cbs.entity.UserDetails;
import com.ab.cbs.service.UserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserDetailsController {

    private static final Logger logger = LoggerFactory.getLogger(UserDetails.class);

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/saveUserDetails")
    public ResponseEntity<String> saveUserDetails(@RequestBody UserDetails userDetails) {
        try {
            userDetailsService.saveUserDetails(userDetails);
            return new ResponseEntity<>("User saved successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error while saving User ", e);
            return new ResponseEntity<>("facing issue while saving user", HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping("/findByUserName/{name}")
    public ResponseEntity findByUserName(@PathVariable String name) {
        UserDetails userDetails = userDetailsService.findByUserName(name);
        if (ObjectUtils.isEmpty(userDetails))
            return new ResponseEntity<>("User doesn't exist", HttpStatus.OK);
        return new ResponseEntity<>(userDetails, HttpStatus.OK);
    }

    @GetMapping("/getAllUserDetails")
    public ResponseEntity<List<UserDetails>> getAllUserDetails() {
        return new ResponseEntity<>(userDetailsService.getAllDriverDetails(), HttpStatus.OK);
    }
}
