package com.xyz.moviebooking.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private Long userId;
    private Long showId;
    private String status;
    private Double totalAmount;
    private LocalDateTime createdTime;
}