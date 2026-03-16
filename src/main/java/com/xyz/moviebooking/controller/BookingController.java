package com.xyz.moviebooking.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @PostMapping("/lock")
    public String lockSeats(){
        return "Seats locked successfully";
    }
}