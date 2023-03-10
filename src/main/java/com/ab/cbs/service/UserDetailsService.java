package com.ab.cbs.service;

import com.ab.cbs.entity.UserDetails;
import com.ab.cbs.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    public void saveUserDetails(UserDetails userDetails) {
        userDetailsRepository.saveUserDetails(userDetails);
    }

    public UserDetails findByUserName(String name) {
        return userDetailsRepository.findByUserName(name);
    }

    public List<UserDetails> getAllDriverDetails() {
        return userDetailsRepository.getAllUser();
    }
}
