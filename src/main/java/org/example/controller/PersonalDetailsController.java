package org.example.controller;


import org.example.model.PersonalDetails;
import org.example.model.Response;
import org.example.model.Route;
import org.example.service.PersonladetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000")
public class PersonalDetailsController {
    @Autowired
    private PersonladetailsService userService;
    @PostMapping("saveUser")
    public Response saveResponse(@RequestBody Response<PersonalDetails> responseData) {
            PersonalDetails personalDetails = responseData.getData();
            Route route = userService.saveResponse(personalDetails);
            Response<Route> response = new Response();
            response.setData(route);
            return response;

        }
       @GetMapping("getAll")
        public List<PersonalDetails> getPersonalDetails(){
           return userService.getPersonalDetails();
        }



    /*@GetMapping("/getUser")
    public Response<PersonalDetails> getPersonalDetails(@RequestParam Long userId) {
        PersonalDetails personalDetails = userService.getPersonalDetails(userId);

        Response<PersonalDetails> response = new Response<>();
        if (personalDetails != null) {
            response.setData(personalDetails);
        } else {

            response.setError("PersonalDetails not found for userId: " + userId);
        }
        return response;
    }*/


    }




