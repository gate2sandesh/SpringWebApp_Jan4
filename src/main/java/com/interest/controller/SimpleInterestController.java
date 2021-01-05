package com.interest.controller;


import com.interest.model.User;
import com.interest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class SimpleInterestController {

    @Autowired
    private UserService userService;




    @PostMapping(value = "/interest")//@RequestMapping is default GetMapping.
    //@RequestMapping(method = RequestMethod.GET)
    // @RequestMapping(method = RequestMethod.DELETE)
    //@RequestMapping(method = RequestMethod.POST)
    // @RequestMapping(method = RequestMethod.PUT)

    public ResponseEntity<Integer> interest(@RequestParam("p") int p, @RequestParam("t") int t, @RequestParam("r") int r, @RequestBody User user) {
        // int interest = (p * t * r) / 100;


        int principal = user.getPrincipal();
        int time = user.getTime();
        int rate = user.getRate();

        //int interest = userService.calculate(100, 5, 3);
        int interest = userService.calculateService(principal, time, rate);


        return ResponseEntity.ok(interest);

    }

    @GetMapping("/interest1")
    public ResponseEntity<Integer> getInterest(@RequestParam("p") int principal, @RequestParam("t") int time, @RequestParam("r") int rate) {
        // int interest = (p * t * r) / 100;


        int interest = userService.calculateService(principal, time, rate);


        return ResponseEntity.ok(interest);

    }


    @RequestMapping(value = "/oddeven")


    public ResponseEntity<String> oddOrEven(@RequestParam("a") int number) {

        String outputString = "";

        if (number % 2 == 0) {
            outputString = "The number is even";

        } else {
            outputString = "The number is odd";
        }
        return ResponseEntity.ok(outputString);

    }


}
