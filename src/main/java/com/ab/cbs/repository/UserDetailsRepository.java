package com.ab.cbs.repository;

import com.ab.cbs.entity.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDetailsRepository {

    List<UserDetails> userDetailsList = new ArrayList<>();

    public List<UserDetails> getAllUser() {
        return this.userDetailsList;
    }

    public void saveUserDetails(UserDetails userDetails) {
        this.userDetailsList.add(userDetails);
    }

    public UserDetails findByUserName(String name) {
       for (UserDetails userDetails : userDetailsList) {
            if (userDetails.getName().equalsIgnoreCase(name))
                return userDetails;
       }
       return null;
    }
}
