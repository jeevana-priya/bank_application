package org.example.service;

import org.example.model.EmploymentInfo;
import org.example.model.Route;
import org.example.repository.EmploymentdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmploymentdetailsService {
    @Autowired
    private EmploymentdetailsRepository userRepository2;
    public Route saveResponse2(EmploymentInfo employmentInfo){

        userRepository2.save(employmentInfo);


        Route route = new Route();
       // route.setCustId(custId);
        route.setNextRoute("employemnt details succesfully inserted");

        return route;

    }
    public List<EmploymentInfo> getEmploymentInfo(){
        return userRepository2.findAll();
    }
    /*public EmploymentInfo getEmploymentInfo(Long id) {
        Optional<EmploymentInfo> optionalEmploymentInfo = userRepository2.findById(id);
        return optionalEmploymentInfo.orElse(null);
    }*/
}
