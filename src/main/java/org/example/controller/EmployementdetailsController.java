package org.example.controller;


import org.example.model.EmploymentInfo;
import org.example.model.Response;
import org.example.model.Route;
import org.example.service.EmploymentdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000/EmploymentInfo")
public class EmployementdetailsController {
    @Autowired
    private EmploymentdetailsService userService2;

    @PostMapping("/saveEmploymentInfo")
    public Response saveResponse2(@RequestBody Response<EmploymentInfo> responseData) {
        EmploymentInfo employmentInfo = responseData.getData();
        Route route = userService2.saveResponse2(employmentInfo);
        Response<Route> response = new Response();
        response.setData(route);
        return response;

    }
    @GetMapping("/getEmploymentInfo")
    public List<EmploymentInfo> getEmploymentInfo(){
        return userService2.getEmploymentInfo();
    }

}
