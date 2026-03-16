package com.xyz.moviebooking.service.impl;

import com.xyz.moviebooking.dto.LockSeatRequestDTO;
import com.xyz.moviebooking.repository.ShowSeatInventoryRepository;
import com.xyz.moviebooking.service.BookingService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingServiceImpl implements BookingService {

    private final ShowSeatInventoryRepository repo;

    public BookingServiceImpl(ShowSeatInventoryRepository repo){
        this.repo = repo;
    }

    @Override
    @Transactional
    public String lockSeats(LockSeatRequestDTO request){

        int updated = repo.lockSeats(
                request.getShowId(),
                request.getSeats(),
                request.getUserId());

        if(updated != request.getSeats().size()){
            return "Seats already booked";
        }

        return "Seats locked successfully";
    }
}