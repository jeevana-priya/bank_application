package org.example.service;


import org.example.model.EmploymentInfo;
import org.example.model.PersonalDetails;
import org.example.model.Route;
import org.example.repository.PersonladetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonladetailsService {

    @Autowired
    private PersonladetailsRepository userRepository;

    public Route saveResponse(PersonalDetails personalDetails){
        if (personalDetails == null) {
            throw new IllegalArgumentException("PersonalDetails must not be null");
        }
        System.out.println("PersonalDetails: " + personalDetails);
        userRepository.save(personalDetails);
        long custId = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        String nextRoute = "Route_" + System.currentTimeMillis();

        Route route = new Route();
        route.setCustId(custId);
        route.setNextRoute("/EmploymentInfo");

        return route;

    }
    public List<PersonalDetails> getPersonalDetails() {
        return userRepository.findAll();
    }

}
