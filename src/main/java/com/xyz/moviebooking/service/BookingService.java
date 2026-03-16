package com.xyz.moviebooking.service;

import com.xyz.moviebooking.dto.LockSeatRequestDTO;

public interface BookingService {

    String lockSeats(LockSeatRequestDTO request);
}