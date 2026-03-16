package com.xyz.moviebooking.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ShowSeatInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long showId;
    private String seatNumber;
    private String status;
    private Long lockedBy;
    private LocalDateTime lockTime;
}