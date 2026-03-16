package com.xyz.moviebooking.dto;

import java.util.List;

public class LockSeatRequestDTO {

    private Long userId;
    private Long showId;
    private List<String> seats;

    public Long getUserId() { return userId; }
    public Long getShowId() { return showId; }
    public List<String> getSeats() { return seats; }
}