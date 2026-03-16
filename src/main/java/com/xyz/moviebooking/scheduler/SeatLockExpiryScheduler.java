package com.xyz.moviebooking.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SeatLockExpiryScheduler {

    @Scheduled(fixedRate = 60000)
    public void releaseExpiredSeats(){
        System.out.println("Checking expired seat locks...");
    }
}